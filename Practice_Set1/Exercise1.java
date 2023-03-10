import java.util.*;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner marks=new Scanner(System.in);
        System.out.println("Enter marks of English: ");
        int english=marks.nextInt();
        System.out.println("Enter marks of Grammar: ");
        int grammar=marks.nextInt();
        System.out.println("Enter marks of Hindi: ");
        int hindi=marks.nextInt();
        System.out.println("Enter marks of Gujarati: ");
        int gujarati=marks.nextInt();
        System.out.println("Enter marks of Mathematics: ");
        int maths=marks.nextInt();
        float total=((english+grammar+hindi+gujarati+maths)/500.0f)*100;
        System.out.println(total);
    }


}
