import javax.swing.*;

class SwingDemo {
SwingDemo() {
// создание контейнера верхнего уровия (JFrame) .
JFrame jfrm = new ОЕгапе ("А Simple Swing Program");

// Установка начальных размеров фрейма.
jfrm.setSize(275, 100);

// Завершение программы при закрытии пользователем
// окна приложения.
jfrm. setDefaultCloseOperation (JFrame .EXIT_ON_CLOSE) ;

// создание метки.
JLabel jlab = new JLabel("Swing powers the modern Java GUI.");

// Включение метки в состав панели содержимого.
jfrm.getContentPane() .add(jlab);
`

// отображение фрейма.
jfrm. setVisible (true) ;

}

public static void main(String агдз[]) {
// Cosmanne фрейма в потоке обработки событий.
SwingUtilities.invokeLater (new Runnable{) {
public void гип(} {
new SwingDemo();
}
});

