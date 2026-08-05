package javastudies.collections.generics.maxElement.service;

import java.util.List;

public class CalculationService {
    public static <T extends Comparable<T>> T max(List<T> integers) {
        if (integers.isEmpty()) {
            throw new IllegalArgumentException("List can't be empty!");
        }
        T max = integers.getFirst();
        for (T number : integers) {
            if (number.compareTo(max) > 0) {
                max = number;
            }
        } return max;
    }
}
