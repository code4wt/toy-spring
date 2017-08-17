package com.titizz.simulation.toyspring.aop;

/**
 * Created by code4wt on 17/8/16.
 */
public abstract class AbstractAopProxy implements AopProxy {

    protected AdvisedSupport advised;

    public AbstractAopProxy(AdvisedSupport advised) {
        this.advised = advised;
    }
}
