import java.util.Arrays;

public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] arr = generateRandomArray();
        int sum = 0;

        for (int element : arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println("Задание 2");
        int maxWeight = 100_000;
        int minWeight = 200_000;
        for (final int a : arr) {
            if (a > maxWeight) {
                maxWeight = a;
            }
        }
        for (int j : arr) {
            if (j < minWeight) {
                minWeight = j;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minWeight + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxWeight + " рублей");

        System.out.println("Задание 3");
        System.out.println("Средняя сумма трат за месяц составила " + (double) sum / 30 + " рублей");

        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'i', ' ', 'v', 'o', 'n', 'a', 'v', 'i'};
        for (int i = reverseFullName.length - 1; i != -1; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}




