package com.javapractice;
public class Soda {
  String dopink_ = "";
  Soda(String dopink) {
    dopink_ = dopink;
  }

  void showMyDrink() {
    if (dopink_.isEmpty()) {
      System.out.printf("Обычная газировка");
    } else {
      System.out.printf("Газировка со вкусом \"%s\"", dopink_);
    }
  }
}
