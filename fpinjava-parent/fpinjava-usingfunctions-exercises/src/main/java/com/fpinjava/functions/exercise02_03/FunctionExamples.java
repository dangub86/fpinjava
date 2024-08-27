package com.fpinjava.functions.exercise02_03;


public class FunctionExamples {

  public static final Function<Integer, Function<Integer, Integer>> add =
          arg -> (arg2 -> arg + arg2);

  public static final BinaryOperator add2 =  arg -> (arg2 -> arg + arg2);

  public static final BinaryOperator mult =  arg -> (arg2 -> arg * arg2);
}
