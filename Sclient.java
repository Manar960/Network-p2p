/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package d1;


import java.net.*;
import static d1.Rclient.clientSocket;                                                    
import javax.swing.JOptionPane;

public class Sclient extends Thread{
	String RIP , UserName;
    int Rport;
    String msg;
    String data; 
    byte [] sendBytes=new byte[1024];
    public Sclient(String RIP,int Rport,String msg, String MYUserName)
    {
        this.UserName=MYUserName;
        this.RIP=RIP;
        this.Rport=Rport;
        this.msg=msg;
        
      
}
    
    @Override
     public void run(){
      try
        {
        data= UserName+":"+msg;
        sendBytes=data.getBytes(); 
        DatagramPacket sendPacket1=new DatagramPacket(sendBytes,sendBytes.length,InetAddress.getByName(RIP),Rport);
        clientSocket.send(sendPacket1);
        }
        catch(Exception e)
        {
         JOptionPane.showMessageDialog(null,"ERROR","",JOptionPane.ERROR_MESSAGE);   
        }
     }
}