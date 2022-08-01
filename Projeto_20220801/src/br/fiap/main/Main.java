package br.fiap.main;

import java.util.Collection;
import java.util.HashSet;

import br.fiap.cargo.Cargo;
import br.fiap.funcionario.Funcionario;
import br.fiap.venda.Venda;

public class Main {

	public static void main(String[] args) {
		
		Collection<Venda> listaDeVendas = new HashSet<Venda>();
		
		Venda venda = new Venda(new Funcionario("Wendel", 5500, Cargo.GERENTE), 1000);
		System.out.println(venda.CalcularComisao());
		
		listaDeVendas.add(venda);
		
		System.out.println("\n------- Lista de Vendas -------");
		listaDeVendas.forEach(lista -> System.out.println(lista));
	}

}