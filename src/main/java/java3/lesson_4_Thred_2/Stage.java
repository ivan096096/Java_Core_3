package java3.lesson_4_Thred_2;

public abstract class Stage {
  protected int length;
  protected String description;
  public String getDescription() {
    return description;
  }
  public abstract void go(Car c);
}