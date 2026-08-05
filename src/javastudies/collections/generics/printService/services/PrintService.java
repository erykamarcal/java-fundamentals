package javastudies.collections.generics.printService.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService <T> {
    private List<T> integers = new ArrayList<>();

    public void addValue(T value){
        integers.add(value);
    }

    public T firstNumber(){
        if (integers.isEmpty()){
            throw new IllegalArgumentException("List is empty");
        }
        return integers.getFirst();
        }
    public void print(){
        System.out.print("[");
        if (!integers.isEmpty()){
            System.out.print(integers.getFirst());
        }
        for (int i = 1; i < integers.size(); i++) {
            System.out.print("," + integers.get(i));
        }
        System.out.println("]");
    }

    }

