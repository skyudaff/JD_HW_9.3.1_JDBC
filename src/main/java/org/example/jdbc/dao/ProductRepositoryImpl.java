package org.example.jdbc.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.example.jdbc.entity.Orders;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class ProductRepositoryImpl implements ProductRepository {
    @PersistenceContext
    private final EntityManager entityManager;

    @Override
    @Transactional
    public List<String> getProductName(String name) {
        return entityManager
                .createQuery("select o from Orders o join o.customers c where c.name = :name", Orders.class)
                .setParameter("name", name)
                .getResultList().stream()
                .map(Orders::getProductName)
                .collect(Collectors.toList());
    }
}
