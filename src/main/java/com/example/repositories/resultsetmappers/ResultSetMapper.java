package com.example.repositories.resultsetmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface ResultSetMapper<T> {
    T map(ResultSet resultset) throws SQLException;
}
