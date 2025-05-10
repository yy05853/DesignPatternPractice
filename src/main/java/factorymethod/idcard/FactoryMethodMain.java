package factorymethod.idcard;

import factorymethod.framework.Factory;
import factorymethod.framework.Product;

public class FactoryMethodMain {
  public void start() {
    Factory factory = new IDCardFactory();
    Product card1 = factory.create("Hiroshi Yuki");
    Product card2 = factory.create("Tomura");
    Product card3 = factory.create("Hanako Sato");
    card1.use();
    card2.use();
    card3.use();
  }
}