
public class Operacoes {
	private double numero1;
	private double numero2;

	public Operacoes(double num1, double num2) {
		this.numero1 = num1;
		this.numero2 = num2;
	}

	public double getNumero1() {
		return numero1;
	}

	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}

	public double getNumero2() {
		return numero2;
	}

	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}

	public void soma() {
		double soma = getNumero1() + getNumero2();
		System.out.println("Resultado: " + getNumero1() + " + " + getNumero2() + " = " + soma);
	}

	public void subtrai() {
		double subtracao = getNumero1() - getNumero2();
		System.out.println("Resultado: " + getNumero1() + " - " + getNumero2() + " = " + subtracao);
	}

	public void multiplica() {
		double multiplica = getNumero1() * getNumero2();
		System.out.println("Resultado: " + getNumero1() + " X " + getNumero2() + " = " + multiplica);
	}

	public void divide() {
		double divide;
		if (getNumero1() == 0) {
			System.out.println("Qualquer número divido por 0 é 0.");
		} else {
			if (getNumero2() == 0) {
				System.out.println("Impossível dividir por 0.");
			} else {
				divide = getNumero1() / getNumero2();
				System.out.println("Resultado: " + getNumero1() + " / " + getNumero2() + " = " + divide);
			}
		}
	}

	public void resultado(double resultado) {
		System.out.println("Resultado: " + getNumero1() + " ^ " + getNumero2() + " = " + resultado);
	}

	public void eleva() {
		double resultado = Math.pow(getNumero1(), getNumero2());
		resultado(resultado);
	}
}
