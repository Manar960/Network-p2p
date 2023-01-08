/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package d1;

import java.net.*;
import static d1.chat_app.text1;
import java.awt.*;
import javax.swing.*;
public class Rclient extends Thread{
    //String msg1 = new String ();
	 int Lport; 
	    String Lip;
	   public static DatagramSocket clientSocket;
	    byte [] receivedBytes=new byte[1024];
	    String msg=null;
	    
	    public Rclient(int Lport,String Lip){
	        this.Lip=Lip;
	        this.Lport=Lport;
	       
	        try {
	            clientSocket=new DatagramSocket(Lport,InetAddress.getByName(Lip));
	            clientSocket.setSoTimeout(0);
	        } 
	        catch (Exception e) {
	           JOptionPane.showMessageDialog(null,"ERROR","",JOptionPane.ERROR_MESSAGE);
	        }
	        
	        
	    }
	    
	    @Override
	    public void run()
	    {
	          try
	        {
	        while(true)
	        {
	           
	           DatagramPacket receivedPacket =new DatagramPacket(receivedBytes,receivedBytes.length); 
	           clientSocket.receive(receivedPacket);
	           msg=new String(receivedPacket.getData());
	           int Rport=receivedPacket.getPort();
	           InetAddress Rip= receivedPacket.getAddress();
	           if(msg!= null)
	           {
	                
                      String  msg1 =msg;
	             text1.append(msg1+"\n");
	             text1.setForeground(Color.BLUE);
     
                  chat_app.Status.setText("Received From:IP= " +Rip+ ",Port=" +Rport);
	           }
	        }
	        }
	        catch(Exception e)
	        {
	        JOptionPane.showMessageDialog(null,"ERROR","",JOptionPane.ERROR_MESSAGE);   

	        }
	        } 
	}
	    