package java3.lesson_3_Thread_1;


public class HomeWork_Thread_1 {

  private static Object mon = new Object();
  private static int currentLetter = 0;

  public static void main(String[] args) {
    new Thread(() -> {
      for (int i = 0; i < 5; i++) {
        synchronized (mon) {
          try {
            while (currentLetter != 0) {
              mon.wait();
            }
            printA();
            Thread.sleep(150);
            currentLetter = 1;
            mon.notifyAll();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      }
    }).start();


    new Thread(() -> {
      for (int i = 0; i < 5; i++) {
        synchronized (mon) {
          try {
            while (currentLetter != 1) {
              mon.wait();
            }
            printB();
            Thread.sleep(150);
            currentLetter = 2;
            mon.notifyAll();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      }
    }).start();

    new Thread(() -> {
      for (int i = 0; i < 5; i++) {
        synchronized (mon) {
          try {
            while (currentLetter != 2) {
              mon.wait();
            }
            printC();
            Thread.sleep(150);
            currentLetter = 0;
            mon.notifyAll();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      }
    }).start();

  }


  private static void printA() {
    System.out.println("A");
  }

  private static void printB() {
    System.out.println("B");
  }

  private static void printC() {
    System.out.println("C");
  }

}

