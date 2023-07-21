package com.javapractice;

public class TriangleChecker {
  enum Error {
    kValid, kNotValid, kNegative
  };

  //! Вершины
  int vertex_[] = new int[3];

  TriangleChecker(int vertex[]) {
    vertex_ = vertex;
  }

  void isTriangle() {
    int sum = vertex_[0] + vertex_[1] + vertex_[2];

    Error err = Error.kValid;
    for (int i = 0; i < vertex_.length; ++i) {
      if (vertex_[i] < 0) {
        err = Error.kNegative;
        break;
      }

      if (sum - vertex_[i] < vertex_[i]) {
        err = Error.kNotValid;
        break;
      }
    }

    switch (err) {
      case kNegative: {
        System.out.printf("С отрицательными числами ничего не выйдет!");
        break;
      }
      case kNotValid: {
        System.out.printf("Жаль, но из этого треугольник не сделать");
        break;
      }
      case kValid: {
        System.out.printf("Ура, можно построить треугольник!");
        break;
      }
    }
  }
}
