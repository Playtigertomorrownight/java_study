package com.smallrain.javastudy.designMode.singletone;

/**
 * 设计模式  - 单例模式  - 懒汉式（双重检查）
 * 优点：线程安全；延迟加载；效率较高。
 * 缺点：多线程环境可能会影响效率。
 * @author wangying.dz3
 *
 */
public class SingletoneDoubleCheckDemo {
  
    /**
     * 类加载加载时不初始化,并保证实例的可见性和有序性
     */
    private volatile static SingletoneDoubleCheckDemo INSTANCE = null;
    
    /**
     * 构造器私有化
     */
    private SingletoneDoubleCheckDemo() {
      
    }
    
    public static SingletoneDoubleCheckDemo getInstance() {
      if(null == INSTANCE) {  //延迟加载
        synchronized (SingletoneDoubleCheckDemo.class){
          if(null == INSTANCE) {   //防止产生多个实例
            INSTANCE = new SingletoneDoubleCheckDemo();
          }
        }
      }
      return INSTANCE;
    }
    
    /**
     * 各种成员方法
     */
    public void anyMethod() {
      System.out.println("各种方法");
    }
}
