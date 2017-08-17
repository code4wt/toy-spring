package com.titizz.simulation.toyspring.ioc.factory;

/**
 * Created by code4wt on 17/8/2.
 */
public interface BeanFactory {
    Object getBean(String beanId) throws Exception;
}
