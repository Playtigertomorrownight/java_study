package com.smallrain.javastudy.designMode.builder;


/**
 * 指挥者
 * @author wangying.dz3
 *
 */
public class Director {

  private Builder builder;

  public Director(Builder builder) {
    super();
    this.builder = builder;
  }
  
  //2 set方法注入builder对象
  public void setBuilder(Builder builder)
  {
      this.builder = builder;
  }
  
  public Product construct()
  {
      builder.buildPart1();
      builder.buildPart2();
      builder.buildPart3();
      builder.buildPart4();
      return builder.getProduct();
  }
  
}
