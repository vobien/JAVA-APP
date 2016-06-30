package vn.tribt.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.tribt.demo.model.User;
import vn.tribt.demo.service.UserService;

@SpringBootApplication
@EnableCircuitBreaker
public class WebAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebAppApplication.class, args);
    }
}

@RestController
class Controller {

    @Autowired
    private UserService userService;

    @RequestMapping("/callServer")
    public List<User> getUsers() {
        return userService.getData();
    }

}
