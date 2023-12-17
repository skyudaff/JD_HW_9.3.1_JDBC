package org.example.jdbc.dao;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import static org.example.jdbc.utils.ScriptReader.read;

@Repository
@RequiredArgsConstructor
public class ProductRepositoryImpl implements ProductRepository {
    private final NamedParameterJdbcTemplate jdbcTemplate;

    @Value("myScript.sql")
    private String scriptFileName;

    @Override
    @Transactional
    public List<String> getProductName(String name) {
        String myScript = read(scriptFileName);
        return jdbcTemplate.queryForList(myScript, Map.of("name", name), String.class);
    }
}
