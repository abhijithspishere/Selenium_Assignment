package Javalearn.day8;

import java.util.ArrayList;
import java.util.Arrays;

public class First_LastinArrayList {
    public static void main(String[] args) {
        Integer[] arr1 = {5, 6, 7, 49};
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(arr1));
        System.out.println(arrList.get(0));
        System.out.println(arrList.get(arrList.size()-1));
    }
}