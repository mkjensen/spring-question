package com.example.demo;

public class PublisherImplOne implements Publisher {

    @Override
    public void publish(String message) {
        System.out.println("One: " + message);
    }
}
