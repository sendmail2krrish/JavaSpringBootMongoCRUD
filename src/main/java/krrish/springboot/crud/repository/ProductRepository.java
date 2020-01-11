package krrish.springboot.crud.repository;

import krrish.springboot.crud.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product, Long> {
}
