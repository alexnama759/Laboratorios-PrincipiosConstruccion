import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner scann = new Scanner(System.in);

        System.out.println("Ingrese el número final");
        int num1 = scann.nextInt();

        FizzBuzz fizzBuzz = new ConsoleBasedFizzBuzz();
        fizzBuzz.print(1, num1);

    }

    interface FizzBuzz {
        void print(int from, int to);
    }

    static class ConsoleBasedFizzBuzz implements FizzBuzz {
        @Override
        public void print(int from, int to) {
            while (from <= to) {
                if (from % 15 == 0) {
                    System.out.println("FizzBuzz");
                } else if (from % 5 == 0) {
                    System.out.println("Buzz");
                } else if (from % 3 == 0) {
                    System.out.println("Fizz");
                } else {
                    System.out.println(from);
                }
                from++;
            }
        }
    }
}

