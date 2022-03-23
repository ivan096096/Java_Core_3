package java3.lesson_8_reflection;

public class Examples_Test {

  @BeforeSuite
  public static void START() {
    System.out.println("START");
  }

  @Test(priority = 1)
  public static void test1() {
    System.out.println("test 1");
  }

  @Test(priority = 2)
  public static void test2() {
    System.out.println("test 2");
  }

  @Test(priority = 4)
  public static void test3() {
    System.out.println("test 4");
  }

  @Test(priority = 6)
  public static void test4() {
    System.out.println("test 6");
  }

  @Test(priority = 10)
  public static void test5() {
    System.out.println("test 10");
  }

  @AfterSuite
  public static void STOP() {
    System.out.println("STOP");
  }

}