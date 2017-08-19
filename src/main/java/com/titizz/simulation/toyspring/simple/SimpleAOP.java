package com.titizz.simulation.toyspring.simple;

import java.lang.reflect.Proxy;

/**
 * Created by code4wt on 17/8/18.
 */
public class SimpleAOP {

    public static Object getProxy(Object bean, Advice advice) {
        return Proxy.newProxyInstance(SimpleAOP.class.getClassLoader(), bean.getClass().getInterfaces(), advice);
    }
}