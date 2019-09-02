/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym.spartan;

/**
 *
 * @author pedro
 */
public class usuario {
    
    String nombre;
    String password;
    String alias;
    
    public usuario(String nombre, String password, String alias)
    {
        this.nombre = nombre;
        this.password = password;
        this.alias = alias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    
    
}
