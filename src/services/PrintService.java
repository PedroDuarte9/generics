package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService {
    private List<Integer> list = new ArrayList<>();

    public void addValue(int value){
       list.add(value);
    }

    public int first(){
        if(list.isEmpty()){
            throw  new IllegalStateException("Esta lista está vazia");
        }
            return list.get(0);

    }

    public void print(){
            if(!list.isEmpty()){
                System.out.println(list.get(0));
            }
        for (int i = 1; i < list.size(); i++){
            System.out.println(list.get(i));
        }


    }
}
