//给定数组 {2,3,2,5,6,3,7}，遍历输出所有不重复数字，不使用集合。
public class RemoveSameNum{
    public static void removeNum(int[] arr) {
        boolean[] a = new boolean[100];
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (!a[num]) {//如果数字没有标记过，说明是首次出现
                System.out.println(arr[i]);
                a[num] = true;//标记数据，如果出现标记过的数据，将不会进入

            }
        }

    }
    public static void main(String[] args) {
        
    }
}