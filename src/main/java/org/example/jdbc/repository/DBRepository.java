package org.example.jdbc.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.example.jdbc.model.Order;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Repository;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;


@Repository
public class DBRepository {
    final private String sql;

    @PersistenceContext
    final private EntityManager entityManager;

    public DBRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
        String scriptFileName = "select.sql";
        this.sql = DBRepository.read(scriptFileName);
    }

    private static String read(String scriptFileName) {
        try (InputStream is = new ClassPathResource(scriptFileName).getInputStream();
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            return bufferedReader.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Order> getProductName(String name) {
        Query query = entityManager.createNativeQuery(sql, Order.class);
        query.setParameter("name", name);
        return query.getResultList();
    }
}
