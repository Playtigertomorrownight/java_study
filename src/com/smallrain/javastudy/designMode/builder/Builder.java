package com.smallrain.javastudy.designMode.builder;

/**
 * 抽象建造者
 * 
 * @author wangying.dz3
 *
 */
public abstract  class Builder {
  
  
  /**
   * 要建造的产品
   */
  protected Product product = new Product();

  
  /**
   * 对产品属性一一构建
   */
  public abstract void buildPart1();
  
  public abstract void buildPart2();
  
  public abstract void buildPart3();
  
  public abstract void buildPart4();
  
  public Product getProduct(){
      return product;
  }
}
