package spring.springtf.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.springtf.domain.entity.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByUserId(Long userId);
}