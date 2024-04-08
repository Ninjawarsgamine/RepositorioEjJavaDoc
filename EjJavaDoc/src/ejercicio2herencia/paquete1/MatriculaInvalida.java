package ejercicio2herencia.paquete1;

public class MatriculaInvalida extends RuntimeException {
	
public MatriculaInvalida() {
	/**
	 * Es una excepción creada únicamente para cuando las matrículas son inválidas.
	 * Es una clase hija de "RunTimeException", por lo que salta cuando la invoques. Solo escribe "Matrícula inválida.".
	 */
	System.out.println("Matrícula inválida.");
}
}
