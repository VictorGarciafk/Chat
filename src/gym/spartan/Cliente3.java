/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym.spartan;

import java.io.*;
import java.net.*;


/**
 *
 * @author pedro
 */
public class Cliente3 {
    
   Socket cliente;
   DataOutputStream buffSalida;
   DataInputStream buffEntrada;
   DataInputStream teclado;
   String nombre;
   VentanaChat vChat;
   
   public Cliente3(Socket cliente, DataOutputStream buffSalida, DataInputStream buffEntrada, DataInputStream teclado, String nombre){
   this.cliente = cliente;
   this.buffSalida = buffSalida;
   this.buffEntrada = buffEntrada;
   this.teclado = teclado;
   this.nombre = nombre;
       
   }
   
   public Cliente3(){
       
   }
   
   public void setVentanaChat(VentanaChat vChat)
   {
       this.vChat = vChat;
       
   }
    public void RecibirDatos() {
        
        Thread hilo = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    
                    while(true){
                        
                        String mesgIn = buffEntrada.readUTF();
                        vChat.setTextField(mesgIn);
                        System.out.println(nombre+": "+mesgIn);
                    }
                    
                    
                    
                } catch(Exception e) {
                    System.out.print("Hola");
                }
            }
        });
        hilo.start();
}
   
    public void EnviarDatos(String msg) {
              
     try{
             vChat.setTextField("P. Gonzale3: "+msg);
             buffSalida.writeUTF("P. Gonzale3: "+msg);
             buffSalida.flush();
     }       catch(Exception e){};   
                                
    }
    
    
    
    public void CorrerCliente(){
        
    Socket cliente;
    int puerto = 9001;
    String ip = "127.0.0.1";
    DataOutputStream buffSalida;
    DataInputStream buffEntrada,teclado;
    
    VentanaChat vChat = new VentanaChat();
    vChat.setVisible(true);
    
    
    String tec = "h";
    String msg;
    
       
        try{
            
                  
            cliente = new Socket(ip, puerto);
            buffSalida  = new DataOutputStream(cliente.getOutputStream());
            buffEntrada = new DataInputStream(cliente.getInputStream());
            teclado = new DataInputStream(System.in);
            
            String nombre = ">>>";
            
            Cliente3 cliente1 = new Cliente3(cliente,buffSalida,buffEntrada,teclado,nombre);
            vChat.setCliente(cliente1);
            cliente1.setVentanaChat(vChat);
            cliente1.RecibirDatos();
            //cliente1.EnviarDatos()
        
            
            
          
            
        } catch(Exception e) {};
    }
    
}
