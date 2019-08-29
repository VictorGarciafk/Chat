package gym.spartan;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class Archivos {
    
    public static void guardarArchivosTxT(String nombre, String email, String contraseña) {
        File Archivo;
        FileWriter fw;
        PrintWriter linea;
        try {
            String ruta = "C:\\Users\\Public\\usuarios.txt";
            String contenido = nombre + "\n" + email + "\n" + contraseña;
            Archivo = new File(ruta);
            // Si el archivo no existe es creado
            if (!Archivo.exists()) {
                Archivo.createNewFile();
            }
            fw = new FileWriter(Archivo, true);
            linea = new PrintWriter(fw);
            linea.println(contenido);
            linea.close();
            fw.close();
            
            JOptionPane.showMessageDialog(null, "YOUR DATA HAVE BEEN RECORDED SUCCESSFULLY!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "THERE HAS BEEN AN ERROR WHEN SAVING YOUR FILES, TRY AGAIN");
        }
    }
    
    public void leerArchivo() {
        String correo = "";
        String contraseña = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Public\\usuarios.txt"));
            String temp1 = "";
            String temp2 = "";
            String cadena;
            int i = 1;
            while ((cadena = br.readLine()) != null) {
                if (i%5 == 0) {
                    temp1 = temp1 + cadena + "\n";
                }
                i = i+1;
                if (i%6 == 0) {
                    temp2 = temp2 + cadena + "\n";
                }
                if (i == 7) {
                    i = 1;
                }
            }
            
            correo = temp1;
            contraseña = temp2;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "YOU CAN'T ACCESS");
        }
    }
    
    public boolean leerCorreoYContraseña(String contraseña, String correo) {
        boolean resultado = false;
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Public\\usuarios.txt"));
            String tempcorreo = "";
            String tempcontraseña = "";
            String cadena;
            int i = 1;
            while ((cadena = br.readLine()) != null) {
                if (i%5 == 0) {
                    tempcorreo = cadena;
                }
                if (i%6 == 0) {
                    tempcontraseña = cadena;
                }
                i = i+1;
                if (i == 7) {
                    if (correo.equals(tempcorreo) && contraseña.equals(tempcontraseña)) {
                        resultado = true;
                        break;
                    }
                    i = 1;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "YOU CAN'T ACCESS");
        }
        return resultado;
    }
}
