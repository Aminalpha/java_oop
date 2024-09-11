package com.myhouse.java_oop.exercice.tpinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TPDrawable {
    public static void main(String[] args) {
        Drawable cercle1 = new Cercle();
        Drawable cercle2 = new Cercle();
        Drawable rectangle1 = new Rectangle();

        Consumer<Integer> method1 = (n) -> { System.out.println(n); };
        Consumer<Integer> method2 = (n) -> System.out.println(n);

        List<Drawable> listDrawable = new ArrayList<Drawable>();
        listDrawable.add(cercle1);
        listDrawable.add(cercle2);
        listDrawable.add(rectangle1);
        //(Drawable drawable) -> drawable.draw();
        listDrawable.stream().forEach((Drawable drawable) -> drawable.draw());
    }

}
