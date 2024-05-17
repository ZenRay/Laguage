import com.example.Mouse;
import com.example.USB;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();

        // 调用重写方法
        mouse.close();

        // 调用接口的默认方法，在本示例中没有进行重写
        mouse.defaultClose();
        // 使用接口的静态方法
        System.out.print("使用接口的静态方法:\t");
        USB.staticClose();

        // 使用接口的成员变量
        System.out.print("使用接口的成语变量(默认是静态常量): " + Mouse.PRODUCT_COMPANY);

    }
}