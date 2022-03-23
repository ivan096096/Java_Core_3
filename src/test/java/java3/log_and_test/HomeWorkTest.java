package java3.log_and_test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class HomeWorkTest {


  @ParameterizedTest
  @MethodSource("Equals_array")
  public void Test_Array(int[] a, int[] result) {
    Arguments.arguments(result, HomeWork.oneAND_4(a));
  }

  public static Stream<Arguments> Equals_array() {
    List<Arguments> out = new ArrayList<>();
    out.add(Arguments.arguments(new int[]{1, 2, 4, 1, 1, 1},new int[]{1,1,1}));
    out.add(Arguments.arguments(new int[]{2, 5, 9, 3, 4, 4, 4},new int[]{4,4}));
    out.add(Arguments.arguments(new int[]{1, 1, 3, 4, 4, 1},new int[]{1}));
    out.add(Arguments.arguments(new int[]{1, 4, 1, 4, 1, 1, 5},new int[]{1,1,5}
        ));
    return out.stream();
  }

  @Test
  void oneAND_4() {
    Assertions.assertTrue(HomeWork.oneAND_4(new int[]{1,4,1,1,4,4,1}));
  }

  @Test
  void getInts() {
    Assertions.assertArrayEquals(HomeWork.remainder_After_4(),new int[]{9, 7, 7, 3});
  }
}
