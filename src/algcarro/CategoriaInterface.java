/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package algcarro;

import java.util.ArrayList;

/**
 *
 * @author eduardo
 */
public interface CategoriaInterface {
    public String getName();
    
    public Double getValor();
    
    public void addCar(Carro carro);
    
    public ArrayList getCars();
    
    public Carro getCar(String placa);
}
