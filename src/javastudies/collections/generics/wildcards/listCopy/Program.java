package javastudies.collections.generics.wildcards.listCopy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Integer>integerList = Arrays.asList(1,2,3,4);
        List<Double>doubleList = Arrays.asList(3.14,6.28);
        List<Object>objectList = new ArrayList<>();

        copy(integerList, objectList);
        print(objectList);
        copy(doubleList, objectList);
        print(objectList);


    }

    public static void copy (List<?  extends Number> source, List<? super Number> destination){
        for (Number number : source){
            destination.add(number);
        }
    }

    public static void print (List<?> list){
        for (Object object : list){
            System.out.print(object + " ");
        }
        System.out.println();
    }
}
