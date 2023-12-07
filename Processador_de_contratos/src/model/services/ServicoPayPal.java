package model.services;

public class ServicoPayPal implements ServicoPagamento{
	
	public double jurosMensal (double valor, Integer numero) {
		return valor + (valor * 0.01) * numero;
	}
	
	public double taxaPagamento (double valor) {
		return valor * 1.02;
	}
}
