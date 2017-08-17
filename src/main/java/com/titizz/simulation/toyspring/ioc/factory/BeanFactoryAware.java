package com.titizz.simulation.toyspring.ioc.factory;

/**
 * Created by code4wt on 17/8/16.
 */
public interface BeanFactoryAware {

    void setBeanFactory(BeanFactory beanFactory) throws Exception;
}
