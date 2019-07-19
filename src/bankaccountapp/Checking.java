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
public class Checking extends Account{
    //List Specific properties of a checking account 
    private int debitCardNo; 
    private int debitCardPin; 
    
    
    //Constructor to initialize checking account properties 
    
    public Checking(String name, String sSn, double initDeposit){
        super(name, sSn, initDeposit);
        accountNumber = "2 " + accountNumber;
        setDebitCard();
//        System.out.println("Account Number: " + this.accountNumber);
//        System.out.println("New Checking Account");
//        System.out.println("New Checking Account: " + name);
    }
    
    @Override
    public void setRate(){
        rate = getBaseRate() * .15;
    }
    
    //List specific methods to the checking account 
    private void setDebitCard(){
        debitCardNo = (int) (Math.random() * Math.pow(10, 12));
        debitCardPin = (int) (Math.random() * Math.pow(10, 4));

    }
    public void showInfo(){
        super.showInfo();
         System.out.println("Your Checking Account Features: "
                 + "\n Debit Card Number : " + debitCardNo
                 + "\n Debit Card Pin : " + debitCardPin
            );
    }
    
}
