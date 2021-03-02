package org.tdm.worker;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;


import org.apache.commons.io.IOUtils;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class WorkerBehavior {
    

    private static final Logger logger = LogManager.getLogger(WorkerBehavior.class);

    public JSONObject getInputJSON() throws FileNotFoundException, IOException, ParseException {
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader("/opt/input.json"));
        JSONObject jsonObject = (JSONObject) obj;
        return jsonObject;
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Loading input configuration.....");

        WorkerBehavior app = new WorkerBehavior();
        JSONObject inputJSON;
        try {
             inputJSON = app.getInputJSON();
             System.out.println("Configuration fount in path /opt/");
        } catch (IOException | ParseException e1) {
            // Handle and return this exceeption
            System.out.println("Error loading config file.");
            e1.printStackTrace();
        }
        
        String hdfsuri = "hdfs://hdfs-namenode:8020";
        
        String path="/tmp/";
        String fileName="hello.csv";
        String fileContent="hello;world";
  System.out.println("Writing HDFS file........");

        // ====== Init HDFS File System Object
        Configuration conf = new Configuration();
        // Set FileSystem URI
        conf.set("fs.defaultFS", hdfsuri);
        // Because of Maven
        conf.set("fs.hdfs.impl", org.apache.hadoop.hdfs.DistributedFileSystem.class.getName());
        conf.set("fs.file.impl", org.apache.hadoop.fs.LocalFileSystem.class.getName());
        // Set HADOOP user
        System.setProperty("HADOOP_USER_NAME", "hdfs");
        System.setProperty("hadoop.home.dir", "/");
        //Get the filesystem - HDFS
        FileSystem fs = FileSystem.get(URI.create(hdfsuri), conf);
  
        //==== Create folder if not exists
        Path workingDir=fs.getWorkingDirectory();
        Path newFolderPath= new Path(path);
        if(!fs.exists(newFolderPath)) {
           // Create new Directory
           fs.mkdirs(newFolderPath);
           logger.info("Path "+path+" created.");
        }
  
        //==== Write file
        logger.info("Begin Write file into hdfs");
        //Create a path
        Path hdfswritepath = new Path(newFolderPath + "/" + fileName);
        //Init output stream
        FSDataOutputStream outputStream=fs.create(hdfswritepath);
        //Cassical output stream usage
        outputStream.writeBytes(fileContent);
        outputStream.close();
        logger.info("End Write file into hdfs");
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
