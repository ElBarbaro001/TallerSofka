class Numeros {
	int a;
	int b;
}

public class mayor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numeros n1 = new Numeros();
		Numeros n2 = new Numeros();
		n1.a  = 29;
		n2.b = 209;
		if(n1.a > n2.b) {
			System.out.println("El # "+ n1.a+", es mayor que el # "+n2.b);
		}else if (n1.a == n2.b){
			System.out.println("El # "+ n1.a+", es igual al # "+n2.b);
		}else {
			System.out.println("El # "+ n1.a+", es menor que el # "+n2.b);
		}
	}

}
