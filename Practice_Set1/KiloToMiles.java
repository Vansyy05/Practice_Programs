package Practice_Set1;

import java.util.Scanner;
public class KiloToMiles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Kilometer: ");
        double km= sc.nextFloat();
        double miles=km/1.609344;
        System.out.println("Miles is: "+ miles);
    }
}
