
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N =10; int M =1 ;
		 int valorEntero= (int) Math.floor(Math.random()*(N-M+1)+M);
		 System.out.println(valorEntero);
			if (valorEntero>5) { // Realizamos una estructura alternativa para imprimir por pantalla dependiendo del valor del numero
			System.out.println("Hoy va a ser un gran día"); 
			}
			else 
				System.out.println("Hoy va a ser el mejor día del mundo");{
		 }
	}
}

