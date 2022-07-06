package spring.springtf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.springtf.domain.entity.ApiUseTime;
import spring.springtf.domain.repository.ApiUseTimeRepository;
import spring.springtf.enumerate.UserRoleEnum;

import java.util.List;

@RestController
public class ApiUseTimeController {
    private ApiUseTimeRepository apiUseTimeRepository;

    @Autowired
    public ApiUseTimeController(ApiUseTimeRepository apiUseTimeRepository) {
        this.apiUseTimeRepository = apiUseTimeRepository;
    }

    @Secured(UserRoleEnum.Authority.ADMIN)
    @GetMapping("/api/use/time")
    public List<ApiUseTime> getAllApiUseTime() {
        return apiUseTimeRepository.findAll();
    }
}