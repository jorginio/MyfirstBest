import java.util.Scanner;



public class ExchangeRates {




    public static void main(String args[]){

        float euros,eurosTotal;
        float rate = 1.1159f;




        Scanner input = new Scanner(System.in);
        System.out.print("Please enter amount to be exchanged in Euros: ");
        euros = Integer.parseInt(input.nextLine());

    while(euros>0){

        eurosTotal = euros*rate;

        System.out.format("The total exchange amount is  %f.%n  Euros ",eurosTotal );

    }


    }



}
