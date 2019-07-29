package com.stackroute.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("Invoked by the containing BeanFactory on destruction of a bean");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Invoked by the containing BeanFactory after it has set all bean properties ");

    }

    //    custom init method
    @PostConstruct
    public void customInit() {
        System.out.println("Custom Init Method ");
    }

    //    custom destroy method
    @PreDestroy
    public void customDestroy() {
        System.out.println("Custom Destroy method ");
    }
}
