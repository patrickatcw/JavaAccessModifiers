package com.me;

//everything is public initially, so everything is accessible
import java.util.ArrayList;

//step 1 class
public class Account {

    //step 2 variables / fields
    public String accountName;
    public int balance = 0;
    public ArrayList<Integer> transactions;

    //step 3 constructor (for just accountName)
    public Account(String accountName) {
        this.accountName = accountName;
        //step 4 initialize the transactions
        this.transactions = new ArrayList<Integer>();

    }

    //step 5 getter for the balance
    public int getBalance() {
        return balance;
    }

    //step 6 deposit method
    public void deposit(int amount){
        if(amount > 0) {
            transactions.add(amount);
            this.balance += amount;
            System.out.println(amount + " deposited. Balance is now " + this.balance);
        }else {
            System.out.println("Cannot deposit negative sums");
        }

    }

    //step 7 withdraw method
    public void withdraw(int amount){
        int withdrawal = -amount;
        if(withdrawal < 0) {
            this.transactions.add(withdrawal);
            this.balance += withdrawal;
            System.out.println(amount + " withdrawn. Balance is now " + this.balance);
        }else{
            System.out.println("Cannot withdraw negative amounts");
        }
    }

    //step 8 method for calculating balance
    public void calculateBalance(){
        this.balance = 0;
        for(int i : this.transactions){
            this.balance += i;
        }
        System.out.println("Calculated balance is " + this.balance);
        //step 9 to main to test this out
    }

}
