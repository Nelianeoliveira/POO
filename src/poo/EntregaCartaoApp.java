package poo;


import poo.model.Cliente;
import poo.model.Endereco;



public class EntregaCartaoApp {

    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.cep = "0000000";
        //dados do endereço

        Cliente cliente = new Cliente();
        //dados do cliente
        
        try {
            cliente.adicionaEndereco(endereco);
            System.out.println("Endereço adicionado com sucesso!");

        } catch (Exception e) {
System.err.println("Houve um erro ao adicionar endereço." + e.getMessage());


        }
    }
}
