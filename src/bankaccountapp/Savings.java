/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccountapp;

/**
 *
 * @author Kachi
 */
public class Savings extends Account{
     //List Specific properties of a Savings account 
    private int safetyDepositBoxId; 
    private int safetyDepositBoxKey;
    
    //Constructor to initialize Savings account properties 
    
    public Savings(String name, String sSn, double initDeposit){
        super(name, sSn, initDeposit);
        accountNumber = "1 " + accountNumber;
        setSafetyDepositBox();
//        System.out.println("Account Number: " + this.accountNumber);
//        System.out.println("New Savings Account");
//        System.out.println("New Savings Account" + name);
    }
    
    @Override
    public void setRate(){
        rate = getBaseRate() - .25;
    }
    
    
    
    //List specific methods to the savings account 
    
    private void setSafetyDepositBox(){
        safetyDepositBoxId = (int) (Math.random() * Math.pow(10, 3));
        System.out.println(safetyDepositBoxId);
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }
     public void showInfo(){
        super.showInfo();
         System.out.println("Your Savings Account Features: "
                 + "\n Safety Deposit ID: " + safetyDepositBoxId
                 + "\n Safely Deposit Keys: " + safetyDepositBoxKey
            );
    }
     
}
