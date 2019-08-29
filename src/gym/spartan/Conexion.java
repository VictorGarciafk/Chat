/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym.spartan;
import java.io.*;
import java.net.*;
import java.util.Vector;

public class Conexion extends Thread {
    
    Socket cliente1 = null;
    DataInputStream  buffEntrada;
    DataOutputStream buffSalida;
    DataInputStream  teclado;
    public static Vector<Conexion> clientesConectados = new Vector();
    
    
    public Conexion(Socket cliente, DataInputStream buffEntrada, DataOutputStream buffSalida){
    
        cliente1 = cliente;
        this.buffEntrada = buffEntrada;
        this.buffSalida  = buffSalida;
        clientesConectados.add(this);
    
    }
    
    public void run(){
    
          
        try{
            
            Boolean done = true;
            System.out.println("Num: "+clientesConectados.size());
               
            while (done) { 
                
              String mensaje = buffEntrada.readUTF();
              //System.out.println(mensaje);
            
              
                for(int i = 0; i < clientesConectados.size();i++){
                    
                        if(i != clientesConectados.indexOf(this))
                        clientesConectados.get(i).EnviarMensaje(mensaje);
                }
              
              done = !mensaje.equals("exit");
             
            }
               
        }catch(Exception e){};
     }
    
    public void EnviarMensaje(String mensaje){
     
            try{
                
               
                buffSalida.writeUTF(mensaje);
                
            } catch(Exception e){};
    }
  
}
    

