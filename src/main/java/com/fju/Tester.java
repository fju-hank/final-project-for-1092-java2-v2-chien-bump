package com.fju;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Menu[] menus = {null ,new CheeseBurger(), new DoubleCheeseBurger(),
                new BigMac(), new McChicken(), new SpicyChickenBurger(),
                new McFish(), new BLTBeefBurger(), new BLTSpicyChickenBurger()
        };
        Combo[] combo = { null , new A(), new B(), new C(), new D(), new E()
        };
        int num1 = 0;
        int num2 = 0;
        int total = 0;
        Scanner scan = new Scanner(System.in);
        while (num1 != 9 & num2 != 9) {
            for (int i = 1; i < menus.length; i++) {
                Menu menu = menus[i];
                System.out.println(i + "." + menu.name + " " + menu.price);
            }
            System.out.println("What do you want today??");
            num1 = Integer.parseInt(scan.next());
            if (num1 != 0) {
                System.out.println("order: " + menus[num1].name);
                total = menus[num1].price;
                System.out.println("Total: " + total);
            }else{
                System.out.println("Thank you ~");
                System.out.println("You need to pay:" + total);
                break;
            }
            System.out.println("Do you want a combo meal today??");
            for (int j = 1; j < combo.length; j++) {
                Combo combos = combo[j];
                System.out.println(j + " . " + combos.name + "  " + combos.price);
            }
            num2 = Integer.parseInt(scan.next());
            if (num2 != 0) {
                System.out.println("order: " + combo[num2].name);
                total = combo[num2].price + menus[num1].price;
                System.out.println("Total: " + total);
            }else{
                System.out.println("Thank you~ ");
                System.out.println("You need to pay:" + total);
            }

            }

        }
    }
