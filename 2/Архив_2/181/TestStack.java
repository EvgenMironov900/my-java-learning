/*
Этот класс реализует стек целых чисел, который может хранить 10 значений
Назовите этот файл 181 TestStack.java
*/
class Stack {
  int[] stck = new int[ 10];
  int tos;
  // Инициализировать верхушку стека.
  Stack() {
    tos = -1;
  }
  // Поместить элемент в стек.
  void push(int item) {
    if(tos==9)
      System.out. println("Cтeк полон. ");
    else
      stck[++tos] = item;
  }
  // Извлечь элемент из стека.
  int pop() {
    if(tos < 0) {
      System.out.println("Cтeк опустошен.");
      return 0;
    }
    else
      return stck[tos--];
  }
}

class TestStack {
  public static void main(String[] args) {
    Stack rnystack1 = new Stack();
    Stack rnystack2 = new Stack();
    // Поместить несколько чисел в стеки.
    for(int i=0;i<10; i++) rnystack1.push(i);
    for(int i=10; i<20; i++ ) rnystack2.push(i);
    // Извлечь эти числа из стеков.
    System.out.println("Cтeк в rnystack1 :");
    for(int i=0;i<10; i++)
    System.out.println(rnystack1.pop());
    System.out.println("Стек в rnystack2 : ");
    for(int i=0;i<10; i++)
    System.out.println(rnystack2.pop( ));
  }
}

/*
Результат работы программы:

Cтeк в rnystack1 :
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
Стек в rnystack2 : 
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
*/

