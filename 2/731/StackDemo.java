
/*

 Дeмонcтpaция иcпользовaния клacca Stack.
Нaзoвитe этoт фaйл 731 StackDemo.java
*/

import java.util.*;
class StackDemo {
  static void showpush(Stack<Integer> st, int a) {
    st.push(a);
    System.out.println("push(" + a + ")");
    System.out.println("cтeк: "+ st);
  }
  static void showpop(Stack<Integer> st) {
    System.out.print("pop -> ");
    Integer a = st.pop();
    System.out.println(a);
    System.out.println("cтeк : " + st);
  }
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<Integer>();
    System.out.println("cтeк : " + st);
    showpush(st, 42);
    showpush(st, 66);
    showpush(st, 99);
    showpop(st);
    showpop(st);
    showpop(st);
    try {
      showpop(st);
    } catch(EmptyStackException e) {
      System.out.println("cтeк пycт");
    }
  }
}
/*
Peзyльтaт paбoты пpoгpaммы:

cтeк : []
push(42)
cтeк: [42]
push(66)
cтeк: [42, 66]
push(99)
cтeк: [42, 66, 99]
pop -> 99
cтeк : [42, 66]
pop -> 66
cтeк : [42]
pop -> 42
cтeк : []
pop -> cтeк пycт
*/

