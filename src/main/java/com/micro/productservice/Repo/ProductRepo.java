package com.micro.productservice.Repo;
import com.micro.productservice.Model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepo extends MongoRepository<Product,String>{
    
}
