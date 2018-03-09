package com.shop.shelf;

import com.shop.position.Position;

import com.shop.position.impl.Apple;
import com.shop.position.impl.abst.AbstractPosition;

import com.shop.shelf.Shelf;


public class ShelfApple implements Shelf

{

    private static final int SIZE = 100000;
    //то есть мы можем максимально поместить 100000 объектов(яблок) в массив.
    //ок, это наш массив с яблоками
    private static Apple[] appleArray =  new Apple[SIZE];
    public int sizeAShelf;


    public ShelfApple(int sizeAShelf, Apple[] applRay)
    {
        this.appleArray = applRay;

    }

    // Не могу понять до конца AbstractPosition класс, для чего он абстрактный, то бишь чтобы можно было его
    // использовать для объектов с разными параметрами / разных объектов?
    //

    // Мы здесь в качестве аргумента используем объект класса AbstractPosition ??
    public boolean put(AbstractPosition position)
    {
        sizeAShelf ++;

        //*** Не могу понять справа от знака =, и для чего Apple в скобках.
        appleArray[sizeAShelf] = (Apple) position;
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
