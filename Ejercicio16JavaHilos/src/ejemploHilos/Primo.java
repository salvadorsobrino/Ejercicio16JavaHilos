package ejemploHilos;

public class Primo extends Thread {

	private int numero;

	public Primo() {
	}

	/**
	 * M?todo que muestra si el numero que ha introducido el usuario por pantalla, y
	 * mostrar? si es primo o no.
	 * NOTA:
	 * 
	 * En este caso estan accediendo a objetos distintos por lo tanto no estan accediendo a ning?n
	 * recurso compartido no hay ese problema. Pero en caso de que se diera
	 * tenemos la clausula synchronized en el m?todo. 
	 *	
	 *	Tambi?n se podr?an implementar otros mecanismos como semaforos, locks o monitores para 
	 *	asegurar el acceso al recurso de forma segura.
	 */
	public synchronized void run() {
		boolean primo = true;

		if (this.numero != 2 && this.numero % 2 == 0) {
			// Comprobamos que sea distinto de 2 (el ?nico primo par, y si es par el n?mero
			// introducido)
			primo = false;
		} else {
			// Comprobamos a continuacion si el numero introducido es divisible solo entre
			// si mismo y la unidad. NOTA: observar el signo < no es <= IMPORTANTE. Adem?s sumamos
			// de dos en dos ya que los pares estan descartados
			for (int i = 3; i < this.numero; i+=2) {
				if (this.numero % i == 0) {
					primo = false;
				}

			}

		} //Mostramos por pantalla si es primo o no
		if (primo) {
			System.out.println("El numero " + this.numero + " es Primo");
		} else {
			System.out.println("El numero " + this.numero + " NO es Primo");
		}

	}
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
