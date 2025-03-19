package org.example.jdbc.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ORDERS", schema = "MY_NEW_APP")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "DATE")
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "CUSTOMER_ID", nullable = false)
    private Customer customer;

    @Column(name = "PRODUCT_NAME", length = 200)
    private String productName;

    @Column(name = "AMOUNT")
    private Integer amount;

    // Default constructor
    public Order() {}

    // Convenience constructor
    public Order(LocalDate date, Customer customer, String productName, Integer amount) {
        this.date = date;
        this.customer = customer;
        this.productName = productName;
        this.amount = amount;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
