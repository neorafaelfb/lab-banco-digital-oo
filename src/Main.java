import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		*/
		Cliente cliente = new Cliente();
		String nomeCliente;
		double valor;
		boolean sairDoApp = false;
		int opcao;

		System.out.println("Insira o nome do cliente: ");
		Scanner scanner = new Scanner(System.in);
		nomeCliente = scanner.nextLine();
		cliente.setNome(nomeCliente);

		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);

		while(sairDoApp != true){
			System.out.println("1 - Depositar CC\n2 - Sacar CC");
			System.out.println("3 - Depositar Poupança\n4 - Sacar Poupança");
			System.out.println("5 - Transferir CC -> Poupança\n6 - Transferir Poupança -> CC");
			System.out.println("7 - Imprimir Extrato CC\n8 - Imprimir Extrato Poupança");
			System.out.println("9 - Sair do programa.");
			opcao = scanner.nextInt();
			switch(opcao){
				case 1:{
					System.out.println("Insira valor de deposito: ");
					valor = scanner.nextDouble();
					cc.depositar(valor);
					break;
				}
				case 2:{
					System.out.println("Insira valor de saque: ");
					valor = scanner.nextDouble();
					cc.sacar(valor);
					break;
				}
				case 3:{
					
					System.out.println("Insira valor de deposito: ");
					valor = scanner.nextDouble();
					poupanca.depositar(valor);
					break;
				}
				case 4:{
					System.out.println("Insira valor de saque: ");
					valor = scanner.nextDouble();
					poupanca.sacar(valor);
					break;
				}
				case 5:{
					System.out.println("Insira valor de transferencia: ");
					valor = scanner.nextDouble();
					cc.transferir(valor, poupanca);
					break;
				}
				case 6:{
					System.out.println("Insira valor de transferencia: ");
					valor = scanner.nextDouble();
					poupanca.transferir(valor, cc);
					break;
				}
				case 7:{
					cc.imprimirExtrato();
					break;
				}
				case 8:{
					poupanca.imprimirExtrato();
					break;
				}
				case 9:{
					System.out.println("Fim do programa.");
					sairDoApp = true;
					break;
				}
				default:{
					System.out.println("Escolha inválida.");
				}
			}
		}

		scanner.close();
	}

}
