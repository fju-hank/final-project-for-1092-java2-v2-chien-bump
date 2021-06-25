package com.fju;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Menu[] menus = {new CheeseBurger(),new DoubleCheeseBurger(),
                new BigMac(),new McChicken(),new SpicyChickenBurger(),
                new McFish(),new BLTBeefBurger(),new BLTSpicyChickenBurger()
        };
        int number = 0;
        int total = 0;
        Scanner scan = new Scanner(System.in);
        while (number != 9){
            for (int i = 1; i <menus.length+2 ; i++) {
                Menu menu = menus[i];
                System.out.println(i + "." + menu.name + " " + menu.price );
            }
            System.out.println("What do you want today??");
            number = Integer.parseInt(scan.next());
            if (number != 9){
                System.out.println(menus[number].name);
                total = menus[number].price;
                System.out.println("Total: " + total);
            }
        }

    }
}