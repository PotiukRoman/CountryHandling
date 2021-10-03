package com.isg.methods;
import com.isg.common.Country;
import com.isg.operations.MyGeneric;

import java.util.*;

public class AllMethodsInOne{
    public static String userChoice;
    public static String s;

    public static void fibonachiOut(MyGeneric<List<Country>> myGeneric){
        System.out.println("Mетод пролистує  ліст і виводить елементи, індекс яких співпадає з числом фібоначі");
        int a = 0;
        System.out.println(a+" елемент "+myGeneric.getValue().get(a));
        int b = 1;
        System.out.println(b+" елемент "+myGeneric.getValue().get(b));
        while (b<(myGeneric.getValue().size())-2){
            int next = a + b;
            System.out.println(next+" елемент "+myGeneric.getValue().get(next));
            a = b;
            b = next;
        }
    }

    public static String userChoice(){
        Scanner input=new Scanner(System.in);
        System.out.println("введіть тут --->");
        userChoice=input.nextLine();
        return userChoice;
    }


    public static void showObjectsThroughTheContinent(List<Country> list){
        int find = 0;
        System.out.println("Метод виводить всі країни залежно від континенту який введено з консолі");
        System.out.println("ДЛЯ ВИХОДУ НАТИСНІТЬ 0 ");
        System.out.println("Введіть континент");
        while (!(s=userChoice()).equals("0")){
            for (int i=0;i<list.size();i++){
                if( s.toLowerCase().equals( list.get(i).getContinent().toLowerCase()) ){
                    System.out.println(list.get(i));
                    find++;
                }
            }
            if(find==0){
                System.out.println("Жодної країни по цьому континенту не знайдено в колекції");
            }else {
                find=0;
            }
        }
        System.out.println("Вихід");
    }


    public static void showObjectThroughTheCapital(List<Country> list){
        int find = 0;
        System.out.println("Метод виводить обєкт країни в залежності від уведеної столиці");
        System.out.println("ДЛЯ ВИХОДУ НАТИСНІТЬ 0 ");
        System.out.println("Введіть столицю");
        while (!(s=userChoice()).equals("0")){
            for (int i=0;i<list.size();i++){
                if( s.toLowerCase().equals( list.get(i).getCapital().toLowerCase()) ){
                    System.out.println(list.get(i));
                    find++;
                }
            }
            if(find==0){
                System.out.println("Такої країни не знайдено");
            }else {
                find=0;
            }
        }
        System.out.println("Вихід");
    }


    public static void show(List<Country> list){
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println();
    }


    public static void sortByIndepYear(List list, Comparator comparator){
        System.out.println("Метод сортує колекцію  (по полю IndepYear) від найбільшого до найменшого числа та виводить в консоль.");
        Collections.sort(list,comparator);
        AllMethodsInOne.show(list);
    }

    public static void sortByNameDefault(List list){
        System.out.println("Метод сортує колекцію по дефолту (по полю name) за алфавітним порядком та виводить в консоль.");
        Collections.sort(list);
        AllMethodsInOne.show(list);
    }
}
