/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package algcarro;

/**
 *
 * @author eduardo
 */
public class AlgCarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CategoriaInterface esportivo  = new CategoriaEsportivo();
        Carro carro = new Carro(esportivo);
        
        carro.setPlaca("2423434")
             .setAno(1998)
             .setChassi("sdsd")
             .setModelo("lsdasdas")
             .setNome("Gol");
        
        Carro carro2 = new Carro(esportivo);
        carro2.setNome("Carro 2")
              .setAno(1993)
              .setChassi("23214j242")
              .setModelo("lalala")
              .setPlaca("3j21lk3j");
        
        try {
            System.out.println(esportivo.getCars());
            Pessoa pessoa = new Pessoa();
            Locacao locacao = new Locacao(pessoa, carro);
//            Locacao locacaoInvalida = new Locacao(pessoa, carro);
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
    }
}