/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Suporte
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        meuCarro.setCor("Preto");
        meuCarro.setNumPortas(4);
        meuCarro.setPlaca("ASDA-1232");
        meuCarro.setTipo("Gol");

        System.out.println("---------CARRO---------");
        System.out.println("Cor: " + meuCarro.getCor());
        System.out.println("N° Portas: " + meuCarro.getNumPortas());
        System.out.println("Placa: " + meuCarro.getPlaca());
        System.out.println("Modelo: " + meuCarro.getTipo());

    }

}
