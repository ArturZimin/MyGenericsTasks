package by.itstep.zimin;

import java.lang.reflect.Array;

public class  MyGenericArray <E> {
    private E [] elements;

    public MyGenericArray(Class<E> clazz,int capacity){
        elements=(E[]) Array.newInstance(clazz,capacity);
    }

    /**
     * Общий массив для хранения элементов
     */
}
