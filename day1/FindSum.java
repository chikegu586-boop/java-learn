
//使用for循环求1-100的和
public class FindSum {
     public static void findSum() {
        //int[] nums = {8, 6, 5, 5, 10, 1, 9, 7, 56, 9};
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

    }
    public static void main(String[] args) {
        int[] nums = {8, 6, 5, 5, 10, 1, 9, 7, 56, 9};
        findSum();
    }
}
