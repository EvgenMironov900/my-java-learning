/*
 Демонстрация использования классов Timer и TimerTas k .
Нaзoвитe этoт фaйл 769 TTest.java
*/

import java.util.*;
class MyTimerTask extends TimerTask {
  public void run() {
    System.out.println("Выполняется задача таймера.");
  }
}
class TTest {
  public static void main(String[] args) {
    MyTimerTask myTask = new MyTimerTask();
    Timer myTimer = new Timer();
    /* Установить начальную задержку в одну секунду
      и затем повторять каждые полсекунды.
    */
    myTimer.schedule(myTask, 1000, 500);
    try {
      Thread.sleep(5000);
    } catch (InterruptedException ехс) {}
    myTimer.cancel();
  }
}
/*
Peзyльтaт paбoты пpoгpaммы:

Выполняется задача таймера.
Выполняется задача таймера.
Выполняется задача таймера.
Выполняется задача таймера.
Выполняется задача таймера.
Выполняется задача таймера.
Выполняется задача таймера.
Выполняется задача таймера.
Выполняется задача таймера.
*/

