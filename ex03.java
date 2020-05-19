import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		ContaCorrente conta = new ContaCorrente(0, 0, 100, 0, 0, 0);		
		
		conta.deposito(50);
		conta.saque(100);
		conta.saldo();
	}

}
