package com.smallrain.javastudy.designMode.factory;

/**
 * 设计模式 - 工厂模式
 * 定义：
 *   在基类中定义创建对象的一个接口，让子类决定实例化哪个类。工厂方法让一个类的实例化延迟到子类中进行。
 *   
 * 分类：
 *   （1）简单工厂（Simple Factory）模式，又称静态工厂方法模式（Static Factory Method Pattern）
 *   （2）工厂方法（Factory Method）模式，又称多态性工厂（Polymorphic Factory）模式或虚拟构造子（Virtual Constructor）模式；
 *   （3）抽象工厂（Abstract Factory）模式，又称工具箱（Kit 或Toolkit）模式。
 * 
 * 作用：
 *   (1) 解耦 ：把对象的创建和使用的过程分开
 *   (2) 降低代码重复: 如果创建某个对象的过程都很复杂，需要一定的代码量，而且很多地方都要用到，那么就会有很多的重复代码。
 *   (3) 降低维护成本 ：由于创建过程都由工厂统一管理，所以发生业务逻辑变化，不需要找到所有需要创建对象B的地方去逐个修正，只需要在工厂里修改即可，降低维护成本。
 * 
 * 
 * @author wangying.dz3
 *
 */
public interface FactoryIndex { }
