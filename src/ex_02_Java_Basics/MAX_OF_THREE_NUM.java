package ex_02_Java_Basics;

public class MAX_OF_THREE_NUM {
    static void main(String[] args) {
        int n1 = 2;
        int n2 = 9;
        int n3 = -11;
        int max = (n1 > n2) ?  n1 : (n2 > n3 ? n2 : n3);
        System.out.println("MAX OF THREE NUM = " + max);
    }
}
