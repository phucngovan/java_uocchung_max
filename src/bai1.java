import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("nhập a:");
        a=sc.nextInt();
        System.out.println("nhập b:");
        b=sc.nextInt();
        a=Math.abs(a);
        b=Math.abs(b);
        if(a==0||b==0) {
            System.out.println("k co uoc chung");
        }
        while (a!=b) {
            if(a>b) {
                a=a-b;
            }else {
                b=b-a;
            }
        }
        System.out.println("greatest commom facter" + a);
    }
}
