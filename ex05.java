
public class ex05 {

	public static void main(String[] args) {
		Empregados empregado0 = new Empregados(00, "Asheley", "Banks", 100);
		Empregados empregado1 = new Empregados(01, "Carlton", "Banks", 500);
		Empregados empregado2 = new Empregados(02, "Will", "Smith", 500);
		
		empregado2.nomeSalario();
		System.out.println("--------------------------------");
		empregado0.aumento20();
		System.out.println("--------------------------------");
		empregado1.reajuste(-10);		
	}
}
