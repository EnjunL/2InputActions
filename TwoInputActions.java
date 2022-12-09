import java.util.*;
public class TwoInputActions {
    public static void main(String[] args) {
       Scanner twoUser = new Scanner(System.in);
        System.out.println("Hi please enter 2 whole numbers");
        int oneNum = twoUser.nextInt();
        int twoNum = twoUser.nextInt();
        System.out.println("What would you like to do with these numbers?");
        System.out.println("type 1 for MULTIPLY");
        System.out.println("type 2 for DIVIDE");
        System.out.println("type 3 for EXPONENT");
        System.out.println("type 4 to add one to each number and return both numbers");
        int choice = twoUser.nextInt();
        if (choice == 1){
            Multiply(oneNum,twoNum);
        } else if (choice == 2) {
            Divide(oneNum,twoNum);
        } else if (choice == 3) {
            Exponent(oneNum,twoNum);
        } else if (choice == 4) {
            IncOne(oneNum,twoNum);
        } else {
            System.out.println("incorrect input try again");
        }

    }
    public static void Multiply(int one, int two){
        System.out.println(one*two);
    }
    public static void Divide(int one, int two){
        System.out.println(one/two);
    }
    public static void Exponent(int one, int two){
        System.out.println(Math.pow(one,two));
    }
    public static void IncOne(int one, int two){
        one+=1;
        two+=1;
        System.out.println(one + " & " + two);
    }
}
