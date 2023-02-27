package com.example.demo.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.modal.Search;
import com.example.demo.modal.User;

@Service
public class UserService {
    public List<String> getData() {
        List<String> list = Arrays.asList(new String[]{"Text 1", "Text 2", "Text 3", "Text 4", "Text 5"});
        return list;
    }

    public List<User> getUsers(Search searchObj) {
        List<User> input = initList();
        List<User> list = input.stream()
            .filter(a -> a.getName().equals(searchObj.getName()) && a.getEmail().equals(searchObj.getEmail()))
            .collect(Collectors.toList());
        return list;
    }

    static List<User> initList() {
        List<User> data = new ArrayList<>();
        data.add(new User(1L, "Akshay Jedhe", "test1@test.com", "Software developer", "User 1 description"));
        data.add(new User(2L, "Pooja Randive", "test2@test.com", "Software developer", "User 2 description"));
        data.add(new User(3L, "Ram Patel", "test3@test.com", "Software developer", "User 3 description"));
        data.add(new User(4L, "Sham Patel", "test4@test.com", "Software developer", "User 4 description"));
        data.add(new User(5L, "Ravi Rana", "test5@test.com", "Software developer", "User 5 description"));
        data.add(new User(6L, "Ravi Teja", "test6@test.com", "Software developer", "User 6 description"));
        data.add(new User(7L, "Manali Patil", "test7@test.com", "Software developer", "User 7 description"));
        data.add(new User(8L, "Radhe Sham", "test8@test.com", "Software developer", "User 8 description"));
        data.add(new User(9L, "Tata Bata", "test9@test.com", "Software developer", "User 9 description"));
        data.add(new User(10L, "Test Test", "test10@test.com", "Software developer", "User 10 description"));
        return data;
    }
}
