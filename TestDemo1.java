/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2019-10-16
 * Time: 18:41
 */

public class TestDemo1 {

    public static int fac(int n) {
        if(n == 1) {
            return 1;
        }
        return n * fac(n-1);
    }
    //10  +  sum(9)
    public static int sum(int n) {
        if(n == 1) {
            return 1;
        }
        return n+sum(n-1);
    }
    //按顺序打印一个数字的每一位
    // (例如 1234 打印出 1 2 3 4)  123
    public static void func(int num) {
        if(num > 9) {
            func(num/10);//123  12  1
        }
        System.out.println(num%10);
    }

    //写一个递归方法，输入一个非负整数，
    // 返回组成它的数字之和. 例如，输入 1729,
    // 则应该返回1+7+2+9，  9+7+3+1
    //它的和是19   123
    public static int sumNum(int n) {
        if(n < 10) {
            return n;
        }
        //123
        return n%10+sumNum(n/10);
    }

    public static int fib(int n) {
        if(n == 1 || n==2) {
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
    //迭代-》循环
    public static int fib2(int n) {
        int f1 = 1;
        int f2 = 1;
        int f3 = 1;
        for (int i = 3; i <= n ; i++) {
            f3 = f1+f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }


    public static int forgDrop(int n) {
        if(n == 1) {
            return 1;
        }
        if(n == 2) {
            return 2;
        }
        return forgDrop(n-1) + forgDrop(n-2);
    }

    public static int forgDrop2(int n) {
        if(n == 1) {
            return 1;
        }
        if(n == 2) {
            return 2;
        }
        int f1 = 1;
        int f2 = 2;
        int f3 = 1;
        for (int i = 3; i <= n ; i++) {
            f3 = f1+f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }

    public static void main(String[] args) {
        System.out.println(forgDrop2(1));//1
        System.out.println(forgDrop2(2));//2
        System.out.println(forgDrop2(3));//3
        System.out.println(forgDrop2(4));//5
        //System.out.println(forgDrop(50));//....
    }

}
