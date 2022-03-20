/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionoxwind;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author EMANUEL
 */
public class DataConection {
    private String host = "localhost";
    private String port = "3306";
    private String base = "id6245594_venta";
    private String user, password;
    Connection con;
    
    DataConection(){
        this.user = "";
        this.password = "";
    }
    
    public boolean conectar(){
        String url = "jdbc:mysql://"+this.host+":"+this.port+"/"+this.base;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.con=DriverManager.getConnection(url,this.user,this.password);
            Statement stmt=con.createStatement(); 
            ResultSet rs=stmt.executeQuery("show databases;");
            return true;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Datos incorrectos");
            return false;
        }
    }
    
    public Connection getConexion(){
        return this.con;
    }
    
    public String getHost(){
        return this.host;
    }
    
    public void setHost(String valor){
        this.host = valor;
    }
    
    public String getPort(){
        return this.port;
    }
    
    public void setPort(String valor){
        this.port = valor;
    }
    
    public String getBase(){
        return this.base;
    }
    
    public void setBase(String valor){
        this.base = valor;
    }
    
    public String getUser(){
        return this.user;
    }
    
    public void setUser(String valor){
        this.user = valor;
    }
    public String getPassword(){
        return this.password;
    }
    
    public void setPassword(String valor){
        this.password = valor;
    }
    
}
