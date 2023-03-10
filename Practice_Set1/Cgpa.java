package Practice_Set1;

import java.util.Scanner;

public class Cgpa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Subject1: ");
        int sub1=sc.nextInt();
        System.out.println("Enter Subject2: ");
        int sub2=sc.nextInt();
        System.out.println("Enter Subject3: ");
        int sub3=sc.nextInt();
        float total=(sub1+sub2+sub3)/30;
        System.out.println("CGPA is: "+total);
    }
}
