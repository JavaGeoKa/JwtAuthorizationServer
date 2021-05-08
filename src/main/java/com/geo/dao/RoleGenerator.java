package com.geo.dao;

import com.geo.models.ERole;
import com.geo.models.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RoleGenerator implements CommandLineRunner {

    @Autowired
    RoleRepository roleRepository;

    @Override
    public void run(String... args) throws Exception {
        roleRepository.save(new Role(ERole.ROLE_ADMIN));
        roleRepository.save(new Role(ERole.ROLE_MODERATOR));
        roleRepository.save(new Role(ERole.ROLE_USER));

        roleRepository.findAll().stream().forEach(System.out::println);

    }
}
