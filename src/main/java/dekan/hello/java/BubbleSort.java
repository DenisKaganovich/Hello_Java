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
        int sample[] = new int[size];
        int i;
        int a, b, c;

        for (i = 0; i < size; i = i + 1) {
            System.out.print("Введите значение " + i + " элеменета массива:");
            sample[i] = in.nextInt();
        }

        for (i = 0; i < size; i = i + 1) {
            System.out.print("Значение " + i + " элеменета массива: " + sample[i]+ "\n");
        }

        for (a=size; a!=0; a--)
            for (b=0; b!=a-1; b++){
            if (sample[b] > sample[b+1]){
                c =  sample[b+1];
                sample[b+1]= sample[b];
                sample[b] = c;
            }
         }

        for (i = 0; i < size; i = i + 1) {
            System.out.print("Значение " + i + " элеменета массива после сортировки: " + sample[i]+ "\n");
        }
    }
}
