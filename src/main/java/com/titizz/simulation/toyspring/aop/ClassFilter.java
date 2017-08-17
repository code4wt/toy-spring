package com.titizz.simulation.toyspring.aop;

/**
 * Created by code4wt on 17/8/16.
 */
public interface ClassFilter {

    Boolean matchers(Class beanClass) throws Exception;
}
