package application;

import Entities.Contract;
import Services.ContractService;
import Services.PayPalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato");
        System.out.println("Numero: ");
        int number = leitor.nextInt();
        System.out.println("Data (dd/MM/yyyy");
        LocalDate date = LocalDate.parse(leitor.next(), format);
        System.out.println("Valor do contrato: ");
        double totalValue = leitor.nextDouble();

        Contract contract = new Contract(number,totalValue,date);

        System.out.print("Entre com o numero de parcelas: ");
        int n = leitor.nextInt();

        ContractService contractService = new ContractService(new PayPalService());

        contractService.processContract(contract, n);








    }
}