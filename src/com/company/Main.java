package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        exe1(args);
        exe2(args);
        exe3(args);
        exe4(args);
//        exe5(args);
    }

    // Exercise1
    public static void exe1(String[] args) {
        int count = 0;
        while (count <= 100) {
            System.out.println(count);
            count++;
        }
    }

    // Exercise2
    public static void exe2(String[] args) {
        for (int count=0; count <= 100; count++) {
            if(count%2==0){
                System.out.println(count);
            }
        }
    }

    // Exercise3
    public static void exe3(String[] args) {
        Scanner gradedClass = new Scanner(System.in);
        System.out.print("Add a number that end a range from 0: ");
        int lastNumb = gradedClass.nextInt();

        for(int i=0; i<=lastNumb; i++){
            System.out.println(i);
        }
   }

    // Exercise4
    public static void exe4(String[] args) {
        Scanner grades = new Scanner(System.in);
        String secretWord = "didier";
        String secret = "";

        do{
            System.out.print("Write your secret word: ");
            secret = grades.nextLine();
        }
        while(!secret.equals(secretWord.trim()));
    }
}