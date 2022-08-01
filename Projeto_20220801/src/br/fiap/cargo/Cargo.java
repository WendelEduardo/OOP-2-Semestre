package br.fiap.cargo;

public enum Cargo implements InterfaceCargo{

	ATENDENTE{
		public double calcularComissao(double valor) {
			return valor * 0.10;
		}
	},
	
	VENDEDOR{
		public double calcularComissao(double valor) {
			return valor * 0.15 + 5;
		}
	},
	
	GERENTE{
		public double calcularComissao(double valor) {
			return valor * 0.20 + 10;
		}
	}
	
}