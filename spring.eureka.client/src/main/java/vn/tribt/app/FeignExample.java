package vn.tribt.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

// @Component
public class FeignExample implements CommandLineRunner {
    @Autowired
    private BookmarkClient bookmarkClient;

    @Override
    public void run(String... strings) throws Exception {
        System.err.println(bookmarkClient.getBookmarks("jlong"));
    }
}
