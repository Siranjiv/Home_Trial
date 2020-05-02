/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author WIN 10
 */
public class Animal {

    public String Name;
    public String Genus;
    public String Species;

   public void printName() {
  
       for(int i=0;i<Name.length();i++)
       {
           System.out.println(""+Name.charAt(i));
       }
        
    }
   
   public String generateScientificName()
   {
       String L1=(Genus.charAt(0)+"").toUpperCase();
       String L2=Genus.substring(1,Genus.length());
       String L3=Species.toLowerCase();
       String Scientific_Name=L1+L2+" "+L3;
       
       return Scientific_Name;
   }
}
