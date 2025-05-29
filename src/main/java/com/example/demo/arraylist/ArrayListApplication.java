package com.example.demo.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListApplication {

    public static void main(String[] args) {
        Scanner vip =new Scanner(System.in);

        ArrayList<String>usernames =new ArrayList<>();
        String name;

        do {
            System.out.println("Enter Usernames");
            String input = vip.nextLine();
            usernames.add(input);

            System.out.println("Do you want to continue?(Y/N)");
            name = vip.nextLine().trim().toUpperCase();

        }while(name.equals("Y"));

        System.out.println("Usernames:");
        for(String username : usernames){
            System.out.println(username);
        }
        System.out.println("Number of usernames: "+usernames.size());
    }

}
