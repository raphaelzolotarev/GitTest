package org.example;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        double rand = Math.random();
        System.out.println(LocalDate.now());
        
        if(true)
            System.out.print("Hello world");
        else
            System.out.println("goodbye");

        if(true)
            System.out.println("Jerry");
        else
            System.out.println("Tom");
        
        for(int i=0; i<10; ++i)
            System.out.println(i);

        if(true)
            System.out.println("Bob");
        else
            System.out.println("Marta");

        do {
            System.out.println("Kim");
        }while (false);

        system.exit(1);
        
    }

}
