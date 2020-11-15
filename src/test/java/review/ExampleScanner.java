package review;

import java.util.Scanner;

public class ExampleScanner {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please provide your full name");
        String fullNmae = scanner.nextLine();
        System.out.println("Hello "+fullNmae);
        scanner.close();
    }
}
