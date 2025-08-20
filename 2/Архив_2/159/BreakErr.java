/*
Эта программа содержит ошибку
Назовите этот файл 159 BreakErr.java
*/

// Эта программа содержит ошибку. 
class BreakErr { 
  public static void main(String[] args) {
    one: for (int i=0; i< 3; i++) { 
      System.out.print("Пpoxoд " + i + ":");
    }
    for (int j=0; j<100; j++) {
      if (j == 10) break one; // ОШИБКА
      System.out.print(j +" ");
    }
  }
}

/*
Результат работы программы:

evgen@HP:~/EE/MyJAVA/0$ sh j
BreakErr.java:12: error: undefined label: one
      if (j == 10) break one; // ОШИБКА
                   ^
1 error
*/

