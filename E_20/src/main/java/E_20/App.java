package E_20;

import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Kevin Kant
 */
public class App 
{

    public static void main( String[] args )
    {
        Scanner reader = new Scanner(System.in);
        float tax = 0;
        System.out.print("What is the amount: ");
        float amount = reader.nextFloat();
        System.out.print("What state do you live in: ");
        String state = reader.next();
        if(state.compareTo("Wisconsin") == 0 || state.compareTo("wisconsin") == 0){
            tax = (float) .05;
            System.out.print("What county do you live in: ");
            reader.nextLine();
            String county = reader.nextLine();
            if(county.compareTo("Dunn") == 0){
                tax += .004;
            }else if(county.compareTo("Eau Claire") == 0){
                tax += .005;
            }
            System.out.printf("Your tax is %.2f %n",amount*tax);

        }else if(state.compareTo("Illinois") == 0){
            tax = (float) .08;
            System.out.printf("Your Tax is %.2f %n",amount*tax);
        }
        amount += amount*tax;
        System.out.printf("Your Total is $%.2f ", amount);
    }
}
