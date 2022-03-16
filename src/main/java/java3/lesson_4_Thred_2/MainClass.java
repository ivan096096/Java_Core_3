package java3.lesson_4_Thred_2;

import java.util.concurrent.CountDownLatch;

public class MainClass {

  public static CountDownLatch cdl;


  public static void main(String[] args) {
   
    Race race = new Race(6,new Road(60),
                new Tunnel(2,60),
                new Road(40));

    race.theGameBegins();
  }


}

