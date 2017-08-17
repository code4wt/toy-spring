package com.titizz.simulation.toyspring.ioc;

import java.io.FileNotFoundException;

/**
 * Created by code4wt on 17/8/2.
 */
public interface BeanDefinitionReader {

    void loadBeanDefinitions(String location) throws FileNotFoundException, Exception;

}
