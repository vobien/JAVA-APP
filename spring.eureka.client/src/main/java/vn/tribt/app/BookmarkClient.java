package vn.tribt.app;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vn.tribt.model.Bookmark;

@FeignClient("bookmark-service")
public interface BookmarkClient {
    @RequestMapping(method = RequestMethod.GET, value = "/{userId}/bookmarks")
    Bookmark getBookmarks(@PathVariable("userId") String userId);
}
