package com.bortnikpp.Threading;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Павел on 22.09.2016.
 */
public class Main {

    public static void main(String[] args) {
        String str;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        Hourse hourse1 = new Hourse("First");
        Hourse hourse2 = new Hourse("Second");
        Hourse hourse3 = new Hourse("Third");
        Hourse hourse4 = new Hourse("Four");
        Hourse hourse5 = new Hourse("Five");
        while (true) {
            System.out.println("Введите ваше имя!");
            str = sc.next();
            Human man = new Human(str);
            System.out.println("Выберите лошадку!");
            System.out.println("hourse1 = 1 " + "hourse2 = 2 " + "hourse3 = 3\n" + "hourse4 = 4 " + "hourse5 = 5");
            i = sc.nextInt();
            switch (i) {
                case 1:
                    hourse1.setNewHumen(man);
                    break;
                case 2:
                    hourse2.setNewHumen(man);
                    break;
                case 3:
                    hourse3.setNewHumen(man);
                    break;
                case 4:
                    hourse4.setNewHumen(man);
                    break;
                case 5:
                    hourse5.setNewHumen(man);
                    break;
                default:
                    break;
            }
        }
    }
}
