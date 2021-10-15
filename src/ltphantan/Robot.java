/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ltphantan;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.InetAddress;
import java.util.ArrayList;

/**
 *
 * @author trung
 */
public class Robot {
    private Runtime run = Runtime.getRuntime();
    private ArrayList<String> result;
    
    public ArrayList<String> exec(String key){
        result = new ArrayList<String>();
        
        if(key.contains("/tm")){
            try {
                result.add(InetAddress.getLocalHost().getHostName());
            } catch (Exception e) { e.printStackTrace();}
        }
        else if(key.contains("/ht")){
            result.add("Trần Trung Chính");
        }
        else if(key.contains("/+;")){
            DaySo(key);
        }
        else if(key.contains("/ck;")){
            Tohop(key);
        }
        else if(key.contains("/xoso")){
            openFile("cmd /c C:\\Users\\trung\\netbean\\LTPhanTan\\data.txt");
        }
        else if(key.toLowerCase().contains("alo")){
            result.add("Nghe ban oi!");
        }
        else if(key.toLowerCase().contains("xin chào")){
            result.add("Chào bạn!");
        }
        else if(key.toLowerCase().contains("giup")){
            result.add("Ok!");
        }
        else switch(key){
            case "/notepad":
                openApp("notepad");
                result.add("Ok!");
                break;
            case "/excel":
                openOffice("EXCEL.EXE");
                result.add("Ok!");
                break;
            case "/word":
                openOffice("WINWORD.EXE");
                result.add("Ok!");
                break;
            case "/exit":
                System.exit(0);
                break;
            case "/quit":
                shutdownSystem();
                break;
        }
        return result;
    }
    
    private void DaySo(String st){
        String[] ds = st.split("[;]");
        int len = ds.length;
        int[] n = new int[len - 1];
        
        int size = 0;
        for(int i = 1; i < len; i++){
            try {
                n[size++] = Integer.parseInt(ds[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        long sum = 0;
        
        for(int i = 0; i < size; i++){
            min = Math.min(min, n[i]);
            max = Math.max(max, n[i]);
            sum += n[i];
        }
        
        result.add("# Tổng: "+String.valueOf(sum));
        result.add("- Số lớn nhất: "+String.valueOf(max));
        result.add("- Số nhỏ nhất: "+String.valueOf(min));
        result.add("- Sô chữ số: "+ String.valueOf(size));
    }
    
    private void Tohop(String st){
        String[] ds = st.split("[;]");
        if(ds[1] != null && ds[2] != null)
            try {
                int k = Integer.parseInt(ds[1]);
                int n = Integer.parseInt(ds[2]);
                tinhToHop C = new tinhToHop();
                result.add(C.slove(k, n));
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
    
    private void openApp(String app){
        try {
            run.exec(app);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void openOffice(String app){
        try {
            run.exec("C:\\Program Files\\Microsoft Office\\root\\Office16\\"+app);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void openFile(String url){
        try {
            run.exec(url);
            FileReader f = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(f);
            while(true) {
                    String s = br.readLine();
                    if(s == null || s == "") break;
                    result.add(s);
            }
            br.close();
            f.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void shutdownSystem(){
        try {
            run.exec("shutdown -s -t 0");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
