package com.github.ljmatlight;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @author galsang
 * @date 2018/5/2
 */
public class HashMapStructure {

    public static void main(String[] args) {

        Country india = new Country("India", 1000);
        Country japan = new Country("Japan", 10000);

        Country france = new Country("France", 2000);
        Country russia = new Country("Russia", 20000);

        HashMap<Country, String> countryCapitalMap = new HashMap<>(16);
        countryCapitalMap.put(india, "Delhi");
        countryCapitalMap.put(japan, "Tokyo");
        countryCapitalMap.put(france, "Paris");
        countryCapitalMap.put(russia, "Moscow");

        //允许key 和 value 为 null
        countryCapitalMap.put(russia, null);
        countryCapitalMap.put(null, null);

        //put debug point at this line
        Iterator<Country> countryCapitalIter = countryCapitalMap.keySet().iterator();
        while (countryCapitalIter.hasNext()) {
            Country countryObj = countryCapitalIter.next();
            String capital = countryCapitalMap.get(countryObj);
            System.out.println(countryObj.getName() + "----" + capital);
        }
    }

}

class Country {

    /**
     * 国家名称
     */
    private String name;
    /**
     * 人口
     */
    private long population;

    public Country() {
    }

    public Country(String name, long population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    /**
     * If length of name in country object is even then return 31(any random number) and if odd then return 95(any
     * random number). This is not a good practice to generate hashcode as below method but I am doing so to give better
     * and easy understanding of hashmap.
     *
     * @return
     */
    @Override
    public int hashCode() {
        if (this.name.length() % 2 == 0) {
            return 31;
        } else {
            return 95;
        }
    }

    @Override
    public boolean equals(Object obj) {

        Country other = (Country) obj;
        if (name.equalsIgnoreCase((other.name))) {
            return true;
        }
        return false;
    }
}
