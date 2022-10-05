package net.htlgkr.krejo.example1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Task {
    Scanner s;
    List<Weapon> weaponList = new ArrayList<>();

    public List<Weapon> readCSV() {
        try {
            s = new Scanner(new File("weapons.csv"));
        } catch (
                FileNotFoundException e) {
            System.out.println("Probleme mit CSV");
        }
        s.nextLine();

        for (int i = 0; s.hasNext(); i++) {
            String[] parts = s.nextLine().split(";");
            weaponList.add(new Weapon(parts[0], CombatType.valueOf(parts[1]), DamageType.valueOf(parts[2]), Integer.parseInt(parts[3]), Integer.parseInt(parts[4]), Integer.parseInt(parts[5]), Integer.parseInt(parts[6])));
        }

        return weaponList;
    }

    public List<Weapon> sortDmg() {
        weaponList = weaponList.stream().sorted(Comparator.comparingInt(o -> -o.getDamage())).toList();
        return weaponList;
    }
    public List<Weapon> sortCombatTypeFirst() {
        weaponList = weaponList.stream().sorted((a, b) -> {
            if(a.getCombatType().equals(b.getCombatType())) {
                if (a.getDamageType().equals(b.getDamageType())){
                    return a.getName().compareTo(b.getName());
                }
                return a.getDamageType().compareTo(b.getDamageType());
            }
            return a.getCombatType().compareTo(b.getCombatType());
        }).toList();
        return weaponList;
    }



}

