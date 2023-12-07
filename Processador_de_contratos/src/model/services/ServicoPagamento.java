package model.services;

public interface ServicoPagamento {
	double jurosMensal (double valor, Integer numero);
	double taxaPagamento (double valor);
}
