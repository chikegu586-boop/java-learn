import java.util.Scanner;
//判断奇数偶数
public class JudgeOdd {
     public static void test() {
        //Scanner用法可以不需要在test()里面传参数
        //只需要使用时在terminal输入需要判断的值
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        //判断是否为偶数，取余之后等于0（偶数），否则奇数
        if (num % 2 == 0) {
            System.out.println(num + "为偶数");
        } else {
            System.out.println(num + "为奇数");
        }
    }
    public static void main(String[] args) {
        test();
    }
}
