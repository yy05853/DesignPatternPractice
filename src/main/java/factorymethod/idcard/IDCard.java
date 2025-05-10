package factorymethod.idcard;

import factorymethod.framework.Product;

public class IDCard extends Product {
  private String owner;

  IDCard (String owner) {
    System.out.println("Making " + owner + "'s card.");
    this.owner = owner;
  }

  @Override
  public void use() {
    System.out.println("Using " + owner + "'s card.");
  }

  @Override
  public String toString() {
    return "[IDCard: " + owner + "]";
  }

  public String getOwner() {
    return owner;
  }
}