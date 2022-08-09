package Project;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by UGIAGBE JOSEPH on 12/09/2020
 * PROGRAM EXTENDS FROM DOCTORS
 **/
public class DoctorsArray extends Doctors
{
   //defined instant variables
   private String nameOfAssociation;
   private int numberOfMembers;
   Doctors [] associationMember;
   double [] investment;
   double[] profit;

   protected DoctorsArray(String associationName, int noOfMembers){
      String name, id, specialty;
      String address, gender;
      int age, hierarchy, year;
      double amount;
      nameOfAssociation = associationName;
      numberOfMembers = noOfMembers;
      associationMember = new Doctors[numberOfMembers];
      investment = new double[numberOfMembers];
      profit = new double[numberOfMembers];

      System.out.println();
      //output heading
      System.out.println("\n" + nameOfAssociation);
      for (int index = 0; index < nameOfAssociation.length(); index++){
         System.out.print("*");
      }//for

      //informing user on hierarchy code
      System.out.println("\n");
      System.out.println("Hierarchy Level:\tHierarchy Code:");
      System.out.println("Level 1\t\t\t\t101");
      System.out.println("Level 2\t\t\t\t102");
      System.out.println("Level 3\t\t\t\t103");
      System.out.println("Level 4\t\t\t\t104");
      System.out.println("Level 5\t\t\t\t105");

      //read members details from keyboard
      for (int index = 0; index < numberOfMembers; index++){
         System.out.print("\nEnter member " + (index+1) + " name: ");
         name = keyboard.nextLine();
         System.out.print("Enter member " + (index+1) + " address: ");
         address = keyboard.nextLine();
         System.out.print("Enter member " + (index+1) + " age: ");
         age = keyboard.nextInt();
         System.out.print("Enter member " + (index+1) + " gender: ");
         gender = keyboard.next();
         keyboard.nextLine();
         System.out.print("Enter member " + (index+1) + " employment ID: ");
         id = keyboard.nextLine();
         System.out.print("Enter member " + (index+1) + " specialty: ");
         specialty = keyboard.nextLine();
         System.out.print("Enter member " + (index+1) + " hierarchy: ");
         hierarchy = keyboard.nextInt();
         System.out.print("Enter member " + (index+1) + " year of employment: ");
         year = keyboard.nextInt();
         keyboard.nextLine();

         associationMember[index] = new Doctors(name, address, age, gender, id, specialty, hierarchy, year);
      }//for

      System.out.println();

      //read investment amount from keyboard
      for (int index = 0; index < numberOfMembers; index++){
         final double PROFITPERCENTAGE = 0.30;
         System.out.print("Enter member " + (index+1) + " investment amount £: ");
         amount = keyboard.nextDouble();

         investment[index] = amount;
         profit[index] = investment[index] * PROFITPERCENTAGE;
      }//for

      System.out.println();
      System.out.println(associationName.toUpperCase() + "\n");

      //print out details
      for (int index = 0; index < numberOfMembers; index++){
         System.out.println( associationMember[index] + "\n"
               + "This member invested £" + df.format(investment[index]) + " and got a profit of £" + df.format(profit[index]));
      }//for
   }//constructor

}//class
