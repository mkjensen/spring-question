package com.example.demo;

public class PublisherImplTwo implements Publisher {

    @Override
    public void publish(String message) {
        System.out.println("Two: " + message);
    }
}
