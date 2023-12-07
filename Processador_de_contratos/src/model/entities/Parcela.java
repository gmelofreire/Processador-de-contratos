package model.entities;


import java.time.LocalDate;

public class Parcela {
	
	private LocalDate dataParcela;
	private Double valorParcela;
	
	public Parcela(LocalDate dataParcela, Double valorParcela) {
		super();
		this.dataParcela = dataParcela;
		this.valorParcela = valorParcela;
	}

	public LocalDate getDataParcela() {
		return dataParcela;
	}

	public void setDataParcela(LocalDate dataParcela) {
		this.dataParcela = dataParcela;
	}

	public Double getValorParcela() {
		return valorParcela;
	}

	public void setValorParcela(Double valorParcela) {
		this.valorParcela = valorParcela;
	}

	
	
}
