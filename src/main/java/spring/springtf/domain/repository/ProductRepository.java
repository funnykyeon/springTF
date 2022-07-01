package spring.springtf.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.springtf.domain.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> { }