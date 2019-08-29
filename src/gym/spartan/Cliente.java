/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym.spartan;

import java.io.*;
import java.net.*;



public class Cliente {
    
   Socket cliente;
   DataOutputStream buffSalida;
   DataInputStream buffEntrada;
   DataInputStream teclado;
   String nombre;
   
   public Cliente(Socket cliente, DataOutputStream buffSalida, DataInputStream buffEntrada, DataInputStream teclado, String nombre){
   this.cliente = cliente;
   this.buffSalida = buffSalida;
   this.buffEntrada = buffEntrada;
   this.teclado = teclado;
  this.nombre = nombre;
       
   }
   
    public void RecibirDatos() {
        
        Thread hilo = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    
                    while(true){
                        
                        String mesgIn = buffEntrada.readUTF();
                        System.out.println(nombre+": "+mesgIn);
                    }
                    
                    
                    
                } catch(Exception e) {
                    System.out.print("Hola");
                }
            }
        });
        hilo.start();
}
   
    public void EscribirDatos() {
       
           
     try{
                    
             String line = "";
            while (!line.equals(".bye"))
            {
                
                line = teclado.readLine();
                buffSalida.writeUTF("Karen Ornelas: "+line);
                buffSalida.flush();
               
                         
            }      
     } catch(Exception e){};   
                    
                    
    }
    
    
    
    public static void main(String[] args){
        
    Socket cliente;
    int puerto = 9000;
    String ip = "10.10.180.134";
    DataOutputStream buffSalida;
    DataInputStream buffEntrada,teclado;
    
    
    String tec = "h";
    String msg;
    
        try{
            
                  
            cliente = new Socket(ip, puerto);
            buffSalida  = new DataOutputStream(cliente.getOutputStream());
            buffEntrada = new DataInputStream(cliente.getInputStream());
            teclado = new DataInputStream(System.in);
            
            String nombre = ">>>";
            
            Cliente cliente1 = new Cliente(cliente,buffSalida,buffEntrada,teclado,nombre);
            cliente1.RecibirDatos();
            cliente1.EscribirDatos();
            
          
            
        } catch(Exception e) {};
    }
    
}
