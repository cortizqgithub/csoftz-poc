package com.csoftz.example.jpa.sqlserver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoyBulkShouldTest {
    @Autowired
    private UserRepository userRepository;

    @Before
    public void setUp() {
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            User u = new User("name " + i, i);
            userList.add(u);
        }
        userRepository.save(userList);
    }

    @After
    public void tearDown() {
       userRepository.deleteAll();
    }

    @Test
    public void saveHundredUsers() {

        Iterable<User> users = userRepository.findAll();
        //long cnt = userRepository.count();
        int count = 0;
        for (User p : users) {
            count++;

        }
        assertEquals(count, 100);
    }
}
