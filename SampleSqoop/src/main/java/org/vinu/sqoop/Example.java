package org.vinu.sqoop;
import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.commons.io.IOUtils;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.parquet.avro.AvroParquetReader;
import org.apache.parquet.avro.AvroParquetWriter;
import org.apache.parquet.hadoop.ParquetReader;
import org.apache.parquet.hadoop.ParquetWriter;
import org.apache.parquet.hadoop.metadata.CompressionCodecName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Example {
    

    private static final Logger LOGGER = LoggerFactory.getLogger(Example.class);

    private static final Schema SCHEMA;
    private static final String SCHEMA_LOCATION = "C:/Users/17635/OneDrive/Documents/Vinu/TDM/SampleSqoop/schema.avsc";
    private static final Path OUT_PATH = new Path("C:/Users/17635/OneDrive/Documents/Vinu/TDM/SampleSqoop/sample1.parquet");

    static {
        try  {
            File initialFile = new File(SCHEMA_LOCATION);
    InputStream targetStream = new FileInputStream(initialFile);
    
            SCHEMA = new Schema.Parser().parse(IOUtils.toString(targetStream, "UTF-8"));
        } catch (IOException e) {
            LOGGER.error("Can't read SCHEMA file from {}", SCHEMA_LOCATION);
            throw new RuntimeException("Can't read SCHEMA file from" + SCHEMA_LOCATION, e);
        }
    }

    public static void main(String[] args) throws IOException {
        List<GenericData.Record> sampleData = new ArrayList<>();

        GenericData.Record record = new GenericData.Record(SCHEMA);
        record.put("name", "asas");
        record.put("age", 1);
        sampleData.add(record);

        

        Example writerReader = new Example();
        writerReader.writeToParquet(sampleData, OUT_PATH);
         
    }

    @SuppressWarnings("unchecked")
    public void readFromParquet(Path filePathToRead) throws IOException {
        try (ParquetReader<GenericData.Record> reader = AvroParquetReader
                .<GenericData.Record>builder(filePathToRead)
                .withConf(new Configuration())
                .build()) {

            GenericData.Record record;
            while ((record = reader.read()) != null) {
                System.out.println(record);
            }
        }
    }

    public void writeToParquet(List<GenericData.Record> recordsToWrite, Path fileToWrite) throws IOException {
        try (ParquetWriter<GenericData.Record> writer = AvroParquetWriter
                .<GenericData.Record>builder(fileToWrite)
                .withSchema(SCHEMA)
                .withConf(new Configuration())
                .withCompressionCodec(CompressionCodecName.SNAPPY)
                .build()) {

            for (GenericData.Record record : recordsToWrite) {
                writer.write(record);
            }
        }
    }

}
