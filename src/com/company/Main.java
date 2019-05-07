package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Raven raven = new Raven();
        ArrayList<String> chats = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean done = true;
        String starter = "Raven: good moring how you feeling today";
        System.out.println(starter);
        chats.add(starter);
        while (done==true) {

            String response = scanner.nextLine();
            chats.add(response);
            String[] arrayResponse = raven.splitString(response);

            ArrayList<String> postive = raven.getpos(arrayResponse);
            ArrayList<String> negeative = raven.getNeg(arrayResponse);

            int poLength = raven.getPostiveSize(postive);

            int negLength = raven.getNegativeSize(negeative);

            if (poLength < negLength){
                String response1 = "Raven: i am so happy for you ... yay ..";
                System.out.println(response1);
                chats.add(response1);
            }
            else if (negLength < poLength) {
                String response1 = "Raven: Really! why, tell me more ";
                System.out.println(response1);
                chats.add(response1);
            }
            else
            {
                String response1 = "RAVEN : Meh.";
            System.out.println(response1);
            chats.add(response1);
                }
            System.out.println("\ndo you wish to continue? y/n");
            String yes = scanner.nextLine();
            if(yes.equalsIgnoreCase("y")){
                done = true ;
            System.out.println("ok tell more as you wish  ");
            }
            else
                done = false;
        }
        System.out.println("\n PRINT OUT OF ALL CHAT ");
        for (String s:chats){
            System.out.println(s);
        }

    }
}
