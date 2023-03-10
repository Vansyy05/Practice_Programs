package Practice_Set4;

import java.util.Scanner;
public class Website {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1).org");
        System.out.println("2).com");
        System.out.println("3).in");
        System.out.println("Enter number:");
        int option= sc.nextInt();
        switch (option){
            case 1:
                System.out.println("Organization website");
                break;
            case 2:
                System.out.println("Commercial website");
                break;
            case 3:
                System.out.println("Indian website");
                break;
        }
    }
}
