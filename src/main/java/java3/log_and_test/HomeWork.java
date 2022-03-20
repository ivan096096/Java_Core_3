package java3.log_and_test;

import java.util.Arrays;

public class HomeWork {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(remainder_After_4()));
    System.out.println(oneAND_4(new int[]{1, 1, 1, 1, 1, 1}));
    System.out.println(oneAND_4(new int[]{4, 4, 4, 4, 4, 4, 4}));
    System.out.println(oneAND_4(new int[]{1, 1, 3, 4, 4, 1}));
    System.out.println(oneAND_4(new int[]{1, 4, 1, 4, 1, 1, 4}));
  }

  public static boolean oneAND_4(int[] array) {

    boolean nam1 = false;
    boolean nam4 = false;
    for (int j : array) {
      if (j == 1) {
        nam1 = true;
      } else if (j == 4) {
        nam4 = true;
      } else {
        return false;
      }


    }
    return nam1 && nam4;
  }


  public static int[] remainder_After_4() {
    int[] array = new int[]{1, 5, 4, 9, 7, 7, 3};
    for (int i = 0; i < array.length; i++) {
      if (array[i] == 4) {
        return Arrays.copyOfRange(array, i + 1, array.length);
      }
    }

    return array;
  }

}
