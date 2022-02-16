package java3.lesson_1_Gen;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoxFruit<Q extends Fruit> {

  private List<Q> fruits;

  public BoxFruit() {
    this.fruits = new ArrayList<>();
  }

  public BoxFruit(List<Q> boxFruit) {
    this.fruits = new ArrayList<>(fruits);
  }


  public BoxFruit(Q... fruits) {
    this.fruits = new ArrayList<>(Arrays.asList(fruits));
  }

  public void add(Q fruit) {
    this.fruits.add(fruit);
  }

  public boolean equalsByWeight(BoxFruit<?> another) {
    return Math.abs(getWeight() - another.getWeight()) < 0.0001;
  }

  public void pourEverything(BoxFruit<? super Q> another) {
    if (this == another) return;
    another.fruits.addAll(fruits);
    fruits.clear();
  }
  public double getWeight() {
    double weight = 0.0;
    for (Q fruit : fruits) {
      weight += fruit.getWeight();
    }
    return weight;
  }


  public List<Q> getFruits() {
    return fruits;
  }
}

