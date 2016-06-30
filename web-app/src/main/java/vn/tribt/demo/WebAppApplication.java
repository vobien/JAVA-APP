package vn.tribt.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class WebAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebAppApplication.class, args);
    }
}

@RestController
class Controller {

    @RequestMapping("/getUsers")
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("Tribt", "8945", 1991, 2, "Java"));
        users.add(new User("Thaohn", "7452", 1956, 15, "C++"));
        users.add(new User("Nhuth", "1234", 1980, 6, "Python"));
        return users;
    }

}

class User {
    private String name;
    private String id;
    private int birthYear;
    private int experience;
    private String master;

    public User(String name, String id, int birthYear, int experience, String master) {
        super();
        this.name = name;
        this.id = id;
        this.birthYear = birthYear;
        this.experience = experience;
        this.master = master;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", id=" + id + ", birthYear=" + birthYear + ", experience=" + experience
                + ", master=" + master + "]";
    }

}
