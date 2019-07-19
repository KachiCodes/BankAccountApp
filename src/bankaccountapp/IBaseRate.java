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
public interface IBaseRate {
    //Methods that return the base rate of the bank account
    default double  getBaseRate(){
        return 2.5;
    }
}
