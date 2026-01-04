package ex_02_Java_Basics;

public class Incre_Decre {
    static void main(String[] args) {
        int a = 10;
        a = a++ + a++ + a++;
        System.out.println(a);

        int b = 3;
        b = b++ * ++b;
        System.out.println(b);

        int  c = 5;
        System.out.println(c++ + c--);


    }
}
