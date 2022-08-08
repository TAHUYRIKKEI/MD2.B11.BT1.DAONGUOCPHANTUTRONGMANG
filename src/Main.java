import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        System.out.println("dao mang so nguyen");
        Stack<Integer> stack= new Stack<>();
        int[]array= {3,1,4,61,5,75};
        for (int i=0; i< array.length;i++){
            stack.push(array[i]);
        }
        System.out.println(stack);
        for (int i=0; i< array.length; i ++){
            array[i]=stack.pop();
        }
        System.out.println(Arrays.toString(array));
        System.out.println("dao nguoc chuoi");
    }
}