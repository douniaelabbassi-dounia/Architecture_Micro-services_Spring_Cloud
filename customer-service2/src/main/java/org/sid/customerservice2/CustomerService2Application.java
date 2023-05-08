package org.sid.customerservice2;

import org.sid.customerservice2.entities.Customer;
import org.sid.customerservice2.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class CustomerService2Application {

    public static void main(String[] args) {
        SpringApplication.run(CustomerService2Application.class, args);
    }
    @Bean
    CommandLineRunner start(CustomerRepository customerRepository, RepositoryRestConfiguration restConfiguration){
        restConfiguration.exposeIdsFor( Customer.class);
        return args -> {
            customerRepository.save(new Customer(null,"DOUNIA","douniaa@gmail.com"));
            customerRepository.save(new Customer(null,"ABASI","ABASI@gmail.com"));
            customerRepository.save(new Customer(null,"IMANE","IMANE@gmail.com"));
            customerRepository.findAll().forEach(c->{
                System.out.println(c.toString());
            });

        };
    }

}
