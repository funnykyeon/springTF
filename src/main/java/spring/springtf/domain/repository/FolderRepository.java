package spring.springtf.domain.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import spring.springtf.domain.entity.Folder;
import spring.springtf.domain.entity.User;

import java.util.List;

public interface FolderRepository extends JpaRepository<Folder, Long> {
    List<Folder> findAllByUser(User user);
    boolean existsByUserAndName(User user, String name);
}