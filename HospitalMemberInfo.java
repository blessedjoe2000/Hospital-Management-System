package Project;
import java.util.Scanner;
/**
 * Created by ${Paul McGinley and group} on ${01/11/2020}
 * COMMENTS ABOUT PROGRAM HERE
 */
public class HospitalMemberInfo
{
   //instant defined variables
   static String ID;
   static String name;
   static String address;
   static int age;
   static String sex;
   static String speciality;
   static int hierarchyCode;
   static int noOfCourses;
   static int yearOfEmployment;
   static int numberOfTreatments;
   static int appointmentDay;
   static int appointmentMonth;
   static int appointmentYear;

   static Scanner keyboard = new Scanner(System.in);


   protected static int readInteger()
   {
      return keyboard.nextInt();
   }//readInteger

   protected static String readText()
   {
      return keyboard.nextLine();
   }//readText

   protected static void getHospitalMemberInfo()
   {
      //defined constant
      final int ONE = 1;
      final int TWO = 2;
      final int THREE = 3;
      final int FOUR = 4;
      int doctorCounter = 0;

      int userInput;

      System.out.println("Welcome!");
      System.out.println();
      do
      {
         //informing the user on the number for each class
         System.out.println("Press 1 if it is a Patient: ");
         System.out.println("Press 2 if it is a Doctor: ");
         System.out.println("Press 3 if it is a Nurse: ");
         System.out.println("Press 4 if finished to EXIT: ");
         userInput = keyboard.nextInt();

         if (userInput == ONE)
         {

            Patients firstPatient = new Patients();

            System.out.println(firstPatient.getStatus());
            System.out.println();

            System.out.print("Please enter patient ID: ");
            ID = keyboard.next();
            firstPatient.setPatientID(ID);
            keyboard.nextLine();

            System.out.print("Please enter full name: ");
            name = readText();
            firstPatient.setName(name);

            System.out.print("Please enter address: ");
            address = readText();
            firstPatient.setAddress(address);

            System.out.print("Please enter age: ");
            age = readInteger();
            firstPatient.setAge(age);

            System.out.print("Please enter gender: ");
            sex = keyboard.next();
            firstPatient.setSex(sex);
            keyboard.nextLine();

            System.out.print("Please enter the number of treatments: ");
            numberOfTreatments = readInteger();
            firstPatient.setNoOfTreatment(numberOfTreatments);

            System.out.print("Please enter appointment day: ");
            appointmentDay = readInteger();
            firstPatient.setAppointmentDay(appointmentDay);

            System.out.print("Please enter appointment month: ");
            appointmentMonth = readInteger();
            firstPatient.setAppointmentMonth(appointmentMonth);

            System.out.print("Please enter appointment year: ");
            appointmentYear = readInteger();
            firstPatient.setAppointmentYear(appointmentYear);

            System.out.println(firstPatient);
            System.out.println();
         }//if
         else if (userInput == TWO)
               {
                  Doctors firstDoctor = new Doctors();

                  System.out.println(firstDoctor.getStatus());
                  System.out.println();

                  System.out.println("Hierarchy Level:\tHierarchy Code:");
                  System.out.println("Level 1\t\t\t\t101");
                  System.out.println("Level 2\t\t\t\t102");
                  System.out.println("Level 3\t\t\t\t103");
                  System.out.println("Level 4\t\t\t\t104");
                  System.out.println("Level 5\t\t\t\t105\n");

                  System.out.print("What is employment ID: ");
                  ID = keyboard.next();
                  firstDoctor.setEmploymentID(ID);
                  keyboard.nextLine();

                  System.out.print("Please enter full name: ");
                  name = readText();
                  firstDoctor.setName(name);

                  System.out.print("Please enter address: ");
                  address = readText();
                  firstDoctor.setAddress(address);

                  System.out.print("Please enter age: ");
                  age = readInteger();
                  firstDoctor.setAge(age);

                  System.out.print("Please enter gender: ");
                  sex = keyboard.next();
                  firstDoctor.setSex(sex);

                  System.out.print("Please enter speciality: ");
                  speciality = readText();
                  keyboard.nextLine();
                  firstDoctor.setSpecialty(speciality);

                  System.out.print("Please enter hierarchy code: ");
                  hierarchyCode = readInteger();
                  firstDoctor.setHierarchyCode(hierarchyCode);

                  System.out.print("Please enter year of appointment: ");
                  yearOfEmployment = readInteger();
                  firstDoctor.setYearOfAppointment(yearOfEmployment);

                  System.out.print("Please enter number of courses completed: ");
                  noOfCourses = readInteger();
                  firstDoctor.setNoOfCourse(noOfCourses);

                  System.out.println(firstDoctor);
                  System.out.println();
               }//if
               else if (userInput == THREE)
                     {
                        Nurses firstNurse = new Nurses();

                        System.out.println(firstNurse.getStatus());
                        System.out.println();

                        System.out.println("Hierarchy Level:\tHierarchy Code:");
                        System.out.println("Level 1\t\t\t\t201");
                        System.out.println("Level 2\t\t\t\t202");
                        System.out.println("Level 3\t\t\t\t203");
                        System.out.println("Level 4\t\t\t\t204");
                        System.out.println("Level 5\t\t\t\t205\n");

                        System.out.print("Please enter employment ID: ");
                        ID = keyboard.next();
                        keyboard.nextLine();
                        firstNurse.setEmploymentID(ID);

                        System.out.print("Please enter full name: ");
                        name = readText();
                        firstNurse.setName(name);

                        System.out.print("Please enter address: ");
                        address = readText();
                        firstNurse.setAddress(address);

                        System.out.print("Please enter age: ");
                        age = readInteger();
                        firstNurse.setAge(age);

                        System.out.print("Please enter gender: ");
                        sex = keyboard.next();
                        firstNurse.setSex(sex);

                        System.out.print("Please enter speciality: ");
                        speciality = keyboard.next();
                        keyboard.nextLine();
                        firstNurse.setSpecialty(speciality);

                        System.out.print("Please enter hierarchy code: ");
                        hierarchyCode = readInteger();
                        firstNurse.setHierarchy(hierarchyCode);

                        System.out.print("Please enter number of courses completed: ");
                        noOfCourses = readInteger();
                        firstNurse.setNoOfCourse(noOfCourses);

                        System.out.println(firstNurse);
                        System.out.println();
                     }//if
                     else if (userInput == FOUR){
                             break;
                           }//if
                           else
                           {
                              System.out.println("Your value was invalid to the choices that was instructed");
                              System.out.println();
                           }//else

      }//do
      while (userInput != FOUR);
      {
         System.out.println("Thank you for using this system and have a good day! ");
      }//while
   }

}//class
