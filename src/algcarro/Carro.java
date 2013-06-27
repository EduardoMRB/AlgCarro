/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package algcarro;

/**
 *
 * @author eduardo
 */
public class Carro {
    private String placa;
    private String chassi;
    private String nome;
    private String modelo;
    private int ano;
    private CategoriaInterface categoria;
    private boolean available = true;
    private String qualquerCoisa;
    
    
        
    public Carro(CategoriaInterface categoria) {
        this.categoria = categoria;
        categoria.addCar(this);
    }
    
    public String getPlaca() {
        return placa;
    }

    public Carro setPlaca(String placa) {
        this.placa = placa;
        
        return this;
    }

    public String getChassi() {
        return chassi;
    }

    public Carro setChassi(String chassi) {
        this.chassi = chassi;
        
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Carro setNome(String nome) {
        this.nome = nome;
        
        return this;
    }

    public String getModelo() {
        return modelo;
    }

    public Carro setModelo(String modelo) {
        this.modelo = modelo;
        
        return this;
    }

    public int getAno() {
        return ano;
    }

    public Carro setAno(int ano) {
        this.ano = ano;
        
        return this;
    }
    
    public String toString() {
        return String.format(
                "Nome: %s \nModelo: %s \nCategoria: %s", 
                this.nome, 
                this.modelo, 
                this.categoria.getName()
        );
    }
    
    public boolean isAvailable() {
        return this.available;
    }
    
    public Carro setAvailable(boolean status) {
        this.available = status;
        
        return this;
    }
    
    public CategoriaInterface getCategoria() {
        return this.categoria;
    }
}
