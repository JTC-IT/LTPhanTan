/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ltphantan;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author trung
 */
public class tinhToHop {
    
    public long Giaithua(int n) {
        long giai_thua = 1;
        if (n == 0 || n == 1) {
            return giai_thua;
        } else {
            for (int i = 2; i <= n; i++) {
                giai_thua *= i;
            }
            return giai_thua;
        }
    }
    
    class ToHop extends Thread {
        int k,n;
        long C;
        
        public ToHop(int k, int n){
            this.k = k;
            this.n = n;
        }
        public void run(){
            if (k == 0 || k == n){
                C = 1;
                return;
            }
            if (k == 1){
                C = n;
                return;
            }
            this.C = Giaithua(n)/(Giaithua(n-k)*Giaithua(k));
        }
    }
    
    class input extends Thread {
        int k,n;
        
        public void run(){
            Scanner scan = new Scanner(System.in);
        
            System.out.print("Nhap k = ");
            k = scan.nextInt();
            
            System.out.print("Nhap n = ");
            n = scan.nextInt();
        }
    }
    
    public String slove(int k, int n){
        ToHop h1 = new ToHop(k, n-2);
        h1.start();
        ToHop h2 = new ToHop(k-1, n-2);
        h2.start();
        ToHop h4 = new ToHop(k-2, n-2);
        h4.start();
        while(h1.isAlive() || h2.isAlive() || h4.isAlive());
        long C = h1.C + 2*h2.C + h4.C;
        return ("C("+k+","+n+") = " + C);
    }
}
