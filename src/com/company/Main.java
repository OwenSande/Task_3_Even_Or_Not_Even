package com.company;

public class Main {

    public static void main(String[] args) {
	    //GENERATING A RANDOM NUMBER BETWEEN 1 AND 100
        int randomNumber = (int)(Math.random()* (100-1));
        System.out.println(randomNumber+" was randomly generated");

        //CHECKING IF THE NUMBER IS ODD OR EVEN
        if(randomNumber%2==0){
            System.out.println(randomNumber+" is and even number.");
        }else{
            System.out.println(randomNumber+ " is and odd number");
        }
    }
}
