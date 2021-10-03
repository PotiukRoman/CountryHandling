package com.isg.operations;
import com.isg.common.Country;
import java.util.Comparator;

public class SortIndepYear implements Comparator<Country>{
    @Override
    public int compare(Country o1, Country o2) {
        return o2.getIndepYear()-o1.getIndepYear();

    }
}


