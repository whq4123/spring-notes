package io.github.dunwu.spring.core.ioc.annotation.factory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/spring/spring-inject.xml");
        BeanFactory beanFactory = ((BeanFactory) ctx.getBean("beanFactory"));
        beanFactory.work();
        ctx.close();
    }

}
