package com.example.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

    List<String> getBrands(String color){
        List<String> brands = new ArrayList<>();

        if (color.equals("Легкое")) {
            brands.add("Жигулевское");
            brands.add("Колос");
            brands.add("Московское");
        }
        if (color.equals("Пшеничное")) {
            brands.add("Новое");
            brands.add("Космос");
            brands.add("Пикантное");
        }
        if (color.equals("Светлое")) {
            brands.add("Арсенальное");
            brands.add("Балтика 7");
            brands.add("Ростов");
        }
        if (color.equals("Темное")) {
            brands.add("Балтика 8");
            brands.add("Застава");
        }
        return brands;
    }
}
