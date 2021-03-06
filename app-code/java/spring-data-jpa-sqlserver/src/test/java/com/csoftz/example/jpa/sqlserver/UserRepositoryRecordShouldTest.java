package com.csoftz.example.jpa.sqlserver;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryRecordShouldTest {

    @Autowired
    UserRepository userRepository;

    @Test
    public void canReadInfo() {
        User user = new User("User name", 23);
        user = userRepository.save(user);

        User userRead = userRepository.findOne(user.getId());
        assertEquals(user, userRead);
    }

    @Test
    public void canUpdateInfo() {
        User user = new User("User name", 23);
        user = userRepository.save(user);

        user.setAge(50);
        user = userRepository.save(user);
        User userRead = userRepository.findOne(user.getId());
        assertEquals(user, userRead);
        assertEquals(user.getAge(), 50);
    }

    @Test
    public void canDelete() {
        User user = new User("User name", 23);
        user = userRepository.save(user);

        userRepository.delete(user.getId());
        boolean exist = userRepository.exists(user.getId());
        assertEquals(exist, false);
    }

    @After
    public void tearDown() {
        userRepository.deleteAll();
    }

}
