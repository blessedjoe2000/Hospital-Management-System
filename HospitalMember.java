package Project;

/**
 * Created by UGIAGBE JOSEPH on 11/25/2020
 * PROGRAM TO MANAGE HOSPITAL MEMBERS
 **/
abstract public class HospitalMember
{  //defined super class instant variables
   private String name;
   private String address;
   private int age;
   private String sex;

   protected HospitalMember(){
   }//default constructor

   protected HospitalMember(String memName, String memAddress, int memAge, String memSex){
      name = memName;
      address = memAddress;
      age = memAge;
      sex = memSex;
   }//constructor with all parameters

   protected void setName(String memName){
      name = memName;
   }//setName

   protected String getName(){
      return name;
   }//getName

   protected void setAddress(String memAddress){
      address = memAddress;
   }//setAddress

   protected String getAddress(){
      return address;
   }//getAddress

   protected void setAge(int memAge){
      age = memAge;
   }//setAge

   protected int getAge(){
      return age;
   }//getAge

   protected void setSex(String memSex){
      sex = memSex;
   }//setSex

   protected String getSex(){
      return sex;
   }//getSex

   protected abstract String getStatus(); //getStatus

   public String toString(){
      return ("Name: " + name + "\nAddress: " + address + "\nAge: " + age + " years old" + "\nGender: " + sex);
   }//toString returns the information that is generic to all classes

}//class
