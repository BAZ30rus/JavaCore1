package lesson3;

import java.lang.reflect.Array;

public class GenType<T> {
    private T[] obj;

    public GenType(T... obj){
        this.obj = obj;
    }

    public T getValue(T obj){
        return obj;
    }

    public void setValue(T obj){

    }

    public void shuffleArray(int pos1, int pos2){
        T val1 = getValue(obj[pos1]);
        T val2 = getValue(obj[pos2]);
        obj[pos2] = val1;
        obj[pos1] = val2;
    }

    public void printArray(){
        for (int i = 0; i < obj.length; i++) {
            System.out.print(obj[i] + " ");
        }
        System.out.println();
    }
}
