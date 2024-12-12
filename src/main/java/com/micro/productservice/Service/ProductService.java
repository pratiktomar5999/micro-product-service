package com.micro.productservice.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.micro.productservice.Model.Product;
import com.micro.productservice.Repo.ProductRepo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
    private final ProductRepo productRepo;

    public Product createProduct(Product productRequest){
        Product product = Product.builder().name(productRequest.getName())
                                            .description(productRequest.getDescription())
                                            .price(productRequest.getPrice())
                                            .build();
        productRepo.save(product);
        log.info("Product created successfully");
        return product;
    }

    public List<Product> getProducts() {
        return productRepo.findAll();
    }

}
