package com.smallrain.javastudy.designMode.builder;

/**
 * 产品角色
 * @author wangying.dz3
 *
 */
public class Product {
  
  /**
   * 产品的组成部分
   */
  private String part1;//可以是任意类型
  
  /**
   * 产品的组成部分
   */
  private String part2;
  
  /**
   * 产品的组成部分
   */
  private String part3;
  
  /**
   * 产品的组成部分
   */
  private String part4;

  public String getPart1() {
    return part1;
  }

  public String getPart2() {
    return part2;
  }

  public String getPart3() {
    return part3;
  }

  public String getPart4() {
    return part4;
  }

  public void setPart1(String part1) {
    this.part1 = part1;
  }

  public void setPart2(String part2) {
    this.part2 = part2;
  }

  public void setPart3(String part3) {
    this.part3 = part3;
  }

  public void setPart4(String part4) {
    this.part4 = part4;
  }

  @Override
  public String toString() {
    return "Product [part1=" + part1 + ", part2=" + part2 + ", part3=" + part3 + ", part4=" + part4 + "]";
  }
  
  

}
