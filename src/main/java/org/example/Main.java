package org.example;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        People author = new People("Ievhen", "Nesterenko");
        Gson gson = new Gson();
        System.out.println(gson.toJson(author));
    }
}