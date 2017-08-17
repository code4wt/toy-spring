package com.titizz.simulation.toyspring.ioc;

/**
 * Created by code4wt on 17/8/3.
 */
public interface BeanPostProcessor {

    Object postProcessBeforeInitialization(Object bean, String beanName) throws Exception;

    Object postProcessAfterInitialization(Object bean, String beanName) throws Exception;
}
