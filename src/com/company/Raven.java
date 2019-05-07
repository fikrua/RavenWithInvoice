package com.company;

import java.util.ArrayList;

public class Raven {
    private String sayin ;

    public String getSayin() {
        return sayin;
    }

    public void setSayin(String sayin) {
        this.sayin = sayin;
    }

    public String[] splitString(String s){

        String[] str = s.split(" ");
        return str;
    }
    public ArrayList<String> getpos(String[] st){
        ArrayList<String> post =new ArrayList<>();
        String[] postive =  {"good", "glad", "happy", "relaxed", "accomplished", "alert", "creative"};
        for(String s:st){
            for(String p:postive){
                if(s.equalsIgnoreCase(p))
                    post.add(s);
            }

        }
        return post;
    }
    public ArrayList<String> getNeg(String[] st){
        ArrayList<String> post =new ArrayList<>();
        String [ ] negative = {"bad", "sad", "tired", "angry", "anxious", "hungry", "moody", "afraid"};
        for(String s:st){
            for(String p:negative){
                if(s.equalsIgnoreCase(p))
                    post.add(s);
            }

        }
        return post;
    }


    public int getPostiveSize(ArrayList<String> posti){
        return posti.size();
    }
    public int getNegativeSize(ArrayList<String> negative){
        return negative.size();

    }



}
