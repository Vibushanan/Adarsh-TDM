package org.tdm.master.tdmmaster.SourceConnection;

import java.sql.Connection;

public interface SourceConnectionFactory {


    public Connection getSourceConnection();
    
}
