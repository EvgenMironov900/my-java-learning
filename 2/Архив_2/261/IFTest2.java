/*
 Реализовать "расширяемый" стек.
Назoвитe этoт файл 261 IFTest2.java
*/

interface IntStack {
  void push(int item); // сохранить элемент
  int pоp(); // извлечь элемент
}

class DynStack implements IntStack {
  private int[] stck;
  private int tos;
  // Разместить в памяти и инициализировать стек.
  DynStack(int size) {
    stck = new int[size];
    tos = -1;
  }
  // Поместить элемент в стек.
  public void push(int item) {
    // Если стек полон, тогда создать стек большего размера.
    if(tos==stck.length-1) {
      int[] temp = new int[stck.length * 2]; // удвоить размер
      for(int i=0; i<stck.length; i++) temp[i] = stck[i];
      stck = temp;
      stck[++tos] = item;
    }
    else
      stck[++tos] = item;
  }
  // Извлечь элемент из стека.
  public int pоp() {
    if(tos<0) {
      System.out.println("Cтeк опустошен.");
      return 0;
    }
    else
      return stck[tos--];
  }
}
class IFTest2 {
  public static void main(String[] args) {
    DynStack mystack1 = new DynStack(5);
    DynStack mystack2 = new DynStack(8);
    // Эти циклы заставляют увеличиваться каждый стек.
    for(int i=0; i<12; i++) mystack1.push(i);
    for(int i=0; i<20; i++) mystack2.push(i);
    System.out.println("Cтeк в mystackl : ");
    for(int i=0; i<12; i++)
      System.out.println(mystack1.pоp());
    System.out.println("Cтeк в mystack2 : ");
    for(int i=0; i<20; i++)
      System.out.println(mystack2.pоp());
  }
}

/*
Рeзультат рабoты прoграммы:

Cтeк в mystackl : 
11
10
9
8
7
6
5
4
3
2
1
0
Cтeк в mystack2 : 
19
18
17
16
15
14
13
12
11
10
9
8
7
6
5
4
3
2
1
0
*/

