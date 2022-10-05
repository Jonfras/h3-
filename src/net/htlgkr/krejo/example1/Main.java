package net.htlgkr.krejo.example1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Task t = new Task();
        Printable printDmgSorted  = (list) -> {
            list = t.sortCombatTypeFirst();
            list.forEach(System.out::println);

        };

        Printable printTable = (list) ->{
            /**int name = 17;
            int combatType = 6;
            int damageType = 8;
            int damage = 2;
            int speed = 1;
            int strength = 2;
            int value = 5;**/
            int[] longest = {17, 6, 8, 2, 1, 2, 5};
            list.forEach(w ->{
                int[] weaponAttributes = {w.getName().length(), w.getCombatType().toString().length(),
                        w.getDamageType().toString().length(), }
                for (w.; i < ; i++) {

                }
            });
        };
        printDmgSorted.print(t.readCSV());
    }
}
