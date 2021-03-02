package org.tdm.master.tdmmaster.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.fabric8.kubernetes.api.model.Container;
import io.fabric8.kubernetes.api.model.EnvVar;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.batch.Job;
import io.fabric8.kubernetes.api.model.batch.JobBuilder;
import io.fabric8.kubernetes.api.model.batch.JobSpec;
import io.fabric8.kubernetes.client.DefaultKubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClient;

@RestController

public class Master {
    @GetMapping("/")
    public String home() {

        return "Hello";
    }

    @PostMapping("/job")
    public void startObfuscation(@RequestBody String data) {

        JSONObject jobdata = new JSONObject(data);
        String db = jobdata.getString("database");
        JSONArray tables = jobdata.getJSONArray("table");
        Map<String, Job> alljobs = new HashMap<>();
        KubernetesClient client = new DefaultKubernetesClient();

        for (int i = 0; i < tables.length(); i++) {

            System.out.println("Creating Job for " + tables.get(i));
            alljobs.put(tables.getString(i), createJob(db, tables.getString(i), client));

        }

        //Set<String> jobentry = alljobs.keySet();

    }

    public Job createJob(String database, String table, KubernetesClient client) {

        Map<String, String> metamap = new HashMap<String, String>();

        metamap.put("name", "worker" + table);

        ObjectMeta meta = new ObjectMeta();
        meta.setLabels(metamap);
        meta.setName("worker" + table);

        List<Container> containers = new ArrayList<Container>();

        Container container = new Container();
        container.setName("worker-" + table);
        container.setImage("vibushanan/worker");

        containers.add(container);

        JobSpec spec = new JobSpec();
        EnvVar var = new EnvVar();
        var.setName("database");
        var.setValue(database);

        EnvVar var1 = new EnvVar();
        var1.setName("table");
        var1.setValue(table);

        Job job = new JobBuilder().withApiVersion("batch/v1").withMetadata(meta).withNewSpec().withNewTemplate()
                .withNewSpec().addNewContainer().withName("worker-" + table).withImage("vibushanan/worker").withEnv(var)
                .withEnv(var1).endContainer().withRestartPolicy("Never").endSpec().endTemplate().endSpec().build();

        Job job1 = client.batch().jobs().inNamespace("default").create(job);

        return job1;
    }
}
