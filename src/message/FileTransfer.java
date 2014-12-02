/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package message;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *  SHAMELESS COPY FROM STACKOVERFLOW !!!!!!!!!
 * 
 * @author Kimmo
 */
public class FileTransfer {

    private Socket socket;
    private InputStream is;
    private FileOutputStream fos;
    private BufferedOutputStream bos;
    private int bufferSize;

    private String userName;

    public FileTransfer(Socket socket) {
        this.socket = socket;
        this.is = null;
        this.fos = null;
        this.bos = null;
        this.bufferSize = 0;

    }

    public void transferData() {
        
         System.out.println("FILE TRANSFER: transferData");
        
        try {
            is = socket.getInputStream();
            bos = new BufferedOutputStream(socket.getOutputStream());
            byte[] bytes = new byte[8192];
            int count;
            
            FileInputStream fis;
            BufferedInputStream bis;
            BufferedOutputStream out;
            byte[] buffer = new byte[8192];
            try {
                bis = new BufferedInputStream(is);
                out = new BufferedOutputStream(socket.getOutputStream());

                while ((count = is.read(bytes)) >= 0) {
                    System.out.println("FILE TRANSFER: count "+count);
                    out.write(bytes, 0, count);
                }
                
//                bos.close();
//                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void receiveFile(String fileName) {
        
        System.out.println("FILE TRANSFER: receiveFile "+fileName);
        
        try {
            is = socket.getInputStream();
            bufferSize = socket.getReceiveBufferSize();
            fos = new FileOutputStream(fileName);
            bos = new BufferedOutputStream(fos);
            byte[] bytes = new byte[bufferSize];
            int count;
            while ((count = is.read(bytes)) >= 0) {
                System.out.println("FILE TRANSFER: count "+count);
                bos.write(bytes, 0, count);
            }
            bos.close();
            fos.close();
//            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendFile(String path, String receiver) {

        System.out.println("FILE TRANSFER: sendFile "+path+" to "+receiver);
        
        File file = new File(path);
        FileInputStream fis;
        BufferedInputStream bis;
        BufferedOutputStream out;
        byte[] buffer = new byte[8192];
        try {
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);
            out = new BufferedOutputStream(socket.getOutputStream());
            int count;
            while ((count = bis.read(buffer)) > 0) {
                System.out.println("FILE TRANSFER: count "+count);
                out.write(buffer, 0, count);

            }
//            out.close();
//            fis.close();
//            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
