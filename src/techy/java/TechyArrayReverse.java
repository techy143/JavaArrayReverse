package techy.java;

import java.util.Scanner;

public class TechyArrayReverse {

    public static void main(String[] args) {

        // Reversing an integer.
        Scanner input = new Scanner(System.in);

        int num, sum = 0, t, r;

        System.out.println("Enter any Number");
        num = input.nextInt();
        t = num;

        while (t != 0) {

            r = t % 10;
            sum = sum * 10 + r;
            t = t / 10;
        }
        System.out.println("Reverse = " + sum);

    }
}
