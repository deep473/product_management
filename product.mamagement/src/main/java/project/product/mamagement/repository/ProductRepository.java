package project.product.mamagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.product.mamagement.entity.Product;

public interface ProductRepository 

			extends JpaRepository<Product, Long>{

}
