package java3.lesson_4_Thred_2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CyclicBarrier;

//Гонка
public class Race {

  private int CARS_COUNT;
  private final ArrayList<Stage> stages;
  private final CyclicBarrier cyclicBarrier;
  private int finishCount;
  private RaceState state;





  public Race(int CARS_COUNT,Stage... stages) {
    this.stages = new ArrayList<>(Arrays.asList(stages));
    this.CARS_COUNT = CARS_COUNT;
    this.cyclicBarrier = cyclicBarrier();
    this.state = RaceState.READY;

  }

  public void theGameBegins() {
    System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
    Car[] cars = new Car[CARS_COUNT];
    for (int i = 0; i < cars.length; i++) {
      cars[i] = new Car(this, 20 + (int) (Math.random() * 10));
    }
    for (int i = 0; i < cars.length; i++) {
      new Thread(cars[i]).start();
    }
  }

  private CyclicBarrier cyclicBarrier() {
    return new CyclicBarrier(CARS_COUNT, () -> {
      switch (state) {
        case PROCESS -> System.out.println("\nВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
        case READY -> {
          System.out.println("\nВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");
          state = RaceState.PROCESS;
        }
      }

    });
  }

  public synchronized void lineFinish(Car car) {
    if (finishCount++ == 0) {
      System.out.printf("У нас есть победитель: %s\n", car.getName());
    } else {
      System.out.printf("%s пришел %sм\n", car.getName(), finishCount);
    }
  }
  private static enum RaceState {
    READY, PROCESS, FINISH
  }
  public int getCARS_COUNT() {
    return CARS_COUNT;
  }

  public CyclicBarrier getCyclicBarrier() {
    return cyclicBarrier;
  }

  public int getFinishCount() {
    return finishCount;
  }

  public RaceState getState() {
    return state;
  }

  public ArrayList<Stage> getStages() {
    return stages;
  }


}