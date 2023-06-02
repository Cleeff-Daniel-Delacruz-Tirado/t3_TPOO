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
public class camisa         
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

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    @Override
    
    public void indicaDetalle(){
     }
     
    /**
     *
     */
    @Override
    
    public void precioProducto(){
        
    }
    
  
    
    
}
