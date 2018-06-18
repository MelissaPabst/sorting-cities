package org.launchcode.comparators;



//results in sorting by population, from largest to smallest

import org.launchcode.City;

import java.util.Comparator;

public class PopulationComparator implements Comparator<City> {

    @Override
    public int compare(City o1, City o2){
        //refer to the City class' equals method to determine whether this Coomparator's orderings are consistent
        Integer population1 = o1.getPopulation();
        Integer population2 = o2.getPopulation();
        return population1.compareTo(population2);

    }
}
