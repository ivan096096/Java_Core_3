package java3.lesson_1_Gen;

public class boxAppleAndOrange {

  public static void main(String[] args) {
    BoxFruit<Apple> appleBoxFruit = new BoxFruit<Apple>(new Apple(), new Apple(), new Apple(),
        new Apple(), new Apple());
    BoxFruit<Orange> orangeBoxFruit = new BoxFruit<Orange>(new Orange(), new Orange(),
        new Orange());
    BoxFruit<Orange> orangeBox = new BoxFruit<Orange>(new Orange());
    orangeBoxFruit.pourEverything(orangeBox);
    System.out.println(appleBoxFruit.equalsByWeight(orangeBoxFruit));
    System.out.println(orangeBoxFruit.getWeight());
    System.out.println(appleBoxFruit.getWeight());
    System.out.println(orangeBox.getWeight());
  }
}
