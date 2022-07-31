/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Resturant_s;
//Importing Libraries
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Talha
 */
//Parent Class
public class SuperClass {
    public double FishPlatter;
    public double ChickenRice;
    public double SignaturePizza;
    public double SignatureBeefBurger;
    public double SignatureChickenBurger;
    
     public double Tea;
    public double Coffee;
    public double Soda;
    public double ChocolateMilkshake;
    public double RedBull;
    
    public double Meals;
    public double Drinks;
    public double TotalofMD;
    
    public double AllTotalofMD;
//Method Created to calculate Total 
    public double GetAmount()
    {
        Meals = FishPlatter + ChickenRice + SignaturePizza + SignatureBeefBurger + SignatureChickenBurger;
       Drinks = Tea + Coffee +  Soda + ChocolateMilkshake + RedBull;
       TotalofMD = Meals + Drinks;
        AllTotalofMD = TotalofMD;
        return AllTotalofMD;
    }
    
    private JFrame frame;
    //Medthod Created To Exit System
    public void iExitSystem(){
        frame = new JFrame("Exit");
        
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Resutrant MAngement System",
                JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }
    //Cost Assigned To Items
       public double pFishPlatter = 2000;
    public double pChickenRice = 350;
    public double pSignaturePizza = 1500;
    public double pSignatureBeefBurger = 800;
    public double pSignatureChickenBurger = 650;
    
     public double pTea = 65;
    public double pCoffee = 85;
    public double pSoda = 60;
    public double pChocolateMilkshake = 300;
    public double pRedBull = 300;
   
    public  double mcTax = 50;
    public Double FindTax(double cAmount)
    {
        double FindTax = cAmount - (cAmount * mcTax);
        return FindTax;
        
    }
    
}
