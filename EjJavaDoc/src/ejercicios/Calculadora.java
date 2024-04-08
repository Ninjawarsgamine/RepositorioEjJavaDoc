package ejercicios;

public class Calculadora {
/**
 * 	La clase calculadora proporciona métodos para realizar operaciones aritméticas básicas
 * Soporta suma, resta, multiplicación y división
 * @author daw1
 * @version 20
 * @since 02/04/2024
 * 
 */
	//Esto es un "Javadoc"
	

	 /**
	  * Suma dos números enteros
	  * @param n1: Es el primer número.
	  *  @param n2: Es el segundo número.
	  *  @return resultado: El resultado de la suma de los números
	  *  @throws Si alguno de los números es negativo
	  *  @see <a href="https://es.wikipedia.org/wiki/Divisi%C3%B3n_por_cero#:~:text=En%20matem%C3%A1ticas%2C%20la%20divisi%C3%B3n%20entre,lugar%20a%20aparentes%20paradojas%20matem%C3%A1ticas." División entre 0.
	  */
	
	private static int suma(int n1,int n2) {

		if (n1<0 ||n2<0) {
			throw new IllegalArgumentException("No se pueden introducir números negativos.");
		}
		return n1+n2;
	}
	
	private static int resta(int n1,int n2) {
		if (n1<0 ||n2<0) {
			throw new IllegalArgumentException("No se pueden introducir números negativos");
		}
		return n1-n2;
	}
	
	private static int multiplicacion(int n1,int n2) {
		if (n1<0 ||n2<0) {
			throw new IllegalArgumentException("No se pueden introducir números negativos");
		}
		return n1*n2;
	}
	private static int division(int n1,int n2) {
		if (n1<0 ||n2<0) {
			throw new IllegalArgumentException("No se pueden introducir números negativos");
		}
		
		if (n2==0) {
			throw new IllegalArgumentException("No se puede dividir un número entre 0.");
		}
		return n1/n2;
	}
	
}
