/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package algcarro;

import java.rmi.UnexpectedException;
import java.util.ArrayList;

/**
 *
 * @author eduardo
 */
public class CategoriaEsportivo implements CategoriaInterface {
    private ArrayList<Carro> cars = new ArrayList();
    
    @Override
    public String getName() {
        return "Esportivo";
    }

    @Override
    public Double getValor() {
        return 50.50;
    }

    @Override
    public void addCar(Carro carro) {
        this.cars.add(carro);
    }

    @Override
    public ArrayList getCars() {
        return this.cars;
    }

    @Override
    public Carro getCar(String placa) {
        for (Carro carro : this.cars) {
            if (carro.getPlaca() == placa) {
                return carro;
            }
        }
        
        throw new RuntimeException("Carro não encontrado");
    }
    
}
