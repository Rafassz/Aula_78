package options;

import java.util.Optional;

public class Teste {

	public static void main(String[] args) {

		Cliente cliente = new Cliente ("Dylan");
		
		Optional <Cliente> clienteOption = Optional.ofNullable(cliente);
		
		String nome = clienteOption.map(resposta -> resposta.getNome()).orElse("Cliente não encontrado!!");
		
		System.out.println(nome);
		
	}

}
