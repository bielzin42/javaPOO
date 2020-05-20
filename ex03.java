import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		ContaCorrente conta = new ContaCorrente(0, 0, 12000, 0, 0, 0);		
		
		conta.deposito(100);
		conta.saque(0);
		conta.saldo();
	}
}
