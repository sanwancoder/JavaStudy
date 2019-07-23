package com.wyfdc.go.designPattern.templateMethod;

public class TemplatePatternDemo {
  public static void main(String[] args) {

    Game game = new BasketBall();
    game.play();
    System.out.println();
    game = new Football();
    game.play();
  }
}
