package com.smallrain.javastudy.designMode.singletone;

/**
 * 设计模式  - 单例模式  - 恶汉式
 * 优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题。
 * 缺点：在类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费。
 * @author wangying.dz3
 *
 */
public class SingletoneHungryDemo {
  
    /**
     * 类加载就初始化
     */
    private final static SingletoneHungryDemo INSTANCE = new SingletoneHungryDemo();
    
    /**
     * 构造器私有化
     */
    private SingletoneHungryDemo() {
      
    }
    
    public static SingletoneHungryDemo getInstance() {
      return INSTANCE;
    }
    
    /**
     * 各种成员方法
     */
    public void anyMethod() {
      System.out.println("各种方法");
    }
    
}
