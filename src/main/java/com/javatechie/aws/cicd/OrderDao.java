package com.javatechie.aws.cicd;


import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Stream;

@Repository
public class OrderDao {
    public List<Order> buildOrders(){
        return Stream.of(
                new Order(1, "Laptop", 65000.0, 2),
                new Order(2, "Mobile", 25000.0, 5),
                new Order(3, "Headphones", 2000.0, 10),
                new Order(4, "Keyboard", 1500.0, 7),
                new Order(5, "Mouse", 800.0, 12)
        ).toList();
    }
}
