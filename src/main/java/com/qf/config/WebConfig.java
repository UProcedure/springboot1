package com.qf.config;

import com.qf.filter.MyFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author weimin
 * @ClassName WebConfig
 * @Description TODO
 * @date 2019/10/21 17:09
 */
@Configuration
public class WebConfig {

    @Autowired
    private MyFilter myFilter;

    @Bean
    public FilterRegistrationBean init(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(myFilter);
        filterRegistrationBean.setName("myFilter");
        filterRegistrationBean.addUrlPatterns("/*");
        return filterRegistrationBean;
    }

}
