package com.bortnikpp.Threading;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Павел on 22.09.2016.
 */
public class Hourse extends Thread {
    ArrayList<Human> humen = new ArrayList<>();
    private int count = 310;
    private Random random = new Random();
    private int rand;


    Hourse(String name)
    {
        this.setName(name);
        start();
    }

    public void setNewHumen(Human h){
        humen.add(h);
    }
    @Override
    public void run() {
        for(int i = 0; i < count;i += rand) {
            if (i > 300) {
                System.out.println(this.getName() + " Win!");
                System.out.print("Победители: ");
                for (Human h:humen) {
                    System.out.print(h.getName() + " ");
                }
                System.exit(0);
            }
                rand = random.nextInt(9) + 1;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

