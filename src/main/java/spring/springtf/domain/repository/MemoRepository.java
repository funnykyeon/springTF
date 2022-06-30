package spring.springtf.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.springtf.domain.entity.Memo;

import java.util.List;

public interface MemoRepository extends JpaRepository<Memo, Long> {
    List<Memo> findAllByOrderByModifiedAtDesc();
}
