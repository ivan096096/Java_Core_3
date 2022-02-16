package java3.lesson_1_Gen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
1.   Написать метод, который меняет два элемента массива местами
(массив может быть любого ссылочного типа);

2.   Написать метод, который преобразует массив в ArrayList;
3.   Задача:

  a.  Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;

  b.   Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
     поэтому в одну коробку нельзя сложить и яблоки, и апельсины;

  c.   Для хранения фруктов внутри коробки можно использовать ArrayList;

  d.  Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
       вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);

  e.  Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той,
       которую подадут в compare() в качестве параметра. true – если их массы равны,
        false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;

   f.   Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
       Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами. Соответственно,
        в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;

   g.  Не забываем про метод добавления фрукта в коробку.
*/
public class HomeWork {


  public static void main(String[] args) {
    Task_1_and_2();

  }


  private static void Task_1_and_2() {
    String[] arr = {"1", "2", "3", "4"};
    for (String s : arr) {
      String arrayS = arr[1];
      arr[1] = arr[3];
      arr[3] = arrayS;
      System.out.print(s);

      List < String > arrayList;
      arrayList = new ArrayList<>(List.of(s));
      System.out.println(arrayList);
    }
  }



}




