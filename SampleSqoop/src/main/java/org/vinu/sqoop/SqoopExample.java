package org.vinu.sqoop;

import com.cloudera.sqoop.SqoopOptions;
import com.cloudera.sqoop.SqoopOptions.IncrementalMode;
import com.cloudera.sqoop.tool.ImportTool;


public class SqoopExample {

    private static SqoopOptions SqoopOptions = new SqoopOptions();
        private static  String connectionString = "jdbc:mysql://mysql-service:3306/mysql";
        private static  String username = "root";
        private static  String password = "password";

    public static void main(String[] args) throws InterruptedException {
        
         SqoopOptions.setConnectString(connectionString);
    SqoopOptions.setUsername(username);
    SqoopOptions.setPassword(password);
    SqoopOptions.setTableName("db");
    int res;

    res = new ImportTool().run(SqoopOptions);
    if (res != 0) {
      throw new RuntimeException("Sqoop API Failed - return code : "+Integer.toString(res));
    }
    
System.out.println("============>"+res);


Thread.sleep(1000);

    }
    
}
