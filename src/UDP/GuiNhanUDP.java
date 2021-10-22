/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author trung
 */
public class GuiNhanUDP {
    private DatagramSocket Sserver;
    
    public void MoCong(int port) throws Exception {
        Sserver = new DatagramSocket(port);
    }
    public void Gui(String data, String ipserver, int cong) throws Exception{
        DatagramSocket ds =new DatagramSocket();
        
        byte bodem[] = new byte[256];
        bodem = data.getBytes();
        InetAddress ip = InetAddress.getByName(ipserver);
        DatagramPacket dp = new DatagramPacket(bodem, bodem.length, ip, cong);
        ds.send(dp);
        ds.close();
    }  
    public String Nhan() throws Exception{
        byte bodem[] = new byte[256]; //Tạo ra bộ đệm để nhận dữ liệu về
        DatagramPacket dp = new DatagramPacket(bodem,bodem.length);
        Sserver.receive(dp);
        return new String(dp.getData()).trim();
    }
}
