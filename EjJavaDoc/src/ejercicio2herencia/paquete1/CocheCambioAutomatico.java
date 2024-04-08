package ejercicio2herencia.paquete1;

public class CocheCambioAutomatico extends Coche {
	public CocheCambioAutomatico(String matricula){
		super(matricula);
		
	}
	/**
	 * Esta clase es una clase hija de "Coche".
	 * El cambio de marcha es automático según la aceleración del coche.
	 */
	public void acelerar(int velAceleracion) {
		/**
		 * Es una función donde cambiamos la marcha del coche según la velocidad más la velocidad de aceleración que este tenga de manera automática. 
		 * @param velAceleracion: Es la velocidad de aceleración
		 * @throws Si la velocidad es menor de 10, la marcha es 1, si es mayor que 10, pero menor de 20, la marcha es 2, si es mayor que 20 y menor que 30, la marcha es 3 y sino, la marcha es 4.
		 */
		int velocidad=getVelocidad();
		velocidad=velocidad+velAceleracion;
		setVelocidad(velocidad);
		if (velocidad<10) {
			cambioMarcha(1);
			
		}else {
			if (velocidad<20) {
				cambioMarcha(2);
				
			}else {
				if (velocidad<30) {
					cambioMarcha(3);
					
				}else {
					cambioMarcha(4);
				}
			}
		}
	}
	
	public void frenar(int velFrenada) {
		/**
		 * Es una función donde cambiamos la marcha del coche según la velocidad menos la velocidad de frenada que este tenga de manera automática. 
		 * @param velFrenada: Es la velocidad de frenada
		 * @throws Si la velocidad es menor de 10, la marcha es 1, si es mayor que 10, pero menor de 20, la marcha es 2, si es mayor que 20 y menor que 30, la marcha es 3 y sino, la marcha es 4.
		 */
		int velocidad=getVelocidad();
		velocidad=velocidad-velFrenada;
		setVelocidad(velocidad);
		if (velocidad<10) {
			cambioMarcha(1);
			
		}else {
			if (velocidad<20) {
				cambioMarcha(2);
				
			}else {
				if (velocidad<30) {
					cambioMarcha(3);
					
				}else {
					cambioMarcha(4);
				}
			}
		}
		
		
	}
	
	
	
}
