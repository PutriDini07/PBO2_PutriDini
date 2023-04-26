/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP;

/**
 *
 * @author HP
 */
public class Account {
  String AccountName;
    int AccountNum;
    int Balance;

    public String getAccountName() {
        return AccountName;
    }

    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    public int getAccountNum() {
        return AccountNum;
    }

    public void setAccountNum(int AccountNum) {
        this.AccountNum = AccountNum;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int Balance) {
        this.Balance = Balance;
    }

    
    void print(){
        System.out.println("Nama Nasabah :"+AccountName+"\nNo Rekening : "+AccountNum+"\nSaldo : "+Balance);
    }  
    
    public void setDeposit(int Deposite) {
        //this.Deposite = Deposite;
        Balance = Balance + Deposite;
        
    }
    
    void setTarik(int i) {
        Balance = Balance-i;
    }
}
