package spring.springtf.domain.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import spring.springtf.domain.entity.ApiUseTime;
import spring.springtf.domain.entity.User;

import java.util.Optional;

public interface ApiUseTimeRepository extends JpaRepository<ApiUseTime, Long> {
    Optional<ApiUseTime> findByUser(User user);
}