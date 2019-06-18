package com.smallrain.javastudy.designMode.singletone;

/**
 * 设计模式 - 单例模式 - 枚举 最好的实现方式
 * 
 * @author wangying.dz3
 *
 */
public enum SingletoneEnumDemo {

  INSTANCE;
  
  /**
   * 各种成员方法
   */
  public void anyMethod() {
    System.out.println("各种方法");
  }

}
