/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Deposite {
       public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int pil;
        
        Account a2=new Account();
        a2.setAccountName("Putri Dini Prameswari");
        a2.setAccountNum(2101092015);
        
        System.out.println("Anda Mau Melakukan Transaksi : ");
        System.out.println("1.Penarikan\n2.Deposit\n3.Informasi Saldo");
        System.out.print("Pilihan : ");
        pil=s.nextInt();
        
        switch(pil){
            case 1 :System.out.println("");
            a2.setTarik(50000);
            a2.print();
            break;
            
            case 2 :
            System.out.println("");
            a2.setDeposit(2000000);
            a2.print();
            break;
            
            case 3 :System.out.println("");
            a2.setBalance(50000);
            a2.print();
            break;
            
            default : System.out.println("Input Error");
        }
    }
}
