/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package algcarro;

import java.util.Date;

/**
 *
 * @author eduardo
 */
public class Locacao {
    private double valor;
    private Date data;
    private Pessoa pessoa;
    private Carro carro;
    
    public Locacao(Pessoa pessoa, Carro carro) {
        this.pessoa = pessoa;
        this.carro = carro;
        
        if (!carro.isAvailable()) {
            throw new RuntimeException("O carro não está disponível");
        }
        
        this.valor = this.carro.getCategoria().getValor();
        this.data = new Date();
        this.carro.setAvailable(false);
    }
}
