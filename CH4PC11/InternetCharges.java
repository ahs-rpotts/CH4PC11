/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CH4PC11;

/**
 *
 * @author 992307991
 */
public class InternetCharges {
   private char package1;
   private int hours;
   private double totalCharges;
   private double packageB;
   private double packageC;
   
   
   
   public InternetCharges (char p, int h){
       package1= p;
       hours = h;
   }
   //set varibales
   public void setPackage1(char p){
       package1 = p;
   }
   public void setHours(int h){
       hours = h;
   }
   
   //get vairables
   public int getPackage(){
       return package1;
   }
   public int getHours(){
       return hours;
   }
   
   //calculate charges
   public double getTotalCharges(){
       if (package1 == 'A'){
           if(hours > 10){
               totalCharges = 9.95 +((10-hours)*2);
               packageB = 14.95 + ((20-hours)*2);
               System.out.println("You could save $" +packageB +" if you"
                       + "chose package B.");
               packageC = totalCharges- 19.95;
               System.out.println("You could save $"+ packageC+" if you chose"
                       + "package C.");
           }else{
               totalCharges = 9.95;
           }
   }else if(package1 == 'B'){
       if(hours > 20){
           totalCharges = 14.95 + ((20-hours)*2);
           packageC = totalCharges- 19.95;
               System.out.println("You could save $"+ packageC+" if you chose"
                       + "package C.");
       }else{
           totalCharges = 14.95;
       }
   }else if(package1 == 'C'){
       totalCharges = 19.95;   
   }else{
           System.out.println("Please enter a valid package.");
   }
    return totalCharges;  
}

}
