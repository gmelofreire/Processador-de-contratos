package application;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Contrato;
import model.services.ServicoContrato;
import model.services.ServicoPayPal;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do contrato: ");
		System.out.print("Numero do contrato: ");
		int numeroContrato = sc.nextInt();
		sc.nextLine();
		System.out.print("Data do contrato: ");
		LocalDate dataContrato = LocalDate.parse(sc.nextLine(), formatter);
		System.out.print("Valor do contrato: ");
		double valorContrato = sc.nextDouble();
		System.out.print("Entre com o numero de parcelas: ");
		int numeroParcelas = sc.nextInt();
		
		Contrato contrato = new Contrato(dataContrato, numeroContrato, valorContrato);
		
		ServicoContrato servico = new ServicoContrato(new ServicoPayPal());
		servico.processarContrato(contrato, numeroParcelas);
		
		contrato.mostrarParcela();
		
		sc.close();
	}

}
