package org.example.jdbc.dao;

import java.util.List;

public interface ProductRepository {
    List<String> getProductName(String name);
}
