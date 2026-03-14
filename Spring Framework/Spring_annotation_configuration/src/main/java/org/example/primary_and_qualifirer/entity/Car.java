package org.example.primary_and_qualifirer.entity;

import org.springframework.stereotype.Component;

@Component

public class Car  implements Vehicle {
    public void start() {
        System.out.println("Car is starting....");
    }
}
