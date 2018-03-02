package com.shop.manager;

import com.shop.bag.Bag;

/**
 * Created by cube on 21.02.2018.
 */
public class ShopManager {

    public int sum(Bag bag) throws InterruptedException {
        int sum = 0;
        bag.initIterator();
        while (bag.haveNext()){
            System.out.println("PICK!!");
            sum +=bag.next().getPrice();
            Thread.sleep(1000);
        }
        System.out.println("vvasha suma sostavlaet " + sum);
        return sum;
    }
}
