import java.util.Scanner;

public class ContaCorrente {
	private int numeroAgencia;
	private int numeroConta;
	private double saldo;
	private double deposito;
	private double saque;
	private double valor;

	public ContaCorrente(int numeroAgencia, int numeroConta, double saldo, double deposito, double saque,
			double valor) {
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.deposito = deposito;
		this.saque = saque;
	}

	public int getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}

	public double getSaque() {
		return saque;
	}

	public void setSaque(double saque) {
		this.saque = saque;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	Scanner in = new Scanner(System.in);

	public void deposito(double valorDoDeposito) {
		double saldoAtual = getSaldo();
		System.out.println("Seu saldo é R$: " + saldoAtual);
		System.out.println("Deseja fazer um depósito? 1 - sim 2 - não");
		int escolha = in.nextInt();
		if (escolha == 1) {
			System.out.println("operação em andamento...");
			this.saldo += valorDoDeposito;
			System.out.println("Seu saldo é R$: " + this.saldo);
		} else {
			System.out.println("operação encerrada.");
		}
	}

	public void saque(double valorSaque) {
		double saldoAtual = getSaldo();
		System.out.println("Seu saldo é R$: " + saldoAtual);
		System.out.println("Deseja fazer um saque? 1 - sim 2 - não");
		int escolha = in.nextInt();
		if (escolha == 1) {
			System.out.println("operação em andamento...");
			this.saldo -= valorSaque;
			System.out.println("Seu saldo é R$: " + this.saldo);
		} else {
			System.out.println("operação encerrada.");
		}
	}

	public void saldo() {
		System.out.println("Seu saldo atual é: ");
		System.out.println("R$: " + getSaldo());
	}

}