package com.example.encore_spring_pjt.config;

import com.example.encore_spring_pjt.controller.user.interceptor.BoardInterceptor;
import com.example.encore_spring_pjt.controller.user.interceptor.LoginInterceptor;
import com.example.encore_spring_pjt.controller.user.interceptor.LogoutInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebInterceptorConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // login interceptor
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/index.hanwha");

        // board interceptor
        registry.addInterceptor(new BoardInterceptor())
                .addPathPatterns("/board/**");

        registry.addInterceptor(new LogoutInterceptor())
                .addPathPatterns("/user/logout.hanwha");
    }
}