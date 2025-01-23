/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.netbonus;
//this is a code to find the netbonus//
/**
 *registration number=CT101/G/19497/23
 * author Wambui Dickson Muhuha
 */
//first we import a scanner so that we can get user's input//
import java.util.Scanner;
public class Netbonus {
    public static void main(String[] args){
        //we then create a scanner object//
    Scanner input=new Scanner(System.in);
   
    // create a scanner to ask the user for their salary which is variable double//
    System.out.print("eneter your salary:");
    double salary= input.nextDouble();
   //create a scanner to ask the userfor their year of service which its variable is int//
    System.out.print("enter year of service:");
    int yearofservice= input.nextInt();   
  //use the if statement to find netbonus according to years of service based //
    if(yearofservice>10){
        //calculate netbonus by multiplying salary by its percentage respectively according to the year of service
        double netbonus = 0.12*salary;
        System.out.println("netbonus:" +netbonus);
    }
    else if(yearofservice<=10 && yearofservice>=6){
        double netbonus =0.10*salary;
                System.out.println("netbonus:" +netbonus);
        } 
    else if (yearofservice<6){
        double netbonus =0.08*salary;
        System.out.println("netbonus:" +netbonus);
    }
    else{
        System.out.println("invalid year of service");
    }
    }    
}

        
    
