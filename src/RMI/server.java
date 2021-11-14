/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.*;

/**
 *
 * @author trung
 */
public class server {

    public static void main(String[] args) {
        try {
            java.rmi.registry.Registry r = LocateRegistry.createRegistry(1099);
            TinhToan tt = new TinhToan();
            //UnicastRemoteObject.exportObject(tt);
            //Dang ky 1 dia chi de may khach truy cap vao doi tuong tt
            Naming.bind("rmi://localhost/TinhToan", tt);
            System.out.print("Da cho may khach goi den:");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
