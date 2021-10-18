package ru.dataart.academy.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Calculator {
    /**
     * @param firstNumber  - list for first number in reversed order (1 - 2 - 3 -> 321)
     * @param secondNumber - list for second number in reversed order (1 - 2 - 3 -> 321)
     * @return - sum of firstNumber + secondNumber
     */
    public Integer getSum(List<Integer> firstNumber, List<Integer> secondNumber) {
        int first = 0;
        int second = 0;

        int k = 1;
        for (Integer value : firstNumber){
            first += value * k;
            k *= 10;
        }

        k = 1;
        for (Integer value : secondNumber){
            second += value * k;
            k *= 10;
        }

        return first + second;
    }

    /**
     *
     * @param list - list of elements
     * @param <T> - type of element
     * @return - odd list elements
     * Example: [1, 22, 34] -> [1, 34]
     */
    public <T> List<T> getOddElements(List<T> list) {
        List<T> result = new ArrayList<>();

        int i = 0;
        for (T value : list){
            if (i % 2 == 0){
                result.add(value);
            }
            i++;
        }

        return result;
    }

    /**
     *
     * @param list - list of elements
     * @param <T> - type of element
     * @return - first and last elements of the list
     * Example: [1, 2, 3] -> [1, 3]
     * [1, 2, 3 , 4] -> [1, 4]
     */
    public <T> List<T> getBounds(List<T> list) {
        List<T> result = new ArrayList<T>();

        if (list.size() == 1){
            result.add(list.get(0));
        }
        else if (list.size() > 1){
            result.add(list.get(0));
            result.add(list.get(list.size() - 1));
        }

        return result;
    }
}
