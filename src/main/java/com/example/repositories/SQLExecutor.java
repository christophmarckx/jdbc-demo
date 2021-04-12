package com.example.repositories;

import org.springframework.stereotype.Component;

import javax.naming.ConfigurationException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@Component
public class SQLExecutor {

    private Connection connection;

    public void setConnection(Connection connection){
        this.connection = connection;
    }

    public ResultSet ExecuteQuery(String query) throws SQLException, ConfigurationException {

        if(connection == null)
        {
            throw new ConfigurationException("The connection for the SQLExecuter is not set");
        }

        Statement statement = connection.createStatement();
        return statement.executeQuery(query);
    }
}
