package com.javapractice;
public class Nikolay {
  String name_ = "";
  int age_ = 0;

  Nikolay(String name, int age) {
    name_ = name;
    age_ = age;
  }

  void printInfo() {
    if (name_ != "Николай") {
      System.out.printf("Имя: я не %s, а Николай, возраст: %d", name_, age_);
    } else {
      System.out.printf("Имя: %s, возраст: %i", name_, age_);
    }
  }
}
