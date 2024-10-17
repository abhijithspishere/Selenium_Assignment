package Javalearn.day8;

import java.util.ArrayList;

public class ArrayList_CommonElements {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 6, 8, 9};
        int[] arr2 = {5, 6, 8, 19, 11};

        ArrayList<Integer> arrList = new ArrayList();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    arrList.add(arr1[i]);
                }
            }
        }
        System.out.println("Common Elements"+arrList);

    }
}
