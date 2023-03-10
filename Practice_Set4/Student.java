package Practice_Set4;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Subject1: ");
        int sub1 = sc.nextInt();
        System.out.println("Enter Subject2: ");
        int sub2 = sc.nextInt();
        System.out.println("Enter Subject3: ");
        int sub3 = sc.nextInt();
        int total=((sub1+sub2+sub3)/3);
        System.out.println("CGPA is: "+total);
       if(total>=40 && sub1>=33 && sub2>=33 && sub3>=33){
           System.out.println("Pass...");
       }else {
           System.out.println("Fail...");
       }
    }
}
