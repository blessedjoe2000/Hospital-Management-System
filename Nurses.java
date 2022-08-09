package Project;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by UGIAGBE JOSEPH on 11/25/2020
 * PROGRAM EXTENDS FROM HOSPITAL MEMBERS
 **/
public class Nurses extends HospitalMember
{
   Scanner keyboard = new Scanner(System.in);
   DecimalFormat df = new DecimalFormat("0,000.00");

   //class defined constant
   static final int TWOHUNDREDFIVE = 205;
   static final int TWOHUNDREDFOUR = 204;
   static final int TWOHUNDREDTHREE = 203;
   static final int TWOHUNDREDTWO = 202;
   static final int TWOHUNDREDONE = 201;

   //class defined instant variables
   static int noOfNurses = 0;
   private String employmentID;
   private String specialty;
   private int hierarchyCode;
   private int noOfCourse;

   protected Nurses(){
      noOfNurses++;
   }//default constructor

   protected Nurses(String nurseName, String nurseAddress, int nurseAge, String nurseGender, String nurseID, String nurseSpecialty, int nurseHierarchy, int nurseNoOfCourse){
      super(nurseName, nurseAddress, nurseAge, nurseGender);
      employmentID = nurseID;
      specialty = nurseSpecialty;
      hierarchyCode = nurseHierarchy;
      noOfCourse = nurseNoOfCourse;
      noOfNurses++;
   }//constructor with all parameters

   protected Nurses(String nurseName, String nurseAddress, int nurseAge, String nurseGender, String nurseID, int nurseHierarchy){
      super(nurseName, nurseAddress, nurseAge, nurseGender);
      employmentID = nurseID;
      hierarchyCode = nurseHierarchy;
      specialty = "Unknown";
      noOfCourse = 0;
      noOfNurses++;
   }//user defined constructor

   protected Nurses(String nurseName, String nurseAddress, int nurseAge, String nurseGender, String nurseID, String nurseSpecialty){
      super(nurseName, nurseAddress, nurseAge, nurseGender);
      employmentID = nurseID;
      specialty = nurseSpecialty;
      hierarchyCode = 0;
      noOfCourse = 0;
      noOfNurses++;
   }//user defined constructor

   protected void setEmploymentID(String nurseID){
      employmentID = nurseID;
   }//setEmploymentID

   protected String getEmploymentID(){
      return employmentID;
   }//getEmploymentID

   protected void setSpecialty(String nurseSpecialty){
      specialty = nurseSpecialty;
   }//setSpecialty

   protected String getSpecialty(){
      return specialty;
   }//getSpecialty

   protected void setHierarchy(int nurseHierarchy){
      hierarchyCode = nurseHierarchy;
   }//setHierarchy

   protected int getHierarchy(){
      return hierarchyCode;
   }//getHierarchy

   protected void setNoOfCourse(int nurseNoOfCourse){
      noOfCourse = nurseNoOfCourse;
   }//setNoOfCourse

   protected int getNoOfCourse(){
      return noOfCourse;
   }//getNoOfCourse

   private double calAnnualSalary(){
      final int ZERO = 0;
      final int ONE = 1;
      final int TWO = 2;
      final int THREE = 3;
      final int FOUR = 4;
      final int FIVE = 5;
      final int FIXEDSALARYDAY = 30;
      double salaryRate, courseRate;
      int monthsInYear = 12;
      if (hierarchyCode == TWOHUNDREDONE){
         salaryRate = 175.50;
      }//if
      else if (hierarchyCode == TWOHUNDREDTWO){
               salaryRate = 225.50;
            }//if
            else if (hierarchyCode == TWOHUNDREDTHREE){
                     salaryRate = 278.20;
                  }//if
                  else if (hierarchyCode == TWOHUNDREDFOUR){
                           salaryRate = 325.80;
                        }//if
                        else if (hierarchyCode == TWOHUNDREDFIVE){
                                 salaryRate = 379.20;
                              }//if
                              else {
                                    salaryRate = 0;
                              }//else
      if (noOfCourse == ZERO){
         courseRate = 1;
      }//if
      else if (noOfCourse == ONE){
               courseRate = 1;
            }//if
            else if (noOfCourse == TWO){
                     courseRate = 1.2;
                  }//if
                  else if (noOfCourse == THREE){
                           courseRate = 1.4;
                        }//if
                        else if (noOfCourse == FOUR){
                                 courseRate = 1.6;
                              }//if
                              else if (noOfCourse == FIVE){
                                       courseRate = 1.8;
                                    }//if
                                    else {
                                          courseRate = 0;
                                          }//if
      return  (salaryRate * courseRate * FIXEDSALARYDAY) * monthsInYear;
   }//calSalary

