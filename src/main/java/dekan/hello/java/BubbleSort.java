package dekan.hello.java;

import java.util.Scanner;

/**
 * Created by Denis_Kaganovich on 7/4/2017.
 */
public class BubbleSort {

    public static void main(String[] args) {
        System.out.println("..:: BUBBLE SORTING ::..");

        Scanner in = new Scanner(System.in);
        System.out.print("Введите величину алгоритма: ");
        int size = in.nextInt();
        int array[] = new int[size];
        int a, b, c;

        for (int i = 0; i < array.length; i = i + 1) {
            System.out.print("Введите значение " + i + " элеменета массива:");
            array[i] = in.nextInt();
        }

        print(array);

        for (a = array.length; a != 0; a--) {
            for (b = 0; b != a - 1; b++) {
                if (array[b] > array[b + 1]) {
                    c = array[b + 1];
                    array[b + 1] = array[b];
                    array[b] = c;
                }
                print(array);
            }
        }
    }

    private static void print(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i = i + 1) {
            System.out.printf("%d ", array[i]);
        }
        System.out.println("]");
    }
}
