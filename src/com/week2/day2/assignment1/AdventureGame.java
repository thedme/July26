package com.week2.day2.assignment1;

import java.util.Scanner;

public class AdventureGame
{
    public static Scanner sc = new Scanner(System.in);

    public static boolean stillPlaying = true;

    public static void main(String[] args)
    {

        while (stillPlaying)
        {
            String choice1 = null;

            // TODO Auto-generated method stub
            System.out.println(
                    "You recieve a phone call from an Individual who claims that he is a prince of Timbuckto, \nif you agree to meet the individual in a dark alley, you will recieve a billion dollars,\n ");
            System.out.println(
                    "Do you accept to go to the dark alley(a) or Do you agree to ignore the phone call(b)? or do you complain to the FDA about the phone call(c)");
            System.out.println("Please choose either a, b, c. ");

            String choice = sc.nextLine();
            choice(choice);
        }
    }

    public static boolean choice(String choice)
    {

        switch (choice.toLowerCase())
        {
        case "a":
            theChoiceA();
            break;

        case "b":
            theChoiceB();
            break;
        case "c":
            theChoiceC();
            break;
        default:
            System.out.println("You are doing something wrong! try again!");

        }
        return stillPlaying;
    }

    public static boolean theChoiceA()
    {
        System.out.println("You go to the alley and no one is there.");
        System.out.println("now you have 3 choices");
        System.out.println("(a) Go home, (b) call your mom,(c) call your friend");

        String choice2 = sc.nextLine();
        // choice(choice2);

        switch (choice2.toLowerCase())
        {
        case "a":
            System.out.println("You walk home");
            System.out.println("Do you wan to Continue?"
                    + "Y: Yes"
                    + "N: No");
            choice2 = sc.nextLine();
            finalMethod(choice2);
            break;

        case "b":
            System.out.println("your mom yells at you.");
            break;
        case "c":
            System.out.println("your friend yells at you");
            break;
        default:
            System.out.println("You are doing something wrong! try again!");
            System.out.println("Do you wan to Continue?"
                    + "Y: Yes"
                    + "N: No");
            choice2 = sc.nextLine();
            finalMethod(choice2);

        }
        
        return stillPlaying;

    }

    private static boolean theChoiceB()
    {
        // TODO Auto-generated method stub
        System.out.println("you ignore the phone call, then you walk to play baseball");

        System.out.println("which team do you wanna play for?");
        System.out.println("(a) the Leapers, (b) the Batters, (c) The Runners ");

        String choice3 = sc.nextLine();

        switch (choice3.toLowerCase())
        {
        case "a":
            System.out.println("You pitched a perfect game");
            System.out.println("Do you wan to Continue?"
                    + "Y: Yes"
                    + "N: No");
            choice3 = sc.nextLine();
            finalMethod(choice3);
            break;

        case "b":
            System.out.println("you struck out and lost.");
            System.out.println("Do you wan to Continue?"
                    + "Y: Yes"
                    + "N: No");
            choice3 = sc.nextLine();
            finalMethod(choice3);
            break;
        case "c":
            System.out.println("you stole two bases and won the game");
            System.out.println("Do you wan to Continue?"
                    + "Y: Yes"
                    + "N: No");
            choice3 = sc.nextLine();
            finalMethod(choice3);
            break;
        default:
            System.out.println("You are doing something wrong! try again!");
            System.out.println("Do you wan to Continue?"
                    + "Y: Yes"
                    + "N: No");
            choice3 = sc.nextLine();
            finalMethod(choice3);

        }
        return stillPlaying;
    }

    private static boolean theChoiceC()
    {
        // TODO Auto-generated method stub
        System.out.println("The FDA doesnt deal with this stuff, stop calling them.");

        System.out.println("(a) Start eating ice cream, (b) Feed your dog (c) Go eat popcorn ");

        String choice3 = sc.nextLine();
        
        String stayOrGo = null;

        switch (choice3.toLowerCase())
        {
        case "a":
            System.out.println("You get hyperthermia");
            System.out.println("Do you wan to Continue?"
                    + "Y: Yes"
                    + "N: No");
            stayOrGo = sc.nextLine();
            finalMethod(stayOrGo);
            break;

        case "b":
            System.out.println("Ruff!! Ruff!!.");
            System.out.println("Do you wan to Continue?"
                    + "Y: Yes"
                    + "N: No");
            stayOrGo = sc.nextLine();
            finalMethod(stayOrGo);
            break;
        case "c":
            System.out.println("You chip your teeth on a kernel");
            System.out.println("Do you wan to Continue?"
                    + "Y: Yes"
                    + "N: No");
            stayOrGo = sc.nextLine();
            finalMethod(stayOrGo);
            break;
        default:
            System.out.println("You are doing something wrong! try again!");

            System.out.println("Do you wan to Continue?"
                    + "Y: Yes"
                    + "N: No");
            stayOrGo = sc.nextLine();
            finalMethod(stayOrGo);
            
            
        }
            return stillPlaying;
    }
    public static boolean finalMethod(String finalMethod)
    {   switch (finalMethod.toLowerCase()){
    case"y":
        break;
    case "n":
        stillPlaying = false;
            break;
        }

        return stillPlaying;
        
        
    }
    

}
