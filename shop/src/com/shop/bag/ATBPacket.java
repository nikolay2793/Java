package com.shop.bag;

import com.shop.position.Position;

import java.util.Arrays;
import java.util.Comparator;



/**
 * Created by cube on 21.02.2018.
 */
public class ATBPacket implements Bag {
    private static final int SIZE = 100000;

    private Position[] positions =  new Position[SIZE];

    private int realIndex =0;

    private int iteratorIndex = 0;

    @Override
    public int getNotUsedSize() {
        return SIZE - realIndex;
    }

    public void add(Position position){
        positions[realIndex++] = position;
    }




    public boolean haveNext(){
        return iteratorIndex<realIndex;
    }

    public Position next(){
        return positions[iteratorIndex++];
    }

    public void initIterator(){
        iteratorIndex = 0;
    }

    public void sort()
    {
        Arrays.sort(positions, new Comparator<Position>()
        {
            @Override
            public int compare(Position o1, Position o2)
            {

                if(o1.getPrice() < o2.getPrice())
                {
                    return -1;
                }
                else
                return 0;
            }
        });
    }
}
