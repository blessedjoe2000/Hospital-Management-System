package Project;

/**
 * Created by Alannah Cardwell, Paul McGinley, Akin-Fatoki Muyiwa, Joseph Ugiagbe on 11/26/2020
 * PROGRAM TO TEST HOSPITAL MEMBERS
 **/
public class TestHospitalMember extends HospitalMemberInfo
{

   public static void main(String[] args)
   {
      //calling getHospitalMember from HospitalMemberInfo class
      getHospitalMemberInfo();

      System.out.println();
      System.out.println();

      //create aDoctor
      Doctors aDoctor = new Doctors();

      //create bDoctor
      Doctors bDoctor = new Doctors("Bob William", "27 Academic Road", 34, "male", 102, 2010);

      //create cDoctor
      Doctors cDoctor = new Doctors("Jane Bill", "4 Waterloo Street", 47, "Female", "R574", "Psychiatric", 104, 3, 1997);

      //create aNurse
      Nurses aNurse = new Nurses();

      //create bNurse
      Nurses bNurse = new Nurses("Bridget Payne", "90 Casio Road", 42, "female", "NT32", "Pediatric", 203, 4);

      //create cNurse
      Nurses cNurse =  new Nurses("Naomi Parker", "568 Shinning Street", 25, "Female", "N76", 201);

      //create aPatient
      Patients aPatient = new Patients("Susan Batt", "46 Jim Cresent", 62, "female", "P32", 3, 26, 12, 2021);

      //create bPatient
      Patients bPatient = new Patients();

      //create cPatient
      Patients cPatient = new Patients("Lyon Shade", "987 Heathrow Park", 29, "Female", "Y81", 2);

      //print out details of each doctor
      System.out.println(aDoctor);
      aDoctor.getStatus();

      System.out.println(bDoctor);
      System.out.println(bDoctor.getStatus());

      System.out.println(cDoctor);
      System.out.println(cDoctor.getStatus());

      //print out details of each nurse
      System.out.println(aNurse);
      System.out.println(aNurse.getStatus());

      System.out.println(bNurse);
      System.out.println(bNurse.getStatus());

      System.out.println(cNurse);
      System.out.println(cNurse.getStatus());

      //print out details of each patient
      System.out.println(aPatient);
      System.out.println(aPatient.getStatus());

      System.out.println(bPatient);
      System.out.println(bPatient.getStatus());

      System.out.println(cPatient);
      System.out.println(cPatient.getStatus());

      System.out.println(cPatient);
      System.out.println(cPatient.getStatus());

      System.out.println("\nThe number of Doctors entered is " + Doctors.numberOfDoctors());
      System.out.println("\nThe number of Nurses entered is " + Nurses.numberOfNurses());
      System.out.println("\nThe number of Patient entered is " + Patients.numberOfPatients());

      //calling setNoOfTreatment and getNoOfTreatment method for cPatient
      cPatient.setNoOfTreatment(6);
      cPatient.getNoOfTreatment();

      //printing out the updated details od cPatient
      System.out.println(cPatient.toString());

      ////calling setEmploymentID and getEmployment ID method for bDoctor
      bDoctor.setEmploymentID("TS73");
      bDoctor.getEmploymentID();

      //calling haveOfficialCar method for bDoctor and cDoctor
      bDoctor.haveOfficialCar(false);
      cDoctor.haveOfficialCar(true);

      //calling getRetirement method for cDoctor
      cDoctor.getRetirement();

      //calling calAnnualLeave method for bNurse
      bNurse.calAnnualLeave();

      //calling hasOfficialCar for cNurse
      cNurse.hasOfficialCar(true);

      //calling updateBenefits method for all doctors
      bDoctor.updateBenefits();
      aDoctor.updateBenefits();
      cDoctor.updateBenefits();

      //calling updateBenefits merthod for bNurse and cNurse
      bNurse.updateBenefits();
      cNurse.updateBenefits();;

      //calling nextAppointmentDate for aPatient
      aPatient.nextAppointmentDate();

      //calling set and getAppointmentDay, Month and Year method for cPatient
      cPatient.setAppointmentDay(28);
      cPatient.getAppointmentDay();
      cPatient.setAppointmentMonth(4);
      cPatient.getNoOfTreatment();
      cPatient.setAppointmentYear(2020);
      cPatient.getAppointmentYear();

      //printing cPatient updated details
      System.out.println(cPatient);

      //calling nextAppointmentDate method for cPatient
      cPatient.nextAppointmentDate();

      aPatient.getDiscount(99);
      cPatient.getDiscount(23);

      //calling array on each of the classes
      DoctorsArray doctorsGroup = new DoctorsArray("Save Accident Victims", 3);

      NursesArray nursesGroup = new NursesArray("\nTwilight group", 3);

      PatientsArray waitingPatients = new PatientsArray("Awaiting X-ray", 2);

   }//main
}//class
