import com.example.Keyboard;
import com.example.Laptop;
import com.example.Mouse;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        Keyboard keyboard = new Keyboard();
        Mouse mouse = new Mouse();

        laptop.start();
        System.out.println("\n鼠标相关操作:");
        System.out.println("============");
        laptop.pluginExternalHardware(mouse);

        System.out.println("\n键盘相关操作:");
        System.out.println("============");
        laptop.pluginExternalHardware(keyboard);

        laptop.shutdown();
    }
}