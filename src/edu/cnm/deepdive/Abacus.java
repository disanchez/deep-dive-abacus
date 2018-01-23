package edu.cnm.deepdive;

import java.util.Arrays;


public class Abacus {

  public static void main(String[] args) {
    double sum = 0;
    for (String s : args) {
      sum += Double.parseDouble(s);
    }
   // System.out.println(sum = '');
    // System.out.println (sum);

    System.out.printf ("Sum of %1$s = %2$5.2f (%2$f)%n", Arrays.toString(args), sum);
  }

}