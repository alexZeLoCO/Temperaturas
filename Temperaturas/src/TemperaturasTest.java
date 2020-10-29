import java.util.Scanner;		//IMPORTAR SCANNER

/**
 * @author PROFESORES DE IP
 * 
 *	EL PROGRAMA ALMACENAR� 24 TEMPERATURAS (UNA POR CADA HORA DEL D�A) EN UN VECTOR.
 *		UTILIZAR� M�TODOS SET Y GET PARA INTRODUCIR Y DEVOLVER LAS TEMPERATURAS.
 *		CALCULAR� CON UN M�TODO MEDIA() LA TEMPERATURA MEDIA.
 *		CALCULAR� CON UN M�TODO MAX() LA TEMPERATURA M�XIMA.
 */

public class TemperaturasTest {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);		//CREA TECLADO
		Temperaturas t = new Temperaturas ();		//CREA NUEVO VECTOR DE TEMPERATURAS
		
		
		for (int hora = 0; hora<24;hora++) {
			System.out.print("Introduzca temperatura: ");		//PIDE DATO
			double valor = teclado.nextDouble();		//INTRODUCE DATO EN VALOR
			t.setGrados(hora, valor);		//ALMACENA VALOR EN VECTOR
				//M�TODO VECTOR.SETGRADOS()
		}
				//OUTPUT
		System.out.printf("La temperatura media ha sido de %.2f grados.\n",t.media());
		System.out.printf("La temperatura m�xima ha sido de %.2f grados.\n",t.max());
		System.out.print("Gr�fico: \n");
		t.pintaGr�fico();
	}

}
