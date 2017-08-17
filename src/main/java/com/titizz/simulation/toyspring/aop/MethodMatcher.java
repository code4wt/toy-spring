package com.titizz.simulation.toyspring.aop;

import java.lang.reflect.Method;

/**
 * Created by code4wt on 17/8/16.
 */
public interface MethodMatcher {

    Boolean matchers(Method method, Class beanClass);
}
