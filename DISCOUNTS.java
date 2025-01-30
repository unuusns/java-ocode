
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *THIS IS APROGRAM TO CALCULATE THE DISCOUNT
 * REGSTRATION NUMBER:CT101/G/19497/23
 * @author DICKSON WAMBUI MUHUHA
 */
import java.util.Scanner;
public class DISCOUNTS {
   public static   double  getDiscount(double amount) {
    double discount = 0;
    
        if(amount>5000){
            discount = amount * 0.01;
           
        }
        else if(amount>=1000&&amount<=5000){
            discount = amount * 0.05;
           
        }
        else if(amount<1000){
         
         System.out.println( "No Discount");
        }
        return discount;
       }
     public static void main(String[] args) {
        double discount;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount:");
        double amount=input.nextDouble();
        
//calling the method and passing one argument amount 
      discount = getDiscount(amount);
       System.out.println("The discount is = " + discount);

    }
}
