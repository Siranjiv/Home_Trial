/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

/**
 *
 * @author WIN 10
 */
import Models.Animal;
public class TestAnimal {
    public static void main(String[] args) {
        
        Animal s=new Animal();
        
        s.Name="Cat";
        s.Genus="Sansevieria";
        s.Species="trifasciata";
        s.generateScientificName();
        s.printName();
        System.out.println("Scientific Name is:"+s.generateScientificName());
     
    }
}
