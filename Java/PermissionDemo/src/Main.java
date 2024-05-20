import com.example.permission1.AccessPermission;
import com.example.permission2.IneritanceAccess;
import com.example.permission2.OtherAccess;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AccessPermission accessPermission = new AccessPermission();
        accessPermission.access();

        IneritanceAccess ineritanceAccess = new IneritanceAccess();
        ineritanceAccess.access();

        OtherAccess otherAccess = new OtherAccess();
        otherAccess.access();
    }
}