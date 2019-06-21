package com.smallrain.javastudy.designMode.factory;

import com.smallrain.javastudy.designMode.factory.interfaces.Car;
import com.smallrain.javastudy.designMode.factory.model.BigCar;
import com.smallrain.javastudy.designMode.factory.model.MiddleCar;
import com.smallrain.javastudy.designMode.factory.model.SmallCar;

/**
 * 设计模式 - 工厂模式  - 简单工厂模式
 * 
 * 简单工厂模式并不是23种常用的设计模式之一，它只算工厂模式的一个特殊实现。
 * 简单工厂模式在实际中的应用相对于其他2个工厂模式用的还是相对少得多，因为它只适应很多简单的情况。
 * 
 * 最重要的是它违背了我们在概述中说的 开放-封闭原则 （虽然可以通过反射的机制来避免，后面我们会介绍到） 。
 * 因为每次你要新添加一个功能，都需要在生switch-case 语句（或者if-else 语句）中去修改代码，添加分支条件
 * 
 * 适用场景：
 * （1）需要创建的对象较少。
 * （2）客户端不关心对象的创建过程。
 * 
 * 角色分配：
 *   1. 工厂(Factory)角色 : 简单工厂模式的核心，它负责实现创建所有实例的内部逻辑。工厂类可以被外界直接调用，创建所需的产品对象。
 *   2. 抽象产品(Product)角色 : 简单工厂模式所创建的所有对象的父类，它负责描述所有实例所共有的公共接口。
 *   3. 具体产品(Concrete Product)角色: 简单工厂模式的创建目标，所有创建的对象都是充当这个角色的某个具体类的实例。
 * 
 * @author wangying.dz3
 *
 */

public class FactorySimpleDemo {

  public static void test() {
    System.out.println("\n开始简单工厂模式的测试。。。。");
    Car big = CarFactory.getCar(0);
    big.run();
    Car mid = CarFactory.getCar(1);
    mid.run();
    Car small = CarFactory.getCar(2);
    small.run();

    System.out.println("\n使用反射：");
    //使用反射
    Car big2 = (BigCar)CarFactory2.getCar(BigCar.class);
    big2.run();
    Car mid2 = (MiddleCar)CarFactory2.getCar(MiddleCar.class);
    mid2.run();
    Car small2 = (SmallCar)CarFactory2.getCar(SmallCar.class);
    small2.run();
    
    System.out.println("简单工厂模式的测试结束。。。。");
  }

}


/**
 * 最后定义工厂类，使用静态方法和不同参数去创建子类
 *
 */
class CarFactory {

  public static Car getCar(int type) {
    switch (type) {
    case 0:
      return new BigCar();
    case 1:
      return new MiddleCar();
    case 2:
      return new SmallCar();
    }
    return null;
  }

}

/**
 * 如果新增产品类的话，就需要修改工厂类中的getShape（）方法，这很明显不符合 开放-封闭原则 。使用反射机制改善简单工厂
 *
 */
class CarFactory2 {

  public static Object getCar(Class<? extends Car> clazz) {
    Object result = null;
      try {
        result = Class.forName(clazz.getName()).newInstance();
      } catch (InstantiationException e) {
        e.printStackTrace();
      } catch (IllegalAccessException e) {
        e.printStackTrace();
      }catch (ClassNotFoundException e) {
        e.printStackTrace();
      }
    return result;
  }

}
  