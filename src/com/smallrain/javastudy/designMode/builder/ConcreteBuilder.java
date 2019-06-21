package com.smallrain.javastudy.designMode.builder;

/**
 * 具体建造者
 * @author wangying.dz3
 *
 */
public class ConcreteBuilder extends Builder {

  @Override
  public void buildPart1() {
    // TODO Auto-generated method stub
    System.out.println("构建第一部分");
    product.setPart1("I am part1");
  }

  @Override
  public void buildPart2() {
    // TODO Auto-generated method stub
    System.out.println("构建第二部分");
    product.setPart2("I am part2");
  }

  @Override
  public void buildPart3() {
    // TODO Auto-generated method stub
    System.out.println("构建第三部分");
    product.setPart3("I am part3");
  }

  @Override
  public void buildPart4() {
    // TODO Auto-generated method stub
    System.out.println("构建第四部分");
    product.setPart4("I am part4");
  }

}
