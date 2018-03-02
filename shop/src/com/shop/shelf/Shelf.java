package com.shop.shelf;

import com.shop.position.Position;
import com.shop.position.impl.abst.AbstractPosition;

public interface Shelf

{

    boolean put(AbstractPosition position);

    AbstractPosition get();

    boolean checkAvailable();

}
