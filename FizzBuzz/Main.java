// FizzBuzz

import java.util.Scanner;

import javax.sound.midi.Receiver;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number: ");
        int recievedNumber = scanner.nextInt();

        // If number divisible by both 5 and 3, return FizzBuzz
        // If number only divisible by 5, fizz
        // If number only divisible by 3, buzz
        // Else, return number given
        if (recievedNumber % 5 == 0 && recievedNumber % 3 == 0) {
            System.out.println("FizzBuzz");
        } else if (recievedNumber % 5 == 0) { 
            System.out.println("Fizz");
        } else if (recievedNumber % 3 == 0) {
            System.out.println("Buzz");
        } else { 
            System.out.println(recievedNumber);
        }

        scanner.close();
    }
}