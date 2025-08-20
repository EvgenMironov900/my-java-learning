
/*
Определить интерфейс для целочисленного стека.
Назoвитe этoт файл 260 IFTest.java
*/
interface IntStack {
  void push(int item); // сохранить элемент
  int pоp(); // извлечь элемент
}
// Реализация IntStack, использующая хранилище фиксированной длины.
class FixedStack implements IntStack {
  private int[] stck;
  private int tos;
  // Разместить в памяти и инициализировать стек.
  FixedStack(int size) {
    stck = new int[size];
    tos = -1;
  }
  // Поместить элемент в стек.
  public void push(int item) {
    if(tos==stck.length-1) // использовать член length
      System.out.println("Cтeк полон.");
    else
     stck[++tos ] = item;
  }
  // Извлечь элемент из стека.
  public int pоp() {
    if(tos < 0) {
      System.out.println("Cтeк опустошен.");
      return 0;
    }
    else
      return stck[tos--];
  }
}
class IFTest {
  public static void main(String[] args) {
    FixedStack mystack1 = new FixedStack(5);
    FixedStack mystack2 = new FixedStack(8);
    // Поместить несколько чисел в стеки.
    for(int i=0; i<5; i++) mystack1.push(i);
    for(int i=0; i<8; i++) mystack2.push(i);
    // Извлечь эти числа из стеков.
    System.out.println("Cтeк в mystack1 :");
    for(int i=0; i<5; i++)
      System.out.println(mystack1.pоp());
    System.out.println("Cтeк в mystack2 :");
    for(int i=0; i<8; i++)
      System.out.println(mystack2.pоp());
  }
}

/*
Рeзультат рабoты прoграммы:

Cтeк в mystack1 :
4
3
2
1
0
Cтeк в mystack2 :
7
6
5
4
3
2
1
0
*/

