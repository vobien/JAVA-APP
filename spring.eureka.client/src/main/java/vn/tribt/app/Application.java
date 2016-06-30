package vn.tribt.app;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.tribt.model.Bookmark;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        // new SpringApplicationBuilder(Application.class).web(true).run(args);
    }
}

@RestController
class MyController {

    @Autowired
    private BookmarkClient bookmarkClient;

    @RequestMapping("/{userId}")
    public Bookmark getBookmark(@PathVariable("userId") String userId) {
        System.err.println("get request at " + new Date());
        return bookmarkClient.getBookmarks(userId);
    }
}

// @Component
// class RestTemplateExample implements CommandLineRunner {
//
// @Autowired
// private RestTemplate restTemplate;
//
// @Override
// public void run(String... strings) throws Exception {
// // use the "smart" Eureka-aware RestTemplate
// ResponseEntity<Bookmark> exchange =
// restTemplate.exchange("http://bookmark-service/{userId}/bookmarks",
// HttpMethod.GET, null, new ParameterizedTypeReference<Bookmark>() {
// }, (Object) "mstine");
//
// System.err.println(exchange.getBody());
// }
// }
