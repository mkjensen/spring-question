package com.example.demo;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;

public class PublisherUser {

    @Autowired
    private Publisher publisherImplOne;

    @Autowired
    private Publisher publisherImplTwo;

    @Autowired
    private Publisher[] publishers;

    @PostConstruct
    public void printDebugInfo() {
        System.out.println(""
                                   + "\n" + "publishers.length: " + publishers.length
                                   + "\n" + "publisherImplOne.getClass(): " + publisherImplOne.getClass().getSimpleName()
                                   + "\n" + "publisherImplTwo.getClass(): " + publisherImplTwo.getClass().getSimpleName()
        );
    }
}
