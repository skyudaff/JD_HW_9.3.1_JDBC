package org.example.jdbc.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
@Table(schema = "netology", name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date date;
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customers customers;
    @Column(name = "product_name", nullable = false)
    private String productName;
    @Column(nullable = false)
    private int amount;
}
