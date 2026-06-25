//使用双循环来表示乘法表
public class MultiplicationTable {
    public static void tableOfTime() {
        for (int i = 1; i < 10; i++) {
            for (int g = 1; g <= i; g++) {
                //  \n表示换行
                //  \t表示空格
                System.out.println(i + "x" + g + "=" + i * g + "\n");
            }
        }

    }
    public static void main(String[] args) {
        tableOfTime();
    }
}
