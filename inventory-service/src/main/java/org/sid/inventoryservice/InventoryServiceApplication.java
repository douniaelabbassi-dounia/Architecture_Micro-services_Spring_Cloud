package org.sid.inventoryservice;

import org.sid.inventoryservice.entities.Product;
import org.sid.inventoryservice.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ProductRepository productRepository, RepositoryRestConfiguration restConfiguration){
        restConfiguration.exposeIdsFor( Product.class);
        return args ->{
            productRepository.save(new Product(null,"Ordinateur",788,12));
            productRepository.save(new Product(null,"Imprimante",88,1));
            productRepository.save(new Product(null,"SmartPhone",765,9));
            productRepository.findAll().forEach(c->{
                System.out.println(c.toString());
            });

        };
    }


}
