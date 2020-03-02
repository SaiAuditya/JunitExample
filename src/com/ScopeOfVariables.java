package com;
import java.io.*;
public class ScopeOfVariables {
  int i = 34;   // instance variable
  static int z; // class variable
  static {
    z = 10;
    System.out.println("inside static block: " + z);
  }
  void test() {
    int k = 200;  // local variable
    System.out.println("local variable: " + (k + i));
  }
  
}
