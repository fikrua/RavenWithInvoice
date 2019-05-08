package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Raven raven = new Raven();
        ArrayList<String> chats = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your full name : ");
        String name = scanner.nextLine();
        System.out.print("enter your stadress : ");
        String stAdress = scanner.nextLine();
        System.out.print("enter the city : ");
        String city = scanner.nextLine();
        System.out.print("enter your state : ");
        String stat = scanner.nextLine();
        System.out.print("enter zip cod : ");
        int zipcod = scanner.nextInt();
        raven.invoice.setFullName(name);
        raven.invoice.setStAddress(stAdress);
        raven.invoice.setCity(city);
        raven.invoice.setStat(stat);
        raven.invoice.setZipCod(zipcod);

        int qucounter = 0;
        boolean done = true;
        int negcounter = 0;
        int postcounter = 0;
        String starter = "Raven: good moring how you feeling today";
        System.out.println(starter);
        chats.add(starter);
                scanner.nextLine();

        while (done==true) {
            qucounter++;


            String response = scanner.nextLine();
            chats.add(response);
            String[] arrayResponse = raven.splitString(response);

            ArrayList<String> postive = raven.getpos(arrayResponse);
            ArrayList<String> negeative = raven.getNeg(arrayResponse);

            int poLength = raven.getPostiveSize(postive);

            int negLength = raven.getNegativeSize(negeative);

            if (poLength < negLength){
                String response1 = "Raven: Really! why, tell me more ";
                System.out.println(response1);
                chats.add(response1);
                postcounter++;

            }
            else if (negLength < poLength) {
                String response1 = "Raven: i am so happy for you ... yay ..";
                System.out.println(response1);
                chats.add(response1);
                negcounter++;
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
            System.out.println("ok tell me more as you wish  ");
            }
            else
                done = false;
        }
        System.out.println("\n PRINT OUT OF ALL CHAT ");
        for (String s:chats){
            System.out.println(s);
        }
        System.out.println("\n total assessment ");

        if(postcounter<negcounter)
            System.out.println("this person seem postive \n");
        else if(negcounter<postcounter)
            System.out.println("this person seem a negative \n");
        else
            System.out.println("this person seems balanced \n");

        raven.invoice.priceOfSession(1);
        raven.invoice.priceofQu(qucounter);
        raven.invoice.totalPirece();
        raven.invoice.toStrings();

    }
}
