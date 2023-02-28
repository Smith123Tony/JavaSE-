import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Parallel
 * Date: 2023-02-27
 * Time: 15:54
 */
public class Test {
    public static void main1(String[] args) {
        //四则运算符
        System.out.println(2*4);
        System.out.println(4-2);
        System.out.println(5*3);
        System.out.println("===========");
        System.out.println(10/3);
        System.out.println(10/-3);
        System.out.println((-10/3));
        System.out.println(-10/-3);
    }

    public static void main2(String[] args) {
        //%运算符
        System.out.println(10%3);
        System.out.println(10%-3);
        System.out.println(-10%3);
        System.out.println(-10%-3);
    }

    public static void main3(String[] args) {
        //System.out.println(12.5%2);
        //System.out.println(4/0);
        //System.out.println(1+0.8);
    }

    public static void main4(String[] args) {
        //增量+=
        /*int a=10;
        a += 1;//等价于a = a + 1;*/
        /*int a = 10;
        long b = 20;
        //a = a + b;
        a += b;
        System.out.println(a);*/

        int a = 10;
        int b = 10;
        int c = 10;
        int d = 10;
        int e = 8;

        a += 5;
        System.out.println( a);

        b -= 3;
        System.out.println(b);

        c *= 2;
        System.out.println(c);

        d /= 2;
        System.out.println(d);

        e %= 3;
        System.out.println(e);
    }

    public static void main5(String[] args) {
      /*  int a = 10;
        int b = a--;
        System.out.println(b);*/
        int a = 10;
        a = a--;
        System.out.println(a);
    }

    public static void main6(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a<=b);
        System.out.println(a>=b);
    }

    public static void main7(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a == 10 && b == 20);
        System.out.println(a > 10 && b < 20);
    }

    public static void main8(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a == 10 || b == 20);
        System.out.println(a == 10 || b < 20);
        System.out.println(a == 100 || b == 200);
    }

    public static void main9(String[] args) {
        //逻辑非！
        int a = 1;
        System.out.println(!(a == 1));
        System.out.println(!(a != 1));
    }

    public static void main10(String[] args) {
        //短路求值
//        System.out.println(10 < 20 & 1 > 0);
//        System.out.println(10 < 20 | 1 >0);
//          System.out.println(10 > 20 & 10/0 == 0);//报错
//          System.out.println(10 < 20 | 10/0 ==0);//报错
    }

/*    public static void main(String[] args){
        //左移<<
*//*        //<<
        int a = 0x10;
        System.out.printf("%x\n",a<<1);*//*

        //右移>>
        int a = 0x10;
        System.out.printf("%x\n",a>>1);

        //无符号右移
        int b = -1;
        System.out.println(b >> 1);
        System.out.println(b >>> 1);
    }*/
    public static void main(String[] args) {
        //三目运算符
       /* int a = 10;
        int b = 20;
        int max = a>b?a:b;
        System.out.println(max);*/
    }
}
