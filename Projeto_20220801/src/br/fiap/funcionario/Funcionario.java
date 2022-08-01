package br.fiap.funcionario;

import br.fiap.cargo.Cargo;

public class Funcionario {

	private String nome;
	private double salario;
	private Cargo cargo;

	public Funcionario(String nome, double salario, Cargo cargo) {
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		String aux = "";
		aux += "Nome: " + nome + "\n";
		aux += "Salario: " + salario + "\n";
		aux += "Cargo: " + cargo + "\n";

		return aux;
	}

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}

	public Cargo getCargo() {
		return cargo;
	}

}
