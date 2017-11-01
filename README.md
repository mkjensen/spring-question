# Spring question: Is field name used to match on bean name when `@Autowired` matches several beans by type?

## How to run the example

Execute the main method in `Application` (run `./mvnw spring-boot:run`).
Note what is written to standard out by `PublisherUser.printDebugInfo()` which is a `@PostConstruct` method. The output is:
```
publishers.length: 2
publisherImplOne.getClass(): PublisherImplOne
publisherImplTwo.getClass(): PublisherImplTwo
```

## Overview of the example

Spring configuration and main method is located in `Application`.

`Publisher` is an interface, which is implemented by two different beans: `PublisherImplOne` and `PublisherImplTwo`.

`PublisherUser` is registered as a Spring bean, and has multiple fields into which beans of type `Publisher` are
`@Autowired` like this:

```
@Autowired
private Publisher publisherImplOne; // <== PublisherImplOne instance is injected - matches Application.publisherImplOne() by name 

@Autowired
private Publisher publisherImplTwo; // <== PublisherImplTwo instance is injected - matches Application.publisherImplTwo() by name

@Autowired
private Publisher[] publishers;     // <== Will get PublisherImplOne and PublisherImplTwo are both injected

```
Note that the two fields of type `Publisher` both have the same names as a bean (e.g. the `publisherImplOne` field has the 
same name as the bean defined by the `@Bean` method `Application.publisherImplOne()`).

As long as the field names and bean names match the program works. If we rename one of the fields, then Spring will
complain that two beans both match the type of the `@Autowired` field.

Is this expected behavior? We can't find it documented anywhere.
