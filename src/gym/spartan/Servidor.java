package gym.spartan;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.net.*;

public class Servidor {

    ServerSocket server;
    int puerto =  9000;
    Conexion[] cliente = new Conexion[11];
    int idClient = 0;
    
    public void init(){
        
        Socket socket;
       
        
        try{
            
            server = new ServerSocket(puerto); //levantando servidor
            System.out.println("Esperando peticiones por el puerto " + puerto);
            
            while(true) { 
            
                 socket = server.accept();
                 DataInputStream buffEntrada = new DataInputStream(socket.getInputStream());
                 DataOutputStream buffSalida = new DataOutputStream(socket.getOutputStream());
                 cliente[idClient] = new Conexion(socket,buffEntrada,buffSalida);
                 cliente[idClient].start();
                 
            }   
        } catch(Exception e){e.printStackTrace();};
        
          
    }
    
    
    public static void main(String[] args) {
                
        Servidor servidor1 = new Servidor();
        servidor1.init();
        
    }
}
