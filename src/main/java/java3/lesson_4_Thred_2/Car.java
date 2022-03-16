package java3.lesson_4_Thred_2;

import java.util.concurrent.CountDownLatch;

public class Car implements Runnable {
  private  int CARS_COUNT;
  private Race race; // Гонка
  private int speed; //скорость
  private String name;


  public String getName() {
    return name;
  }
  public int getSpeed() {
    return speed;
  }
  public Car(Race race, int speed) {
    this.race = race;
    this.speed = speed;
    CARS_COUNT++;
    this.name = "Участник #" + CARS_COUNT;
  }



  @Override
  public void run() {
    try {
      System.out.println(this.name + " готовится");
      Thread.sleep(500 + (int) (Math.random() * 800));
      System.out.println(this.name + " готов");
      race.getCyclicBarrier().await();

      for (int i = 0; i < race.getStages().size(); i++) {
        race.getStages().get(i).go(this);
      }
      race.lineFinish(this);
      race.getCyclicBarrier().await();
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  public int getCARS_COUNT() {
    return CARS_COUNT;
  }

  public Race getRace() {
    return race;
  }
}
