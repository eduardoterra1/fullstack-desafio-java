package spring.boot.desafio.produto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.boot.desafio.produto.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
