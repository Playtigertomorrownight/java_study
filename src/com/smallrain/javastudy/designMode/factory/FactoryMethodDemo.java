package com.smallrain.javastudy.designMode.factory;

import com.smallrain.javastudy.designMode.factory.interfaces.Car;
import com.smallrain.javastudy.designMode.factory.model.BigCar;
import com.smallrain.javastudy.designMode.factory.model.MiddleCar;
import com.smallrain.javastudy.designMode.factory.model.SmallCar;

/**
 * 设计模式 - 工厂模式 - 工厂方法模式
 * 
 * 工厂方法模式应该是在工厂模式家族中是用的最多模式，一般项目中存在最多的就是这个模式。
 * 工厂方法模式是简单工厂的仅一步深化， 在工厂方法模式中，我们不再提供一个统一的工厂类来创建所有的对象，而是针对不同的对象提供不同的工厂。
 * 也就是说 每个对象都有一个与之对应的工厂 
 * 
 * 使用场景：
 *   1. 一个类不知道它所需要的对象的类：在工厂方法模式中，客户端不需要知道具体产品类的类名，只需要知道所对应的工厂即可，具体的产品对象由具体工厂类创建；客户端需要知道创建具体产品的工厂类。
 *   2. 一个类通过其子类来指定创建哪个对象：在工厂方法模式中，对于抽象工厂类只需要提供一个创建产品的接口，而由其子类来确定具体要创建的对象，利用面向对象的多态性和里氏
 *   3. 将创建对象的任务委托给多个工厂子类中的某一个，客户端在使用时可以无需关心是哪一个工厂子类创建产品子类，需要时再动态指定，可将具体工厂类的类名存储在配置文件或数据库中。
 *   
 * 角色分配：
 *   1. 抽象工厂(Abstract Factory)角色：是工厂方法模式的核心，与应用程序无关。任何在模式中创建的对象的工厂类必须实现这个接口。
 *   2. 具体工厂(Concrete Factory)角色 ：这是实现抽象工厂接口的具体工厂类，包含与应用程序密切相关的逻辑，并且受到应用程序调用以创建某一种产品对象。
 *   3. 抽象产品(AbstractProduct)角色 ：工厂方法模式所创建的对象的超类型，也就是产品对象的共同父类或共同拥有的接口。
 *   3. 具体产品(Concrete Product)角色 ：这个角色实现了抽象产品角色所定义的接口。某具体产品有专门的具体工厂创建，它们之间往往一一对应
 * 
 * @author wangying.dz3
 *
 */
public class FactoryMethodDemo {
  
  public static void test() {
    System.out.println("\n开始工厂方法模式的测试。。。。");
    FactoryFactory bigFactory = new BigCarFactoey();
    Car car = bigFactory.getCar();
    car.run();
    
    FactoryFactory middleFactory = new BigCarFactoey();
    Car mcar = middleFactory.getCar();
    mcar.run();
    
    FactoryFactory smallFactory = new BigCarFactoey();
    Car scar = smallFactory.getCar();
    scar.run();
    
    
    System.out.println("工厂方法模式的测试结束。。。。");
  }
  
}


/**
 * 工厂实现
 * 首先是定义一个工厂接口
 */

interface FactoryFactory {
  public Car getCar();
}

/**
 * 实现不同类的工厂类
 */

class BigCarFactoey  implements FactoryFactory {

  @Override
  public Car getCar() {
    // TODO Auto-generated method stub
    return new BigCar();
  }
  
}

class MiddleCarFactoey  implements FactoryFactory {

  @Override
  public Car getCar() {
    // TODO Auto-generated method stub
    return new MiddleCar();
  }
  
}

class SmallCarFactoey  implements FactoryFactory {

  @Override
  public Car getCar() {
    // TODO Auto-generated method stub
    return new SmallCar();
  }
  
}


