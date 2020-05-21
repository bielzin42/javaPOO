
public class ex04 {
	public static void main (String [] args) {
		Voo boeing = new Voo(001, null, "",0);
		Voo boeing1 = new Voo(2203, null, "",45);
		Voo boeing2 = new Voo(1709, null, "",17);
		
		//boeng.numeroVoo();
		//boeng.dataVoo();
		boeing.controlePassageiros();
		boeing1.controlePassageiros();
		boeing2.controlePassageiros();
	}
}
