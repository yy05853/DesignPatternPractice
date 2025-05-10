import factorymethod.idcard.FactoryMethodMain;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    System.out.println("-----------");

    // Factory Method
    System.out.println("Factory Method");
    FactoryMethodMain factoryMethodMain = new FactoryMethodMain();
    factoryMethodMain.start();    
  }
}