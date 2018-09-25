import java.util.Scanner;



public class ExchangeRates {




    public static void main(String args[]){

        float euros,eurosTotal=0;
        float rate = 1.1159f;




        Scanner input = new Scanner(System.in);
        System.out.print("Please enter amount to be exchanged in Euros: ");
        euros = Integer.parseInt(input.nextLine());



    while(euros>0){

         eurosTotal = euros*rate;
    }
        String result = String.format("The total exchange amount is  %.2f  Euros ",eurosTotal );
        System.out.printf(result);


    }
}
