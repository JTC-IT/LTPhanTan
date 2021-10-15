/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ltphantan;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author trung
 */
public class test {
    public static void main(String[] args) {
        try {
            String s = "Chính";
            byte arr[] = s.getBytes("UTF8");
            for (byte x: arr) {
                System.out.print(x + " ");
            }
            System.out.println(new String(arr,StandardCharsets.UTF_8));
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}