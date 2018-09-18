//Problem1.java by GeorgiosTheodoridis
/*This program takes user input regarding a cyclists distance covered.It then calculates the sponsored value for the cyclists distance*/

import java.util.Scanner;

public class problem1 {

    public static void main(String[] args){
        String name,lastName;
        int distance,rate,totalCost;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        name = input.nextLine();

        System.out.print("Please enter your surname: ");
        lastName = input.nextLine();

        System.out.print("Please enter the distance covered: ");
        distance = Integer.parseInt(input.nextLine());

        if(distance<=10){
            totalCost = distance*7;
            System.out.print("Name: "+ name + "\nLast Name: " + lastName + "\nDistance covered: " + distance + "Km" + "\nTotal sponsorship due: " + totalCost + "$");
        }
        else if(distance>10){

            totalCost = distance*10;
            System.out.print("Name: "+ name + "\nLast Name: " + lastName + "\nDistance covered: " + distance + "Km" + "\nTotal sponsorship due: " + totalCost + "$");
        }
        else{

            System.out.print("You entered a wrong value");

        }





    }


}
