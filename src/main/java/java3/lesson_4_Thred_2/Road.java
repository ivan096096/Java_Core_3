package java3.lesson_4_Thred_2;


public class Road extends Stage {

  public Road(int length) {      //Road - Дорога
    this.length = length;
    this.description = "Дорога " + length + " метров";
  }

  @Override
  public void go(Car c) {
    try {
      System.out.println(c.getName() + " начал этап: " + description);
      Thread.sleep(length / c.getSpeed() * 1000);
      System.out.println(c.getName() + " закончил этап: " + description);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}

