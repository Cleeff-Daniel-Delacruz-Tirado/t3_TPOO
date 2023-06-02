/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author User
 */
public class pantalon 
extends prenda
implements precio , Descripcion {

     private String modelo;
             
     @Override 
      public String getNombre(){
         return getModelo()+ "  " + modelo;
    
      }
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void precioProducto() {
        
    }

    @Override
    public void indicaDetalle() {
        
    }
    
  
    
  
}
