package by.itstep.zimin;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {


        System.out.print(minValue(4, 34, 47) + "\n");
        System.out.print(minValue(467l, 33l, 47l) + "\n");
        System.out.print(minValue(4.8, 2.9, 1.3)+"\n");
       // System.out.println(minValue("jhk", "kkkl", 23));

        Double[] array = {1.2, 2.3, 3.4, 4.5, 2.3};
        Integer[] array1 = {3, 34, 45, 56, 4, 8};
        System.out.println(findMaxValueInArray(array));
        System.out.println(findMaxValueInArray(array1));

    }

    /**
     * Задача 2
     * Напишите общий метод, который возвращает минимальное значение из трех переданных параметров.
     */
    private static <E> E minValue(E el1, E el2, E el3) throws IllegalArgumentException {
        E result = null;
        if (el1 instanceof Integer && el2 instanceof Integer && el3 instanceof Integer) {

            System.out.print("E = Integer = ");
            result = (E) new Integer(Math.min(Math.min((Integer) el1, (Integer) el2), (Integer) el3));
            return result;
        }
        if (el1 instanceof Double && el2 instanceof Double && el3 instanceof Double) {

            result = (E) new Double(Math.min(Math.min((Double) el1, (Double) el2), (Double) el3));
            System.out.print("E = Double = ");

            return result;
        }
        if (el1 instanceof Long && el2 instanceof Long && el3 instanceof Long) {

            result = (E) new Long(Math.min(Math.min((Long) el1, (Long) el2), (Long) el3));
            System.out.print("E = Long = ");
            return result;
        }
        if (el1 instanceof Float && el2 instanceof Float && el3 instanceof Float) {

            result = (E) new Float(Math.min(Math.min((Float) el1, (Float) el2), (Float) el3));
            System.out.println("E = Float = ");
            return result;
        }
        if (result == null) {
            throw new IllegalArgumentException("\n Parameter is wrong");

        }
        return result;

    }

    /**
     * Задача 4
     * Реализуйте общий метод для поиска максимального значение в массиве.
     */
    private static <E> E findMaxValueInArray(E[] arr) {
        E result = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Integer) {
                if ((Integer) result < (Integer) arr[i]) {
                    result = arr[i];
                }
            } else if (arr[i] instanceof Double) {
                if ((Double) result * 100 < (Double) arr[i] * 100) {
                    result = arr[i];
                }
            }
        }
        return result;
    }

}
