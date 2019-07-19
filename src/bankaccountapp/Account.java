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
public abstract class Account implements IBaseRate{
    //Common properties for Savings or Checkings Account
    private String name; 
    private String sSn; 
    private double balance;
    protected String accountNumber; 
    protected double rate;
    
    private static int index = 10000;
    
    //Constructor here to set base properties and initialize the account 
    
    public Account(String name, String sSn, double initDeposit){
        this.name = name; 
        this.sSn = sSn;
        balance = initDeposit;
//        System.out.println("Name: " + name + "SSN: " + sSn + "Balance: " + balance);
        
        //Set Account Number 
        index++;
        this.accountNumber = setAccountNumber();
        System.out.println(getBaseRate());
        setRate();
    }
    
    /**List common methods for account operations **/
    
    private String setAccountNumber(){
        String lastTwoOfSSN = sSn.substring(sSn.length()-2, sSn.length());
        int uniqueID = index;
        int randomNumber = (int) ( Math.random() * Math.pow(10, 3));
        return lastTwoOfSSN + " " + uniqueID + " " + randomNumber;
    }
    
    public void compound(){
        double accruedInterest = balance * (rate/100); 
        System.out.println("Accrued Interest: $" + accruedInterest);
        balance = balance + accruedInterest;
        printBalance();
    }
    
    public abstract void setRate();
    
    public void showInfo(){
        System.out.println(
            "Name : " + name + 
            "\n Account Number: " + accountNumber + 
            "\n Balance: " + balance +
            "\n Rate: " + rate + "%"
        );
    }
    
    public void deposit(double amount){
        balance += amount; 
        System.out.println("Depositing $ " + amount);
        printBalance();
    }
    
    public void withdraw(double amount){
        balance -= amount; 
        System.out.println("Withdrawing $ " + amount);
        printBalance();
    }
    
    public void transfer(String toWhere, double amount){
        balance -= amount; 
        System.out.println("Transfering $" + amount + " to " + toWhere);
        printBalance();
    }
    
    public void printBalance(){
        System.out.println("Current Balance: " + balance);
    }
        
}
