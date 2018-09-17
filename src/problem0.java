//Problem0.java by Georgios Theodoridis
/*This program takes input from a user and calculates the cost of snacks bought from a canteen.
It then displays the user details and the total cost*/

import java.util.Scanner;

public class problem0 {

    public static void main (String args[]) {

        String name, course;
        int snacks,cost;


        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        name = input.nextLine();

        System.out.print("Please enter your class: ");
        course = input.nextLine();

        System.out.print("How many books would you like? ");
        snacks = Integer.parseInt(input.nextLine());

        cost=snackCost(snacks);

        System.out.print("Student Name: " + name + "\n" +"Student Course: " + course +"\n" + "Total Canteen charge: " + cost);

    }


    public static int snackCost(int a){
        int cost;
        cost=a*2;
        return cost;

    }






}





