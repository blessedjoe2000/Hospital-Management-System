package Project;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by UGIAGBE JOSEPH on 11/25/2020
 * PROGRAM EXTENDS FROM HOSPITAL MEMBERS
 **/
public class Doctors extends HospitalMember
{
   Scanner keyboard = new Scanner(System.in);
   DecimalFormat df = new DecimalFormat("0,000.00");

//class defined constants
   static final int ONEHUNDREDFIVE = 105;
   static final int ONEHUNDREDFOUR = 104;
   static final int ONEHUNDREDTHREE = 103;
   static final int ONEHUNDREDTWO = 102;
   static final int ONEHUNDREDONE = 101;

//sub class defined instant variables
   static int noOfDoctors = 0;
   private String employmentID;
   private String specialty;
   private int hierarchyCode;
   private int noOfCourse;
   private int yearOfAppointment;

   protected Doctors(){
      noOfDoctors++;
   }//default constructor

   protected Doctors(String docName, String docAddress, int docAge, String docGender, String docID, String docSpecialty, int docHierarchy, int docNoOfCourse, int docYear){
      super(docName, docAddress, docAge, docGender);
      employmentID = docID;
      specialty = docSpecialty;
      hierarchyCode = docHierarchy;
      noOfCourse = docNoOfCourse;
      yearOfAppointment = docYear;
      noOfDoctors++;
   }//constructor with all parameters

   protected Doctors(String docName, String docAddress, int docAge, String docGender, String docID, String docSpecialty, int docHierarchy, int docYear){
      super(docName, docAddress, docAge, docGender);
      employmentID = docID;
      specialty = docSpecialty;
      hierarchyCode = docHierarchy;
      yearOfAppointment = docYear;
      noOfCourse = 0;
      noOfDoctors++;
   }//user defined constructor

   protected Doctors(String docName, String docAddress, int docAge, String docGender, int docHierarchy, int docYear){
      super(docName, docAddress, docAge, docGender);
      hierarchyCode = docHierarchy;
      yearOfAppointment = docYear;
      employmentID = "Unknown";
      specialty = "Unknown";
      noOfCourse = 0;
      noOfDoctors++;
   }//user defined constructor

   protected void setEmploymentID(String docID){
      employmentID = docID;
   }//setEmploymentID

   protected String getEmploymentID(){
      return employmentID;
   }//getEmploymentID

   protected void setSpecialty(String docSpecialty){
      specialty = docSpecialty;
   }//setSpecialty

   protected String getSpecialty(){
      return specialty;
   }//getSpecialty

   protected void setHierarchyCode(int docHierarchy){
      hierarchyCode = docHierarchy;
   }//setHierarchyCode

   protected int getHierarchyCode(){
      return hierarchyCode;
   }//getHierarchyCode

   protected void setNoOfCourse(int docCourse){
      noOfCourse = docCourse;
   }//setNoOfCourse

   protected int getNoOfCourse(){
      return noOfCourse;
   }//getNoOfCourse

   protected void setYearOfAppointment(int memYear){
      yearOfAppointment = memYear;
   }//setYearOfAppointment

   protected int getYearOfAppointment(){
      return yearOfAppointment;
   }//getYearOfAppointment

   private double calSalary(){
      final int ZERO = 0;
      final int ONE = 1;
      final int TWO = 2;
      final int THREE = 3;
      final int FOUR = 4;
      final int FIVE = 5;
      final int FIXEDSALARYDAY = 30;
      double salaryRate, courseRate;
      if (hierarchyCode == ONEHUNDREDONE ){
         salaryRate = 195.50;
      }//if
      else if (hierarchyCode == ONEHUNDREDTWO){
               salaryRate = 245.50;
            }//if
            else if (hierarchyCode == ONEHUNDREDTHREE){
                     salaryRate = 298.20;
                  }//if
                  else if (hierarchyCode == ONEHUNDREDFOUR){
                           salaryRate = 345.80;
                        }//if
                        else if (hierarchyCode == ONEHUNDREDFIVE){
                                 salaryRate = 399.20;
                              }//if
                              else {
                                    salaryRate = 0;
                              }//else
      if (noOfCourse == ZERO){
         courseRate = 1;
      }//if
      else if (noOfCourse == ONE){
               courseRate = 1.3;
            }//if
            else if (noOfCourse == TWO){
                     courseRate = 1.5;
                  }//if
                  else if (noOfCourse == THREE){
                           courseRate = 1.8;
                        }//if
                        else if (noOfCourse == FOUR){
                                 courseRate = 2.1;
                              }//if
                              else if (noOfCourse == FIVE){
                                       courseRate = 2.4;
                                    }//if
                                    else {
                                          courseRate = 0;
                                    }//else
      return salaryRate * courseRate * FIXEDSALARYDAY;
   }//calSalary

   protected void getRetirement(){
      int retirement;
      final int yearOfService = 35;
      retirement = yearOfAppointment + yearOfService;
      System.out.println("\nThe Doctor " + employmentID + " will retire in the year " + retirement);
   }//getRetirement

   protected String getStatus(){
      return ("This member is a Doctor");
   }//getStatus

   public String toString(){
      return ("\nEmployment ID: " +employmentID + "\n" + super.toString() + "\nSpecialty: " + specialty + "\nHierarchy code: "
      + hierarchyCode + "\nNumber of courses completed: " + noOfCourse + "\nYear of employment: " + yearOfAppointment
            + "\nMonthly salary: £" + df.format(calSalary()));
   }//getStatus

   protected static int numberOfDoctors(){
      return noOfDoctors;
   }//numberOfDoctors

   protected void haveOfficialCar(boolean found){
      final double MAINTENANCEALLOWANCE= 0.05;
      double carMaintenance;
      if (found){
         carMaintenance = calSalary() * MAINTENANCEALLOWANCE;
         System.out.println("\nThe Doctor " + employmentID + " car maintenance allowance is £" + df.format(carMaintenance));
      }//if
      else{
         System.out.println("\nThe Doctor " + employmentID + " do not have a car");
      }//else
   }//haveOfficialCar

   protected void updateBenefits(){
      String diamondPackage = "Pension, Healthcare, Company car, 30 days of Annual vacation & Travel allowance";
      String platinumPackage = "Pension, Healthcare, Company car, 25 days of Annual vacation & Travel allowance";
      String goldPackage = "Pension, Healthcare, Company car, 20 days of Annual vacation & Travel allowance";
      String silverPackage = "Pension, Healthcare, 15 days of Annual vacation & Travel allowance";
      String bronzePackage = "Pension, Healthcare, 10 days of Annual vacation & Travel allowance";
      if (hierarchyCode == ONEHUNDREDFIVE){
         System.out.println("\nThe Doctor " + employmentID + " is entitles to " + diamondPackage);
      }//if
      else if (hierarchyCode == ONEHUNDREDFOUR){
               System.out.println("\nThe Doctor " + employmentID + " is entitle to " + platinumPackage);
            }//if
            else if (hierarchyCode == ONEHUNDREDTHREE){
                     System.out.println("\nThe Doctor " + employmentID + " is entitled to " + goldPackage);
                  }//if
                  else if (hierarchyCode == ONEHUNDREDTWO){
                           System.out.println("\nThe Doctor " + employmentID + " is entitled to " + silverPackage);
                        }//if
                        else if (hierarchyCode == ONEHUNDREDONE){
                                    System.out.println("\nThe Doctor " + employmentID + " is entitled to " + bronzePackage);
                              }//if
                              else {
                                    System.out.println("\nA wrong hierarchy code was entered");
                              }//if
   }//updateBenefits

}//class
