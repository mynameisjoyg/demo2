package com.example.demo2;

import org.jspecify.annotations.Nullable;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper {
    @Override
    public @Nullable Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student s = new Student();
        s.setId(rs.getInt("id"));
        s.setName(rs.getString("name"));
        return s;
    }
}
