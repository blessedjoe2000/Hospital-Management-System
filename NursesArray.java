package Project;

/**
 * Created by UGIAGBE JOSEPH on 12/09/2020
 * PROGRAM EXTENDS FROM NURSES
 **/
public class NursesArray extends Nurses
{
   //defined instant variables
   private String nameOfGroup;
   private int numberOfMembers;
   Nurses[] groupMember;
   double[] donation;

   protected NursesArray(String groupName, int noOfMembers){
      final int HIGHESTPOSSIBLENUMBER = 1000000; //define the highest number possible to be able to calculate lowest donation read in from keyboard
      String name, sex, id;
      String address;
      int age, hierarchy;
      double amount, average, sum = 0;
      double largestDonation, lowestDonation;
      int largePosition = 0, lowPosition = 0;

      nameOfGroup = groupName;
      numberOfMembers = noOfMembers;
      groupMember = new Nurses [numberOfMembers];
      donation = new double[numberOfMembers];

      largestDonation = donation[0];
      lowestDonation = HIGHESTPOSSIBLENUMBER;

      //output heading
      System.out.println(nameOfGroup);
      for (int index = 0; index < nameOfGroup.length(); index++){
         System.out.print("=");
      }//for

      System.out.println("\n");

      //informing user on hierarchy code
      System.out.println("Hierarchy Level:\tHierarchy Code:");
      System.out.println("Level 1\t\t\t\t101");
      System.out.println("Level 2\t\t\t\t102");
      System.out.println("Level 3\t\t\t\t103");
      System.out.println("Level 4\t\t\t\t104");
      System.out.println("Level 5\t\t\t\t105");

      //read member details from keyboard
       for (int index = 0; index < numberOfMembers; index++){
          System.out.print("\nEnter group member " + (index+1) + " name: ");
          name = keyboard.nextLine();
          System.out.print("Enter group member " + (index+1) + " address: ");
          address = keyboard.nextLine();
          System.out.print("Enter group member " + (index+1) + " age: ");
          age = keyboard.nextInt();
          System.out.print("Enter group member " + (index+1) + " gender: ");
          sex = keyboard.next();
          keyboard.nextLine();
          System.out.print("Enter group member " + (index+1) + " employment ID: ");
          id = keyboard.nextLine();
          System.out.print("Enter group member " + (index+1) + " hierarchy: ");
          hierarchy = keyboard.nextInt();
          keyboard.nextLine();

          groupMember[index] = new Nurses(name, address, age, sex, id, hierarchy);
       }//for

      System.out.println();

       //read donation amount from keyboard
       for (int index = 0; index < numberOfMembers; index++){
          System.out.print("Enter group member " + (index+1) + " donation amount £");
          amount = keyboard.nextDouble();

          donation[index] = amount;
          sum = sum + amount;

       }//for

      //calculating for the highest and lowest donors
       for (int index = 0; index < numberOfMembers; index++){

          if (donation[index] > largestDonation){
             largestDonation = donation[index];
             largePosition = index;
          }//if
          else {
             if (donation[index] < lowestDonation){
                lowestDonation = donation[index];
                lowPosition = index;
             }//if
          }//else
       }//for

       average = sum / numberOfMembers;

      System.out.println();

      //print out details
      System.out.println(groupName.toUpperCase() + "\n" + "The average donation is £" + df.format(average)
         + "\nThe highest donation is £" + df.format(largestDonation) + "\nThe lowest donation is £" + df.format(lowestDonation) + "\n");

      System.out.println("The details of the highest donor is \n********************" );
      System.out.println(groupMember[largePosition]);
      System.out.println("\nThe details of the lowest donor is \n********************");
      System.out.println(groupMember[lowPosition]);

   }//constructor

}//class
