package vn.tribt.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import vn.tribt.demo.model.User;

@Service
public class UserService {
    public UserService() {
    }

    @HystrixCommand(fallbackMethod = "failCase")
    public List<User> getData() {
        List<User> users = new ArrayList<User>();
        RestTemplate restTemplate = new RestTemplate();
        users = restTemplate.getForObject("http://localhost:9090/getUsers", List.class);
        return users;
    }

    public List<User> failCase() {
        List<User> users = new ArrayList<User>();
        users.add(new User("cache", "cache", 1009, 23, "DEV"));
        return users;
    }
}
