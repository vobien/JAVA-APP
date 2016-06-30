package vn.tribt.demo.filters.pre;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

@Component
public class PreFilter extends ZuulFilter {

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        System.err.println("Hello .... pre-filter");
        System.err.println(request.getMethod() + "  " + request.getRequestURL());
        System.err.println(request);
        return null;
    }

    @Override
    public String filterType() {
        return "pre"; // others: post, error, routing
    }

    @Override
    public int filterOrder() {
        return 1;
    }

}
