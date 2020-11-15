package review;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please provide a number");
        int num= scanner.nextInt();
        scanner.close();

        boolean prime=true;


        if(num!=1) {
            for (int i = 2; i < num; i++) {
                System.out.println("Number is:" + num + ", This is i:" + i);
                System.out.println("The remainder is:" + num % i);
                if (num % i == 0) {
                    prime = false;
                }

            }
            System.out.println("Is " + num + " a prime number?->" + prime);
        }
        System.out.println("Is " + num + " a prime number?-> false");

    }
}
