package day2;
//调换输入字符串的顺序
//e.g:
//输出前： 123456
//输出后：654321
public class SwitchWord {
     public static void switchWord(String target) {
        String result = "";
        //此循环用作于倒着遍历字符串
        for (int i = target.length() - 1; i >= 0; i--) {
            //charAt()这个方法用作与单个提取字符串
            //因为前面的for循环是倒序的，所以单个提取的顺序也是倒序的
            //所以最终的结果也是倒序的
            result = result + target.charAt(i);

        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        
        switchWord("123456");
    }
}
