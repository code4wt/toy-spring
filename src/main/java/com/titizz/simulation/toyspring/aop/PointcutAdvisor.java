package com.titizz.simulation.toyspring.aop;

/**
 * @author yihua.huang@dianping.com
 */
public interface PointcutAdvisor extends Advisor {

   Pointcut getPointcut();
}
