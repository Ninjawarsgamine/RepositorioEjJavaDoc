package ejercicio2herencia.paquete1;

public class CocheCambioManual extends Coche {
	public CocheCambioManual(String matricula){
		super(matricula);
	}
	/**
	 * Esta clase es una clase hija de "Coche".
	 * El cambio de marcha es manual. 
	 */
	public void cambiarMarcha(int marcha) {
		/**
		 * La clase "cambiarMarcha" en la clase padre ("Coche") es "default", por lo que, la hacemos pública en otros paquetes solo para el los coches con un cambio manual de marchas.
		 * @param marcha
		 * @throws Si la matr´cula del coche es inválida, salta una excepción.
		 */
		try {
			cambioMarcha(marcha);
		}catch(Exception matriculaInvalida) {
			throw new IllegalArgumentException("Se ha introducido una matrícula inválida.");
		}
		
	}

}
