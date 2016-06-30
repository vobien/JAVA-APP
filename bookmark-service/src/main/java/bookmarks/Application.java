package bookmarks;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

@RestController
@RequestMapping("/{userId}/bookmarks")
class BookmarkRestController {

    @RequestMapping(method = RequestMethod.GET)
    public Bookmark getBookmarks(@PathVariable String userId) {
        System.out.println("Get the request at " + new Date());

        return new Bookmark(userId, "hello", "nothing", "GOD");
    }

}

class Bookmark {

    private String userId;

    private Long id;

    private String href;

    private String description;

    Bookmark() {
    }

    public Bookmark(String userId, String href, String description, String label) {
        this.userId = userId;
        this.href = href;
        this.description = description;
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public String getUserId() {
        return userId;
    }

    public Long getId() {
        return id;
    }

    public String getHref() {
        return href;
    }

    public String getDescription() {
        return description;
    }

    private String label;
}
