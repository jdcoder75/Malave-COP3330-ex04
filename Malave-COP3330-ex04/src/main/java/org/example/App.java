package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Jose Malave
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a noun: " );
        String noun= sc.nextLine();
        System.out.println("Enter a verb: " );
        String verb= sc.nextLine();
        System.out.println("Enter a adjective: " );
        String adjective= sc.nextLine();
        System.out.println("Enter a adverb: " );
        String adverb= sc.nextLine();
        System.out.println("Do you " + verb +" your " + adjective + " "+ noun + " "+ adverb + "? That's hilarious!");
    }
}
