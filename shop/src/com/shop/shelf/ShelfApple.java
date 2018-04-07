package com.shop.shelf;

import com.shop.position.Position;

import com.shop.position.impl.Apple;
import com.shop.position.impl.abst.AbstractPosition;

import com.shop.shelf.Shelf;


public class ShelfApple implements Shelf

{

    private static final int SIZE = 100000;

    private static Apple[] appleArray =  new Apple[SIZE];
    public int sizeAShelf;


    public ShelfApple(int sizeAShelf, Apple[] applRay)
    {
        this.appleArray = applRay;

    }

//тип переменной -- AbstractPosition
    public boolean put(AbstractPosition position)
    {


        //*** Не могу понять справа от знака =, и для чего Apple в скобках.
        appleArray[sizeAShelf] = (Apple) position;
        sizeAShelf ++;
        return true;
    }


    public AbstractPosition get()
    {
        appleArray[sizeAShelf] = null;
        sizeAShelf --;
        return appleArray[sizeAShelf];
    }

    public boolean checkAvailable()
    {
        if (sizeAShelf > 0)
        {
            return  true;
        }
        else
            return  false;

    }


}
