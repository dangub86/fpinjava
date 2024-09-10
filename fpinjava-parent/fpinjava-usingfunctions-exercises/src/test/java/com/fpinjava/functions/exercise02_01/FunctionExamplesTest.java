package com.fpinjava.functions.exercise02_01;

import static com.fpinjava.functions.exercise02_01.FunctionExamples.compose;
import static com.fpinjava.functions.exercise02_01.FunctionExamples.triple;
import static com.fpinjava.functions.exercise02_01.FunctionExamples.square;
import static org.junit.Assert.*;

import org.junit.Test;

public class FunctionExamplesTest {

  @Test
  public void testCompose() {
    assertEquals(Integer.valueOf(6), triple.apply(2));
    assertEquals(Integer.valueOf(4), square.apply(2));
    assertEquals(Integer.valueOf(36), square.apply(triple.apply(2)));
    assertEquals(Integer.valueOf(27), compose(triple, square).apply(3));
  }

  @Test
  public void testOverflowRisks() {
    int fnum = 10_000;
    Function<Integer, Integer> g = x -> x;
    Function<Integer, Integer> f = x -> x + 1;

    for (int i = 0; i < fnum; i++) {
      g = compose(f, g);
    };

    System.out.println(g.apply(0));
  }


}
