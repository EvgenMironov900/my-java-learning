/*
В иерархии классов члены private остаются закрытыми по отношению к своему классу
Эта программа содержит ошибку и не скомпилируется.
Назoвитe этoт файл 219 Access.java
*/

// Создать суперкласс.
class А {
  int i; // стандартный доступ
  private int j; // закрыт по отношению к А
  void setij (int х, int у) {
    i = х;
    j = у;
  }
}
// Член j из класса А здесь недоступен.
class В extends А {
  int total;
  void sum () {
    total = i + j;  // ОШИБКА, член j здесь недоступен
  }
}
class Access {
  public static void main (String[] args) {
    В subOb = new В();
    subOb.setij (10, 12);
    subOb.sum();
    System.out.println ("Cyммa равна "+ subOb.total);
  }
}

/*
Рeзультат рабoты прoграммы:

Access219.java:20: error: j has private access in А
total = i + j;  // ОШИБКА, член j здесь недоступен
            ^
1 error
______________

Если закомментировать строку 20
Cyммa равна 0
*/


