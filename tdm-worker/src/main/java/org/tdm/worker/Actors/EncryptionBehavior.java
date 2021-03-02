package org.tdm.worker.Actors;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import akka.actor.typed.Behavior;
import akka.actor.typed.javadsl.AbstractBehavior;
import akka.actor.typed.javadsl.ActorContext;
import akka.actor.typed.javadsl.Behaviors;
import akka.actor.typed.javadsl.Receive;

public class EncryptionBehavior extends AbstractBehavior<EncryptionBehavior.command> {

    public interface command extends Serializable {
    }

    public static class InitiateTask implements command {

        private static final long serialVersionUID = 1L;

        // private Connection connection;
        private String database;
        private String table;
        private String column;
        private String jobID;

        public InitiateTask(String database, String table, String column, String jobID) {
            // this.connection = connection;
            this.database = database;
            this.table = table;
            this.column = column;
            this.jobID = jobID;
        }

        public String getDatabase() {
            return database;
        }

        public String getTable() {
            return table;
        }

        public String getColumn() {
            return column;
        }

        public String getJobID() {
            return jobID;
        }

    }

    private EncryptionBehavior(ActorContext<command> context) {
        super(context);
    }

    public static Behavior<command> Create() {
        return Behaviors.setup(EncryptionBehavior::new);
    }

    @Override
    public Receive<command> createReceive() {

        return newReceiveBuilder()

                .onMessage(InitiateTask.class, msg -> {

                    /*
                     * 1. 1.Create Connection 2. Pull Data 3. Run Function 4. save to HDFS with
                     * jobID/Database/table.columln.txt
                     * 
                     */

                    return this;
                })

                .build();
    }

    public Receive<command> processColumn(InitiateTask task) {

        return newReceiveBuilder()

                .build();
    }

    public void task(InitiateTask task) throws SQLException {
        Connection connection ;
     
        connection = getConnection(task.getDatabase());
        

        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("select "+task.getColumn()+" from "+task.getTable());

        //rs.getMetaData().getColumnType(1)

        while(rs.next()){
                rs.getObject(task.getColumn());



        }




    }

    public Connection getConnection(String database) throws SQLException {

        Connection con;
    
            con = DriverManager.getConnection("jdbc:mysql://mysql-service:3306/"+database+"?user=root&password=password");
        

        return con;
    }
    
}
