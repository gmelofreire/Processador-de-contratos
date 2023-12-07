package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Contrato {
	
	private LocalDate dataContrato;
	private Integer numeroContrato;
	private Double valorContrato;
	
	public List<Parcela> parcelas = new ArrayList<>();
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public Contrato(LocalDate dataContrato, Integer numeroContrato, Double valorContrato) {
		super();
		this.dataContrato = dataContrato;
		this.numeroContrato = numeroContrato;
		this.valorContrato = valorContrato;
	}

	public LocalDate getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(LocalDate dataContrato) {
		this.dataContrato = dataContrato;
	}

	public Integer getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(Integer numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public Double getValorContrato() {
		return valorContrato;
	}

	public void setValorContrato(Double valorContrato) {
		this.valorContrato = valorContrato;
	}

	public List<Parcela> getParcelas() {
		return parcelas;
	}
	
	public void apresentarDados() {
		double valorTotal = 0;
		for (Parcela parcela : parcelas) {
			System.out.println(parcela.getDataParcela().format(formatter) + " - " + parcela.getValorParcela());
			valorTotal += parcela.getValorParcela();
		}
		System.out.println("Valor total pago: " + valorTotal);
	}
}
