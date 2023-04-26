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
public class TestBank {
     public static void main(String[]args){
        Account a2 = new Account();
        Account a3 = new Account();
        
        a2.setAccountName("Putri Dini Prameswari");
        a2.setAccountNum(2101092015);
        a2.setBalance(50000);
        
        a3.setAccountName("Anggi Riski");
        a3.setAccountNum(2101092037);
        a3.setBalance(30000);
        
        a2.print();
        a3.print();
    }
    
}
