package br.fiap.venda;

import br.fiap.cargo.Cargo;
import br.fiap.funcionario.Funcionario;

public class Venda {

	private Funcionario funcionario;
	private double valor;

	public Venda(Funcionario funcionario, double valor) {
		this.funcionario = funcionario;
		this.valor = valor;
	}

	public double CalcularComisao() {
		return funcionario.getCargo().calcularComissao(valor);
	}

	@Override
	public String toString() {
		return "Venda [funcionario=" + funcionario + ", valor=" + valor + "]";
	}

}
