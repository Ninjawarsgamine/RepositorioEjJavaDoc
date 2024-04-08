package ejercicio2herencia.paquete1;

import java.util.ArrayList;
import java.util.List;
public class Coche {
	
	/**
	 * Clase para crear un coche.
	 * Hay que darle una matrícula y, de forma automática, se le asigna un bastidor.
	 * De manera opcional, se le puede dar una marcha y/o una velocidad. También se puede acelerar o frenar.
	 * @author daw1
	 * @version 20
	 * @since 18/03/2024
	 */
	
	private String matricula;
	private int velocidad=0;
	protected int marcha=0;
	private int bastidor;
	static private int cnt=0;
	
	public Coche(String matricula) {
		super();
		setMatricula(matricula);
		this.matricula = matricula;
		setBastidor();
		
	}
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		/**
		 * Este método valida una matrícula para poder ser utilizada en un coche, obligando a que tenga 4 dígitos numéricos y tres letras, que no pueden ser vocales.
		 * @param matricula
		 * @throws Admite minúsculas y espacios en blanco(a la izquierda y a la derecha). Los números y las letras tienen que ir separadas por un guión.
		 * @return Devuelve la matrícula introducida si es válida.
		 */
		matricula=matricula.toUpperCase().trim();
	
		if (!matricula.matches("[0-9]{4}-[B-DF-HJ-NP-TV-Z]{3}")) {
			//Expresión regular alternativa: doc.matches("[0-9]{4}[ -]?[A-Z &&[^AEIOU]]"
			throw new MatriculaInvalida();
			//Sacamos la excepción que hemos creado en otra clase usando "throw new excepcion"
		}
	}
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		/**
		 * @param velocidad
		 * @throws La velocidad no puede ser menor que 0.
		 *  @return Devuelve la velocidad introducida si es válida.
		 */
		if (velocidad<0) {
			throw new IllegalArgumentException("La velocidad no puede ser negativa.");
		}
		this.velocidad = velocidad;
	}
	public int getMarcha() {
		return marcha;
	}
	 void cambioMarcha(int marcha) {
		 /**
			 * @param marcha
			 * @throws La marcha no puede ser menor que 0 ni mayor de 4.
			 *  @return Devuelve la marcha introducida si es válida.
			 */

		if (marcha<0) {
			throw new IllegalArgumentException("La marcha no puede ser negativa.");
		}
		if (marcha>4) {
			throw new IllegalArgumentException("La marcha no puede ser superior a 4.");
		}
		this.marcha = marcha;
	}
	public int getBastidor() {
		return bastidor;
	}
	public void setBastidor() { 
		/**
		 * El bastidor se añade automáticamente cuando se crea cada coche. Por eso la variable "cnt" es "static".
		 */
		cnt=cnt+1;
		bastidor = cnt;
	}
	
	public void acelerar(int velAceleracion) {
		/**
		 * Función para establecer una aceleración a la velocidad.
		 * @param velAceleracion: Es la velocidad con la que acelera. Si es negativa, tiene un efecto de frenada.
		 * @return Devuelve la velocidad anterior más la aceleración (suma si es positiva y rest si es negativa).
		 */
		velocidad=velocidad+velAceleracion;
	}
	
	public void frenar(int velFrenada) {
		/**
		 * Función para establecer una aceleración a la velocidad.
		 * @param velFrenada: Es la velocidad con la que frena. Si es negativa, tiene un efecto de aceleración.
		 * @return Devuelve la velocidad anterior restádndole la frenada(o sumando si la frenada es negativa).
		 */
		velocidad=velocidad-velFrenada;
	}
	
	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", velocidad=" + velocidad + "km/h, marcha=" + marcha + ", bastidor="
				+ bastidor + "]";
	}
	
	
	
	
	
}
