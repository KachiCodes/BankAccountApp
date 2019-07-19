/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccountapp;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Kachi
 */
public class BankAccountApp {
    public static String file = "C:\\Users\\Kachi\\Downloads\\Docs\\NewBankAccounts.csv";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        List<Account> accounts = new LinkedList<Account>();
        
        // TODO code application logic here

        //Reading a csv file to get bank account details 
        List<String[]> newAccountHolder = utilities.CSV.read(file);
        for (String[] accountHolder:newAccountHolder) {
            System.out.println("**NEW ACCOUNT CREATED**");
            String name = accountHolder[0];
            String sSn = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            System.out.println(name + " " + sSn + " " + accountType + " $" + initDeposit);
            
            if (accountType.equals("Savings")) {
                accounts.add(new Savings(name, sSn, initDeposit));
            }
            else if(accountType.equals("Checking")){
                accounts.add(new Checking(name, sSn, initDeposit));
            }
            else {
                System.out.println("Choose and Open an Account Type");
            }
        }
        
//        accounts.get(5).showInfo();
        
        for(Account acc : accounts){
            System.out.println("\n-----------------------------");
            acc.showInfo();
        }
    }
    
}