package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Raven raven = new Raven();
        Scanner scanner = new Scanner(System.in);
        boolean done = true;
        System.out.println("Raven: good moring how you feeling today");
        while (done==true) {

            String response = scanner.nextLine();
            String[] arrayResponse = raven.splitString(response);

            ArrayList<String> postive = raven.getpos(arrayResponse);
            ArrayList<String> negeative = raven.getNeg(arrayResponse);

            int poLength = raven.getPostiveSize(postive);

            int negLength = raven.getNegativeSize(negeative);

            if (poLength < negLength)
                System.out.println("Raven: i am so happy for you ... yay ..");
            else if (negLength < poLength)
                System.out.println("Raven: Really! why, tell me more ");
            else
                System.out.println("RAVEN : Meh.");
            System.out.println("do you wish to continue? y/n");
            String yes = scanner.nextLine();
            if(yes.equalsIgnoreCase("y")){
                done = true ;
            System.out.println("ok tell more as you wish  ");
            }
            else
                done = false;
        }

    }
}
