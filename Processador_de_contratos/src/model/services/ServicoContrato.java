package model.services;

import model.entities.Contrato;
import model.entities.Parcela;
	
public class ServicoContrato {
	
	private ServicoPagamento servico;
	
	public ServicoContrato(ServicoPagamento servico) {
		super();
		this.servico = servico;
	}

	public void processarContrato(Contrato c, int meses) {
		double valorBaseParcela = c.getValorContrato() / meses;
		for (int i = 0; i < meses; i++) {
			double jurosMensal = servico.jurosMensal(valorBaseParcela, i+1);
			Parcela p = new Parcela(c.getDataContrato().plusMonths(i+1), servico.taxaPagamento(jurosMensal));
			c.parcelas.add(p);
		}
	}
}
