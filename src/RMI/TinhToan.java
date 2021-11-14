    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author trung
 */
public class TinhToan extends UnicastRemoteObject implements ITinhToan {
    
    public TinhToan() throws RemoteException {}
    
    public int Tong(int a, int b) throws Exception {
        int s=a+b;
        System.out.println("Ket qua: "+ s);
        return s;
    }

    public int Nhan(int a, int b) throws Exception {
        int s = a*b;
        System.out.println("Ket qua: "+ s);
        return s;
    }
    
    public int Hieu(int a, int b) throws Exception {
        int s = a-b;
        System.out.println("Ket qua: "+ s);
        return s;
    }
    
    public float Chia(int a, int b) throws Exception {
        if(b == 0){
            System.out.println("Khong the chia cho 0!");
            return 0;
        }
        float s = (float) a/b;
        System.out.println("Ket qua: "+ s);
        return s;
    }
}
