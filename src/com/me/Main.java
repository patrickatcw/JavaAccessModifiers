package com.me;

public class Main {

    public static void main(String[] args) {

        //step 9 instance
        Account patsAccount = new Account("Pat");
        //step 10 now call methods with patsAccount
        patsAccount.deposit(10000);
        patsAccount.withdraw(4000);
        patsAccount.withdraw(-1000);
        patsAccount.withdraw(1000);
        patsAccount.deposit(2000);
        patsAccount.calculateBalance();
        //patsAccount.balance = 100000;  //not good, hackers! step 11 fixes this

        System.out.println("Balance on the account is " + patsAccount.getBalance());
        //run
        //patsAccount.transactions.add(4500); //a check for real amount, step 11 fixes
        patsAccount.calculateBalance();
        //run
        //this can all be fixed by changing variables in Account class to private

        //step 11 in Account class change variables in step 2 to private


    }

}
