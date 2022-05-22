//DOMINGUEZ NAVARRETE EDUARDO 
//MAURICIO MARTINEZ 
package main;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.*;
import java.awt.*;


public class main  {
    int id, cantidad;
    double precio, importe;
    String descripcion;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public double getCantidad(){
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double getImporte(){
        return importe;
    }
    public void setImporte(double importe) {
        this.importe = importe;
    }
}
