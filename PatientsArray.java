package Project;

/**
 * Created by UGIAGBE JOSEPH on 12/09/2020
 * PROGRAM EXTENDS FROM PATIENTS
 **/
public class PatientsArray extends Patients
{
   private String groupOfPatientsAwaitingResult;
   private int noOfPatientsAwaitingResult;
   Patients[] awaitingResult;

   protected PatientsArray(String patientGroup, int numberOfPatients){
      String name, sex, id;
      String address;
      int age, noOfTreat, appDay, appMonth, appYear;

      groupOfPatientsAwaitingResult = patientGroup;
      noOfPatientsAwaitingResult = numberOfPatients;
      awaitingResult = new Patients[noOfPatientsAwaitingResult];

      System.out.println("\n" + groupOfPatientsAwaitingResult);
      for (int index = 0; index < groupOfPatientsAwaitingResult.length(); index++){
         System.out.print("*");
      }
      System.out.println();

      for (int index = 0; index < noOfPatientsAwaitingResult; index++){
         System.out.print("\nEnter patient " + (index+1) + " name: ");
         name = keyboard.nextLine();
         System.out.print("Enter patients " + (index+1) + " address: ");
         address = keyboard.nextLine();
         System.out.print("Enter patient " + (index+1) + " age: ");
         age = keyboard.nextInt();
         System.out.print("Enter patient " + (index+1) + " gender: ");
         sex = keyboard.next();
         keyboard.nextLine();
         System.out.print("Enter patient " + (index+1) + " ID: ");
         id = keyboard.nextLine();
         System.out.print("Enter patient " + (index+1) + " number of treatment: ");
         noOfTreat = keyboard.nextInt();
         System.out.print("Enter patient " + (index+1) + " appointment day: ");
         appDay = keyboard.nextInt();
         System.out.print("Enter patient " + (index+1) + " appointment month: ");
         appMonth = keyboard.nextInt();
         System.out.print("Enter patient " + (index+1) + " appointment year: ");
         appYear = keyboard.nextInt();
         keyboard.nextLine();

         awaitingResult[index] = new Patients(name, address, age, sex, id, noOfTreat, appDay, appMonth, appYear);
      }

      System.out.println("");
      System.out.println("Details of patients awaiting scan and xray result\n*************************");
      for (int index = 0; index < noOfPatientsAwaitingResult; index++){
         System.out.println(awaitingResult[index]);
      }

   }

}//class
