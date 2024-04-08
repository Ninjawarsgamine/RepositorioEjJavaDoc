package ejercicio2herencia.paquete2;
import ejercicio2herencia.paquete1.CocheCambioAutomatico;
import ejercicio2herencia.paquete1.CocheCambioManual;

public class AppCoches {

	public static void main(String[] args) {
		CocheCambioManual c=new CocheCambioManual("8388-GMZ");
		CocheCambioAutomatico c1=new CocheCambioAutomatico("5332-QHY");
		System.out.println(c);
		c.acelerar(10);
		c.cambiarMarcha(1);
		System.out.println(c1);
		c1.acelerar(10);
		System.out.println(c);
		System.out.println(c1);
		//Sí que va a cambiar de marcha porque 10 no es menor que 10, pero si es menor de 20,
		//por lo que la marcha tiene que cambiarse a 2.
		

		
	}

}
