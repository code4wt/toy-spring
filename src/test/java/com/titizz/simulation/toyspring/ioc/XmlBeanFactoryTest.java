package com.titizz.simulation.toyspring.ioc;

import com.titizz.simulation.toyspring.Car;
import com.titizz.simulation.toyspring.HelloService;
import com.titizz.simulation.toyspring.Wheel;
import com.titizz.simulation.toyspring.ioc.xml.XmlBeanFactory;
import org.junit.Test;

/**
 * Created by code4wt on 17/8/2.
 */
public class XmlBeanFactoryTest {

    @Test
    public void getBean() throws Exception {
        System.out.println("--------- IOC test ----------");
        String location = getClass().getClassLoader().getResource("toy-spring.xml").getFile();
        XmlBeanFactory bf = new XmlBeanFactory(location);
        Wheel wheel = (Wheel) bf.getBean("wheel");
        System.out.println(wheel);
        Car car = (Car) bf.getBean("car");
        System.out.println(car);

        System.out.println("\n--------- AOP test ----------");
        HelloService helloService = (HelloService) bf.getBean("helloService");
        helloService.sayHelloWorld();
    }
}