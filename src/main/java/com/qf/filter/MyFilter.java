package com.qf.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author weimin
 * @ClassName MyFilter
 * @Description TODO
 * @date 2019/10/21 17:09
 */
@Component
public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter init...");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter doFilter...");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
