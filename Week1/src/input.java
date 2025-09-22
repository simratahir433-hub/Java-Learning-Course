import java.util.Scanner;

public class input {
    public static void main (String[] args){
        Scanner scanner= new Scanner (System.in);
        String name;
        int age;
        System.out.print("Enter your name:");
        name= scanner.nextLine();
        System.out.print("Enter your age:");
        age= scanner.nextInt();
        // scanner.close();
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);

        //operators
        int firstnumber;
        int secondnumber;
        int sum;
        System.out.print("Enter first number:");
        firstnumber= scanner.nextInt();
        System.out.print("Enter second number:");
        secondnumber= scanner.nextInt();

        sum= firstnumber + secondnumber;
        System.out.println("The sum of "+firstnumber+" and "+secondnumber+" is: "+sum);
    }
}
