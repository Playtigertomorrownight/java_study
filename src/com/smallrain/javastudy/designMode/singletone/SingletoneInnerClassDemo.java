package com.smallrain.javastudy.designMode.singletone;

/**
 * 设计模式 - 单例模式 - 静态内部类方法 
 * 优点：线程安全；延迟加载；效率较高。
 * 
 * @author wangying.dz3
 *
 */
public class SingletoneInnerClassDemo {

  /**
   * 构造器私有化
   */
  private SingletoneInnerClassDemo() {

  }

  /**
   * 类加载加载时不初始化,并保证实例的可见性和有序性
   */
  private static class InstanceHolser {
    private static final SingletoneInnerClassDemo INSTANCE = new SingletoneInnerClassDemo();
  }

  public static SingletoneInnerClassDemo getInstance() {
    return InstanceHolser.INSTANCE;
  }
  
  
  /**
   * 各种成员方法
   */
  public void anyMethod() {
    System.out.println("各种方法");
  }
}
