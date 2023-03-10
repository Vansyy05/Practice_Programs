package Practice_Set1;

import java.util.Scanner;

public class SumOfThree {
    public static void main(String[] args) {
        Scanner three=new Scanner(System.in);
        System.out.println("Enter a: ");
        int a=three.nextInt();
        System.out.println("Enter b: ");
        int b=three.nextInt();
        System.out.println("Enter c: ");
        int c=three.nextInt();
        int sum=a+b+c;
        System.out.println("Sum is: "+sum);
    }
}
