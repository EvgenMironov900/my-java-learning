import javax.swing.*;
import java.awt.*;

public class HelloSwing {
    public static void main(String[] args) {
        // Создаем фрейм (окно)
        JFrame frame = new JFrame("Hello Swing!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // важно - закрывает программу
        
        // Создаем метку с текстом
        JLabel label = new JLabel("Hello Swing!", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 24));
        label.setForeground(Color.BLUE); // цвет текста
        
        // Настраиваем layout и добавляем метку
        frame.setLayout(new BorderLayout());
        frame.add(label, BorderLayout.CENTER);
        
        // Устанавливаем размер и позицию
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null); // центрируем окно
        
        // Делаем окно видимым
        frame.setVisible(true);
    }
}
