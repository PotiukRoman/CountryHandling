package com.isg.common;

public class Country implements Comparable<Country>{
    private String name;
    private String continent;
    private int indepYear;
    private String capital;
    private int population;

    public Country(String name, String continent, int indepYear, String capital, int population) {
        this.name = name;
        this.continent = continent;
        this.indepYear = indepYear;
        this.capital = capital;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public int getIndepYear() {
        return indepYear;
    }

    public void setIndepYear(int indepYear) {
        this.indepYear = indepYear;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }


    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", continent='" + continent + '\'' +
                ", indepYear=" + indepYear +
                ", capital='" + capital + '\'' +
                ", population=" + population +
                '}';
    }

    @Override
    public int compareTo(Country o) {
        return name.compareTo(o.name);
    }
}
