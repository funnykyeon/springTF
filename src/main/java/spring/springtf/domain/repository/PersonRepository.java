package spring.springtf.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.springtf.domain.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
