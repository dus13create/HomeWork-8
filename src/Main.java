import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// task 1
        System.out.println("Задача 1,2");
        int[] number = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(number));
        double[] fractionalNumber = new double[3];
        fractionalNumber[0] = 1.57;
        fractionalNumber[1] = 7.654;
        fractionalNumber[2] = 9.986;
        System.out.println(Arrays.toString(fractionalNumber));
        int[] number2 = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(number2));
        // task 3
        System.out.println("Задача 3");
        for (int i = number.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(number[i]);
            } else {
                System.out.print(number[i] + ",");
            }
        }
        System.out.println();
        for (int j = number2.length - 1; j >= 0; j--) {
            if (j == 0) {
                System.out.print(number2[j]);
            } else {
                System.out.print(number2[j] + ",");
            }
        }
        System.out.println();
        for (int h = fractionalNumber.length - 1; h >= 0; h--) {
            if (h == 0) {
                System.out.print(fractionalNumber[h]);
            } else {
                System.out.print(fractionalNumber[h] + ",");
            }
        }
        System.out.println();
        // task 4
        System.out.println("Задача 4");
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 1) {
                number[i] += 1;
                System.out.println(number[i]);
            }
        }
    }
}