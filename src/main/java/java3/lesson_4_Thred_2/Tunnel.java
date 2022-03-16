package java3.lesson_4_Thred_2;

import java.util.concurrent.Semaphore;

public class Tunnel extends Stage {
  private final Semaphore semaphore;

  public Tunnel(int width, int length) {
    this.length = length;
    this.description = "Тоннель " + length + " метров";
    this.semaphore = new Semaphore(width);
  }


  @Override
  public void go(Car c) {
    try {
      try {
        System.out.println(c.getName() + " готовится к этапу(ждет): " + description);
        semaphore.acquire();
        System.out.println(c.getName() + " начал этап: " + description);
        Thread.sleep(length / c.getSpeed() * 1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      } finally {
        System.out.println(c.getName() + " закончил этап: " + description);
        semaphore.release();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  }

