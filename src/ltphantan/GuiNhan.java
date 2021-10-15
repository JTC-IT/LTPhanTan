/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ltphantan;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author trung
 */
public class GuiNhan {
    ServerSocket sserver;
    public void MoCong(int cong) throws Exception{
        sserver = new ServerSocket(cong);
        System.out.println("Da mo cong: "+ cong);
    }
    public String Nhan() throws Exception{
        Socket socket = sserver.accept();
//        Tạo bộ đệm để lưu dữ liệu nhận về
        InputStreamReader in = new InputStreamReader(socket.getInputStream(),StandardCharsets.UTF_8);
        BufferedReader br = new BufferedReader(in);
        return br.readLine();
    }
    public void Gui(String data, String ipserver, int cong) throws Exception{
        Socket socket = new Socket(ipserver, cong);
        try (DataOutputStream out = new DataOutputStream(socket.getOutputStream())) {
            out.writeUTF(data);
            out.close();
        }
    }
}
