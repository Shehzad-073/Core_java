package DataTypes;

public class ByteDemo {
    static void main() {
        byte b = 10;
        System.out.println("value of b is " + b);
        b = 127;
        System.out.println("value of b is " + b);
//        b = 130; it is out of range from 127;
        b = (byte) 130;
        System.out.println("value of b is "+b);

        int x = 5;
        byte y = 0;
//        y = x;
        System.out.println("value of x is "+ x);

        float f = 12.6f;
        System.out.println(f);

        double pi = 3.14;
        System.out.println(pi);

        double d = 75000.00;
        d = 75e3;
        System.out.println(d);

        double dd = -0.000057;
        System.out.println(dd);
    }
}
