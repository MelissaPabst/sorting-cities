package org.launchcode.comparators;

import org.launchcode.City;

import java.util.Comparator;

public class AreaComporator implements Comparator<City> {

    @Override
    public int compare(City o1, City o2) {
        //this comparator imposes orderings that are inconsistent with equals
        Double area1 = o1.getArea();
        Double area2 = o2.getArea();
        return area1.compareTo(area2);
    }
}
