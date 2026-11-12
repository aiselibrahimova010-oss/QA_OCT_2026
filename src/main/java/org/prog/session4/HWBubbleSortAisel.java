package org.prog.session4;
import java.util.Arrays;
public class HWBubbleSortAisel {
    public static void main(String[] args) {

        int[] numbers = {34, 20, 29, 33};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;


                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
