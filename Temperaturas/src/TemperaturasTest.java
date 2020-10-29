import java.util.Scanner;		//IMPORTAR SCANNER

/**
 * @author PROFESORES DE IP
 * 
 *	EL PROGRAMA ALMACENARÁ 24 TEMPERATURAS (UNA POR CADA HORA DEL DÍA) EN UN VECTOR.
 *		UTILIZARÁ MÉTODOS SET Y GET PARA INTRODUCIR Y DEVOLVER LAS TEMPERATURAS.
 *		CALCULARÁ CON UN MÉTODO MEDIA() LA TEMPERATURA MEDIA.
 *		CALCULARÁ CON UN MÉTODO MAX() LA TEMPERATURA MÁXIMA.
 */

public class TemperaturasTest {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);		//CREA TECLADO
		Temperaturas t = new Temperaturas ();		//CREA NUEVO VECTOR DE TEMPERATURAS
		
		
		for (int hora = 0; hora<24;hora++) {
			System.out.print("Introduzca temperatura: ");		//PIDE DATO
			double valor = teclado.nextDouble();		//INTRODUCE DATO EN VALOR
			t.setGrados(hora, valor);		//ALMACENA VALOR EN VECTOR
				//MÉTODO VECTOR.SETGRADOS()
		}
				//OUTPUT
		System.out.printf("La temperatura media ha sido de %.2f grados.\n",t.media());
		System.out.printf("La temperatura máxima ha sido de %.2f grados.\n",t.max());
		System.out.print("Gráfico: \n");
		t.pintaGráfico();
	}

}
