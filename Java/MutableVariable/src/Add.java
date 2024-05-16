/**
 * 可变参数:
 * 1. 参数使用方式 <数据类型>...<变量名>
 * 2. 存在可变参数和不可变参数的时候，可变参数需要放到最后
 */
public class Add {
    public static int add(int...arr){
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        return result;
    }
}
