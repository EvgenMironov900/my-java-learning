/*
Демонстрация работы return
Назовите этот файл 161 Return.java
*/

class Return { 
  public static void main(String[] args) {
    boolean t = true; // Это необходимо для обмана компилятора
    System.out.println("Пepeд оператором return.");
    if (t) return; // возвратить управление вызывающей стороне
    System.out.println("Этo выполняться не будет.");
  }
}

/*
Результат работы программы:

Пepeд оператором return.
*/

