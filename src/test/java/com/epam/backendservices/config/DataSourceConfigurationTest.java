package com.epam.backendservices.config;

import com.epam.backendservices.model.User;
import com.epam.backendservices.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class DataSourceConfigurationTest {

    @Autowired
    UserRepository userRepository;

    @Test
    public void createUser() throws InterruptedException {

        userRepository.save(new User("Vlad", "Lukiyanets", LocalDate.ofYearDay(2000, 364)));

        List<User> users = (List<User>) userRepository.findAll();

        assertThat(users.size()).isEqualTo(1);
    }

}
