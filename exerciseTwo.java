import java.util.Scanner;
public class exerciseTwo {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = Sc.nextInt();
        System.out.println("Your age is:" + age);

        System.out.println("Enter your name:");
        String name = Sc.next();
        System.out.println("Your name is:" + name);

        Sc.nextLine();
        System.out.println("Enter your full name:");
        String fullName = Sc.nextLine();
        System.out.println("Your full nmae is:" + fullName); 

        Sc.close();

    }
}
