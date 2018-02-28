/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad  de  los Andes   (Bogotá - Colombia)
 * Departamento de  Ingeniería  de  Sistemas    y   Computación
 * Licenciado   bajo    el  esquema Academic Free License versión 2.1
 *      
 * Proyecto Cupi2   (http://cupi2.uniandes.edu.co)
 * Ejercicio: n2_maquinaExpendedora
 * Autor: Equipo Cupi2 2018
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package uniandes.cupi2.maquinaExpendedora.mundo;

/**
 * Clase que representa un conjunto de monedas.
 */
public class Monto
{

	// -----------------------------------------------------------------
	// Constantes
	// -----------------------------------------------------------------
	/**
	 * Valor máximo que puede tener el monto.
	 */
	// TODO Parte 2 Punto A: Declarar la constante VALOR_MAXIMO según el modelo del mundo.
	public final static double VALOR_MAXIMO = 10000;

	/**
	 * Constante que representa una moneda de $50 COP.
	 */
	// TODO Parte 2 Punto B: Declarar la constante MONEDA_50 según el modelo del mundo.
	public final static int MONEDA_50 = 50;

	/**
	 * Constante que representa una moneda de $100 COP.
	 */
	// TODO Parte 2 Punto C: Declarar la constante MONEDA_100 según el modelo del mundo.
	public final static int MONEDA_100 = 100;

	/**
	 * Constante que representa una moneda de $200 COP.
	 */
	// TODO Parte 2 Punto D: Declarar la constante MONEDA_200 según el modelo del mundo.
	public final static int MONEDA_200 = 200;

	/**
	 * Constante que representa una moneda de $500 COP.
	 */
	// TODO Parte 2 Punto E: Declarar la constante MONEDA_500 según el modelo del mundo.
	public final static int MONEDA_500 = 500;

	/**
	 * Constante que representa una moneda de $1000 COP.
	 */
	// TODO Parte 2 Punto F: Declarar la constante MONEDA_1000 según el modelo del mundo.
	public final static int MONEDA_1000 = 1000;
	// -----------------------------------------------------------------
	// Atributos
	// -----------------------------------------------------------------

	/**
	 * Cantidad de monedas de $50 COP que hay en el monto.
	 */
	private int cantidadMonedas50;

	/**
	 * Cantidad de monedas de $100 COP que hay en el monto.
	 */
	private int cantidadMonedas100;

	/**
	 * Cantidad de monedas de $200 COP que hay en el monto.
	 */
	private int cantidadMonedas200;

	/**
	 * Cantidad de monedas de $500 COP que hay en el monto.
	 */
	private int cantidadMonedas500;

	/**
	 * Cantidad de monedas de $1000 COP que hay en el monto.
	 */
	private int cantidadMonedas1000;

	// -----------------------------------------------------------------
	// Constructores
	// -----------------------------------------------------------------

	/**
	 * Crea un nuevo monto sin monedas. <br>
	 * <b>post: </b> Se inicializaron todas las cantidades en 0.
	 */
	public Monto( )
	{
		// TODO Parte 2 Punto G: Completar el método constructor de la clase según la documentación dada.
		cantidadMonedas50 = 0;
		cantidadMonedas100 = 0;
		cantidadMonedas200 = 0;
		cantidadMonedas500 = 0;
		cantidadMonedas1000 = 0;
	}

	// -----------------------------------------------------------------
	// Métodos
	// -----------------------------------------------------------------

	/**
	 * Retorna la cantidad de monedas de 50.
	 * @return Cantidad de monedas de 50.
	 */
	public int darCantidadMonedas50( )
	{
		return cantidadMonedas50;
	}

	/**
	 * Retorna la cantidad de monedas de 100.
	 * @return Cantidad de monedas de 100.
	 */
	public int darCantidadMonedas100( )
	{
		return cantidadMonedas100;
	}

	/**
	 * Retorna la cantidad de monedas de 200.
	 * @return Cantidad de monedas de 200.
	 */
	public int darCantidadMonedas200( )
	{
		return cantidadMonedas200;
	}

	/**
	 * Retorna la cantidad de monedas de 500.
	 * @return Cantidad de monedas de 500.
	 */
	public int darCantidadMonedas500( )
	{
		return cantidadMonedas500;
	}

	/**
	 * Retorna la cantidad de monedas de 1000.
	 * @return Cantidad de monedas de 1000.
	 */
	public int darCantidadMonedas1000( )
	{
		return cantidadMonedas1000;
	}

	/**
	 * Retorna la cantidad total de monedas del monto.
	 * @return Cantidad total de monedas en el monto.
	 */
	public int darCantidadTotalMonedas( )
	{
		// TODO Parte 2 Punto H: Completar el método según la documentación dada.
		int suma = darCantidadMonedas50() +darCantidadMonedas100() +darCantidadMonedas200() +darCantidadMonedas500() +darCantidadMonedas1000();
		return suma;
	}

	/**
	 * Retorna el valor total del monto.
	 * @return Valor total del monto.
	 */
	public double darValorTotal( )
	{
		// TODO Parte 2 Punto I: Declarar y completar el método darValorTotal según la documentación dada y el modelo conceptual.

		double suma = (darCantidadMonedas50() *MONEDA_50) +(darCantidadMonedas100() *MONEDA_100) +(darCantidadMonedas200() *MONEDA_200) +(darCantidadMonedas500() *MONEDA_500) +(darCantidadMonedas1000() *MONEDA_1000);
		return suma;
	}

	/**
	 * Agrega una moneda al monto. <br>
	 * <b>post: </b> Se aumentó en uno la cantidad de monedas de la denominación dada.
	 * @param pMoneda Denominación de la moneda. pMoneda pertenece a {MONEDA_50, MONEDA_100, MONEDA_200, MONEDA_500, MONEDA_1000}.
	 * @return True si pudo agregar la moneda, falso si no pudo agregarla porque sobrepasaba el valor máximo.
	 */
	public boolean agregarMoneda( int pMoneda )
	{
		// TODO Parte 2 Punto J: Completar el método según la documentación dada.
		// Debe usar 'switch' como parte de la solución.
		boolean rta =false;
		if ((darValorTotal() + pMoneda) <= VALOR_MAXIMO)
		{
			switch(pMoneda)
			 {
			case MONEDA_50 :
			 { 
				cantidadMonedas50 ++;
			 rta=true;
			break;
			
			}
			case MONEDA_100 :
			{ 
				cantidadMonedas100 ++;
			rta = true;
			break;
			
			}
			case MONEDA_200 :
			{ 
				cantidadMonedas200 ++;
			rta = true;
			break;
			
			}
			case MONEDA_500 :
			{ 
				cantidadMonedas500 ++;
			rta = true;
			break;
			
			}
			case MONEDA_1000 :
			{ 
				cantidadMonedas1000 ++;
			rta = true;
			break;
			}
			 }
		
	}
		return rta;
	}
	/**
	 * Asigna la cantidad de monedas de cada denominación necesaria para completar el valor que entra por parámetro.<br>
	 * Se debe garantizar el uso de la mínima cantidad de monedas. <br>
	 * <b>post: </b> Se asignó la cantidad de monedas requeridas a cada denominación.
	 * @param pValor Valor a completar en monedas. pValor >= 0 && pValor%50 == 0.
	 */
	public void cambiarValor( double pValor )
	{
		// TODO Parte 2 Punto K: Completar el método según la documentación dada.
		// Se recomienda ver el documento de consideraciones adicionales de diseño.
		cantidadMonedas1000= (int) (pValor/MONEDA_1000);

		double residuo = pValor%MONEDA_1000;

		pValor = residuo;

		cantidadMonedas500= (int) (pValor/MONEDA_500);

		 residuo = pValor%MONEDA_500;

		pValor = residuo;
		
		cantidadMonedas200= (int) (pValor/MONEDA_200);

		 residuo = pValor%MONEDA_200;

		pValor = residuo;
		
		cantidadMonedas100= (int) (pValor/MONEDA_100);

		 residuo = pValor%MONEDA_100;

		pValor = residuo;
		
		cantidadMonedas50= (int) (pValor/MONEDA_50);

		 residuo = pValor%MONEDA_50;

		pValor = residuo;


	}

	/**
	 * Reinicia todas las cantidades de las monedas.<br>
	 * <b>post: </b> Se cambiaron a 0 todas las cantidades de monedas.
	 */
	public void reiniciar( )
	{
		cantidadMonedas50 = 0;
		cantidadMonedas100 = 0;
		cantidadMonedas200 = 0;
		cantidadMonedas500 = 0;
		cantidadMonedas1000 = 0;
	}
}
