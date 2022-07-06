package spring.springtf.domain.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import spring.springtf.domain.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Page<Product> findAllByUserId(Long userId, Pageable pageable);
    Page<Product> findAllByUserIdAndFolderList_Id(Long userId, Long folderId, Pageable pageable);
}