package ejemploHilos;
import java.util.Scanner;

public class mainPrimo  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Primo hilo1 = new Primo();
		Primo hilo2 = new Primo();
		Primo hilo3 = new Primo();
		// NOTA: 
		// En este caso estan accediendo a objetos distintos por lo tanto no estan accediendo a ning?n
		// recurso compartido no hay ese problema. Pero en caso de que se diera
		// tenemos la clausula synchronized en el m?todo. 
		//
		// Tambien se podrian implementar otros mecanismos como semaforos, locks o monitores para 
		// asegurar el acceso al recurso de forma segura.
		
		System.out.println("Introduzca un numero para comprobar si es primo:");
		int n = sc.nextInt();
		hilo1.setNumero(n);
		System.out.println("Introduzca otro numero para comprobar si es primo:");
		n = sc.nextInt();
		hilo2.setNumero(n);
		System.out.println("Introduzca el ?ltimo numero para comprobar si es primo:");
		n = sc.nextInt();
		hilo3.setNumero(n);
		
		
		hilo1.start();		
		hilo2.start();
		hilo3.start();
	}
	
}
