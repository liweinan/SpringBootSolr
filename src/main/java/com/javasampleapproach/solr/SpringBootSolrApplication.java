package com.javasampleapproach.solr;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javasampleapproach.solr.model.Customer;
import com.javasampleapproach.solr.repo.CustomerRepository;

@SpringBootApplication
public class SpringBootSolrApplication implements CommandLineRunner {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void run(String... args) throws Exception {

        customerRepository.deleteAll();

        // Store customers
        customerRepository.saveAll(Arrays.asList(new Customer("1", "Jack", "jojo", 20),
                new Customer("2", "Adam", "ada", 24),
                new Customer("3", "Kim", "kiki", 27),
                new Customer("4", "David", "dave", 30),
                new Customer("5", "Peter", "pete", 21)));

        // Fetch all customers
        System.out.println("--------------------------------");
        System.out.println("Select all Customers:");
        System.out.println("--------------------------------");

        for (Customer product : this.customerRepository.findAll()) {
            System.out.println(product);
        }

        // Find customer by Name ends with 'm'
        System.out.println("--------------------------------");
        System.out.println("Find Customers that have names EndsWith m:");
        System.out.println("--------------------------------");

        for (Customer customer : this.customerRepository.findByNameEndsWith("m")) {
            System.out.println(customer);
        }

        // Find customer by Name ends with 'm'
        System.out.println("--------------------------------");
        System.out.println("Find Customers that have nicknames EndsWith o:");
        System.out.println("--------------------------------");

        for (Customer customer : this.customerRepository.findByNicknameEndsWith("o")) {
            System.out.println(customer);
        }
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootSolrApplication.class, args);
    }
}