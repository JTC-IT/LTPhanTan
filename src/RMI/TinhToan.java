/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;

/**
 *
 * @author trung
 */
public class TinhToan implements ITinhToan {
    @Override
    public int Tong(int a, int b) throws Exception {
        int s=a+b;
        System.out.println("Tong: "+ s);
        return s;
    }

    @Override
    public int Nhan(int a, int b) throws Exception {
        int s=a*b;
        System.out.println("Tong: "+ s);
        return s;
    }
}
