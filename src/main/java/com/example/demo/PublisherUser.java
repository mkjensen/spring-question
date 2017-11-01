package com.example.demo;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;

public class PublisherUser {

    @Autowired
    private Publisher publisherImplOne; // <== PublisherImplOne instance is injected - matches Application.publisherImplOne() by name

    @Autowired
    private Publisher publisherImplTwo; // <== PublisherImplTwo instance is injected - matches Application.publisherImplTwo() by name

    @Autowired
    private Publisher[] publishers;     // <== Will get PublisherImplOne and PublisherImplTwo are both injected

    @PostConstruct
    public void printDebugInfo() {
        System.out.println(""
                                   + "\n" + "publishers.length: " + publishers.length
                                   + "\n" + "publisherImplOne.getClass(): " + publisherImplOne.getClass().getSimpleName()
                                   + "\n" + "publisherImplTwo.getClass(): " + publisherImplTwo.getClass().getSimpleName()
        );
    }
}
