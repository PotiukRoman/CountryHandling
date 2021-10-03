package com.isg;

import com.isg.common.Country;
import com.isg.methods.AllMethodsInOne;
import com.isg.operations.MyGeneric;
import com.isg.operations.SortIndepYear;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Country> countries=new ArrayList<>(15);

        Country france=new Country("French Republic","Europe",1789,"Paris",67413000);
        Country usa=new Country("United States of America","North America",1776,"Washington, D.C.",331449281);
        Country sudan=new Country("Republic of Sudan","Africa",1956,"Khartoum",44909353);
        Country turkey=new Country("Republic of Turkey","Asia",1923,"Ankara",83614362);
        Country venezuela=new Country("Bolivarian Republic of Venezuela","South America",1811,"Caracas",28887118);
        Country afghanistan=new Country("Islamic Emirate of Afghanistan","Asia",1919,"Kabul",32890171);
        Country brazil=new Country("Federative Republic of Brazil","South America",1822,"Brasília",210147125);
        Country colombia=new Country("Republic of Colombia","South America",1819,"Bogota",50372424);
        Country czechia=new Country("Czech Republic","Europe",1918,"Prague",10701777);
        Country eritrea=new Country("State of Eritrea","Africa",1993,"Asmara",6527000);
        Country finland=new Country("Republic of Finland","Europe",1809,"Helsinki",5536146);
        Country india=new Country("Republic of India","Asia",1947,"New Delhi",1352642280);
        Country china=new Country("People's Republic of China","Asia",1949,"Beijing",1411778724);
        Country canada=new Country("Canada","North America",1867,"Ottawa", 38131104);
        Country ecuador=new Country("Republic of Ecuador","South America",1809,"Quito",17715822);

        countries.add(france);
        countries.add(usa);
        countries.add(sudan);
        countries.add(turkey);
        countries.add(venezuela);
        countries.add(afghanistan);
        countries.add(brazil);
        countries.add(colombia);
        countries.add(czechia);
        countries.add(eritrea);
        countries.add(finland);
        countries.add(india);
        countries.add(china);
        countries.add(canada);
        countries.add(ecuador);

        AllMethodsInOne.show(countries);

        AllMethodsInOne.sortByNameDefault(countries);
        AllMethodsInOne.sortByIndepYear(countries,new SortIndepYear());
        AllMethodsInOne.showObjectThroughTheCapital(countries);
        AllMethodsInOne.showObjectsThroughTheContinent(countries);

        MyGeneric<List<Country>> myGeneric=new MyGeneric<>(countries);
        AllMethodsInOne.fibonachiOut(myGeneric);





    }
}