   protected void calAnnualLeave(){
      int annualLeave, leaveInMonth, monthInYear = 12;
      if (hierarchyCode == TWOHUNDREDONE){
         leaveInMonth = 7;
      }//if

      else if (hierarchyCode == TWOHUNDREDTWO){
               leaveInMonth = 8;
            }//if
      else if (hierarchyCode == TWOHUNDREDTHREE){
               leaveInMonth = 9;
            }//if
            else if (hierarchyCode == TWOHUNDREDFOUR){
                     leaveInMonth = 10;
                  }//if
                  else if (hierarchyCode == TWOHUNDREDFIVE){
                           leaveInMonth = 13;
                        }//if
                        else {
                           leaveInMonth = 0;
                        }//else
      annualLeave = leaveInMonth * monthInYear;
      System.out.println("\nThe Nurse " + employmentID + " annual leave is " + annualLeave + " days");
   }//calAnnualLeave

   protected String getStatus(){
      return ("This member is a Nurse");
   }//getStatus

   public String toString(){
      return ("\nEmployment ID: " + employmentID + "\n" + super.toString() + "\nSpecialty: " + specialty
            + "\nHierarchy Code: " + hierarchyCode + "\nNumber of courses completed: " + noOfCourse
               + "\nAnnual salary: £" + df.format(calAnnualSalary()));
   }//toString

   protected static int numberOfNurses(){
      return noOfNurses;
   }//numberOfNurses

   protected void hasOfficialCar(boolean found){
      final double MAINTENANCEBONUS = 0.05;
      double carMaintenance;
      if (found){
         carMaintenance = calAnnualSalary() * MAINTENANCEBONUS;
         System.out.println("\nThe Doctor " + employmentID + " car maintenance fee is £" + df.format(carMaintenance));
      }//if
      else{
         System.out.println("\nThe Doctor " + employmentID + " do not have a car");
      }//else
   }//hasOfficialCar

   protected void updateBenefits(){
      String diamondPackage = "Pension, Healthcare, Company car, 30 days of Annual vacation & Travel allowance";
      String platinumPackage = "Pension, Healthcare, Company car, 25 days of Annual vacation & Travel allowance";
      String goldPackage = "Pension, Healthcare, Company car, 20 days of Annual vacation & Travel allowance";
      String silverPackage = "Pension, Healthcare, 15 days of Annual vacation & Travel allowance";
      String bronzePackage = "Pension, Healthcare, 10 days of Annual vacation & Travel allowance";
      if (hierarchyCode == TWOHUNDREDFIVE){
         System.out.println("\nThe Doctor " + employmentID + " is entitles to " + diamondPackage);
      }//if
      else if (hierarchyCode == TWOHUNDREDFOUR){
               System.out.println("\nThe Doctor " + employmentID + " is entitle to " + platinumPackage);
            }//if
            else if (hierarchyCode == TWOHUNDREDTHREE){
                     System.out.println("\nThe Doctor " + employmentID + " is entitled to " + goldPackage);
                  }//if
                  else if (hierarchyCode == TWOHUNDREDTWO){
                           System.out.println("\nThe Doctor " + employmentID + " is entitled to " + silverPackage);
                        }//if
                        else if (hierarchyCode == TWOHUNDREDONE){
                                 System.out.println("\nThe Doctor " + employmentID + " is entitled to " + bronzePackage);
                              }//if
                        else {
                              System.out.println("\nA wrong hierarchy code was entered");
                        }//else
   }//updateBenefits

}//class
