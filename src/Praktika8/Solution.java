package Praktika8;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите последовательность чисел через пробел: ");
        String input = scanner.nextLine();

        String[] numbers = input.split(" ");
        printOddNumbers(numbers, 0);
    }

    public static void printOddNumbers(String[] numbers, int index) {
        if (index < numbers.length) {
            int number = Integer.parseInt(numbers[index]);
            if (number % 2 != 0) {
                System.out.println(number); // Вывод текущего числа, если оно нечетное
            }
            printOddNumbers(numbers, index + 1); // Рекурсивный вызов с увеличением индекса на 1
        }
    }
}


