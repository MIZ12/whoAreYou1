/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package whoareyou1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author moizb
 */
public class WhoAreYou1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BufferedReader myKB = new BufferedReader(new InputStreamReader(System.in));
       
        String myName;
       try{
           System.out.println("Enter your Name");// prompt
           
           myName = myKB.readLine();// read from screen and store my name
           
           //output to the screen
            System.out.println(" Hello " + myName + ". isnt this a great class ");
            
            int num;
             //output to the screen
            System.out.println("Enter any Number");
            
            System.out.println("Enter your age");  // prompt for age
            int age = Integer.parseInt(myKB.readLine());  // read and convert age to int
            int ageInTwoYears = age + 2;  // calculate age in two years

            // output to the screen
            System.out.println("In two years, you will be " + ageInTwoYears + " years old.");

            
            // read in string converting it to int
            num = Integer.parseInt(myKB.readLine());
             //output to the screen
            System.out.println("The square of" + num +" is " + (num*num));
             
            
       }catch(Exception e) {
           System.out.println(" wrong code add number");
       }
               
       
        
        
    }
    
}
