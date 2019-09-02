/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym.spartan;
import java.io.*;
import java.net.*;
import java.util.List; 
import java.util.ArrayList;

public class Servidor {

    ServerSocket server;
    int puerto =  9001;
    Conexion[] cliente = new Conexion[50];
    int idClient = 0;
    String usuarios ="";
    String Alias = "";
    String Contraseña = "";
    
    List<usuario> Usuarios;
    
   
    public Servidor() {
         try {
            ObjectInputStream leeLista = new ObjectInputStream( 
            new FileInputStream("listaUsuarios.dat") );
            Usuarios = ( ArrayList <usuario> )leeLista.readObject();
            leeLista.close();
         } catch(Exception e) {};
         if ( Usuarios == null){
          Usuarios = new ArrayList();
         }
    }
{
    
    }

    public void init(){
        
        Socket socket;
       
        
        try{
            
            server = new ServerSocket(puerto);
            System.out.println("Esperando peticiones por el puerto " + puerto);
            
            while(true) {
            
                 socket = server.accept();
                 DataInputStream buffEntrada = new DataInputStream(socket.getInputStream());
                 DataOutputStream buffSalida = new DataOutputStream(socket.getOutputStream());
                             
               //  nombre = 
               //  password =

               // if(ComprobacionDeUsuario(nombre,password) == true) {
                 cliente[idClient] = new Conexion(socket,buffEntrada,buffSalida);
                 cliente[idClient].start();
                //}
                 
            }   
        } catch(Exception e){e.printStackTrace();};
        
          
    }
    
    
    public static void main(String[] args) {
                
        Servidor servidor1 = new Servidor();
        servidor1.init();
        
    }
}
