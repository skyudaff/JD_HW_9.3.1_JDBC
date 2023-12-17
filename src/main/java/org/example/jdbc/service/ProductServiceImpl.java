package org.example.jdbc.service;

import lombok.RequiredArgsConstructor;
import org.example.jdbc.dao.ProductRepositoryImpl;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepositoryImpl repository;

    @Override
    public List<String> getProductName(String name) {
        return repository.getProductName(name);
    }
}
