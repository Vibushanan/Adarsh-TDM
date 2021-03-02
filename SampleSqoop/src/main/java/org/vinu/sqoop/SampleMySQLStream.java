package org.vinu.sqoop;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.avro.Schema;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;

public class SampleMySQLStream {

    public static void main(String[] args) throws SQLException, IOException {

        String columns = "clan_acc,rfam_acc";
        Connection con = DriverManager.getConnection("jdbc:mysql://mysql-rfam-public.ebi.ac.uk:4497/Rfam?user=rfamro");
        String sql = "select " + columns + " from clan_membership";
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter("sample"));

        fileWriter.write("course_name,student_name,timestamp,rating,comment");

        new QueryRunner().query(con, sql, new ArrayListHandler()).stream().forEach(array -> {
            int size = array.length;
            String line = String.format("\"%s\",%s", array[0], array[1]);

            try {
                fileWriter.newLine();
                fileWriter.write(line);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        });

        System.out.println(con.getMetaData().getURL());

        fileWriter.close();
        con.close();

    }

}
