package com.sandbox.app;

import java.util.Random;

class Main {
  public void doStuff(String s) {
    System.out.println("printing: " + s);
  }

  public static void main(String[] args) {
    new Main().doStuff("sup");
  }
}
