package model;

import java.util.ArrayList;

public class Duracell<T>{
    private ArrayList<T> list;

    public Duracell() {
        this.list = new ArrayList<T>();
    }

    public void add(T element){
        list.add(element);
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public T peek(){
        return list.get(list.size()-1);
    }

    public T pop() throws PopingAnEmptyStack {
        if (list.isEmpty())throw new PopingAnEmptyStack();
        return list.remove(list.size()-1);
    }
}
