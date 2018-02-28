/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad	de	los	Andes	(Bogotá	- Colombia)
 * Departamento	de	Ingeniería	de	Sistemas	y	Computación
 * Licenciado	bajo	el	esquema	Academic Free License versión 2.1
 * 		
 * Proyecto	Cupi2	(http://cupi2.uniandes.edu.co)
 * Ejercicio: n2_maquinaExpendedora
 * Autor: Equipo Cupi2 2018
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package uniandes.cupi2.maquinaExpendedora.mundo;

/**
 * Representa un producto de la máquina expendedora.
 */
public class Producto
{

	// -----------------------------------------------------------------
	// Enumeraciones
	// -----------------------------------------------------------------

	/**
	 * Enumeración que define los tipos de producto que pueden existir.
	 */
	// TODO Parte 1 Punto A: Declarar la enumeración Tipo según el modelo del mundo.
	public enum Tipo
	{
		BEBIDA,
		COMIDA
	}

	// -----------------------------------------------------------------
	// Constantes
	// -----------------------------------------------------------------

	/**
	 * Constante que representa el porcentaje de donación al FOPRE.
	 */
	// TODO Parte 1 Punto B: Declarar la constante PORCENTAJE_FOPRE según el modelo del mundo.
	public final static double PORCENTAJE_FOPRE= 0.06;

	/**
	 * Contante que representa la cantidad máxima de unidades que se puede tener de un producto.
	 */
	// TODO Parte 1 Punto C: Declarar la constante CAPACIDAD según el modelo del mundo.
	public final static int CAPACIDAD = 10;
	// -----------------------------------------------------------------
	// Atributos
	// -----------------------------------------------------------------

	/**
	 * Identificador del producto.
	 */
	private String identificador;

	/**
	 * Nombre del producto.
	 */
	private String nombre;

	/**
	 * Precio del producto.
	 */
	private double precio;

	/**
	 * Cantidad de unidades disponibles del producto.
	 */
	private int cantidadUnidadesDisponibles;

	/**
	 * Cantidad de unidades compradas del producto.
	 */
	private int cantidadUnidadesCompradas;

	/**
	 * Tipo del producto.
	 */
	// TODO Parte 1 Punto D: Declarar el atributo tipo según el modelo del mundo.
	private Tipo tipo;

	/**
	 * Atributo que indica si el producto dona parte de sus ganancias al programa FOPRE.
	 */
	// TODO Parte 1 Punto E: Declarar el atributo fopre según el modelo del mundo.
	private boolean fopre;

	// -----------------------------------------------------------------
	// Constructores
	// -----------------------------------------------------------------

	/**
	 * Crea un producto usando la información recibida por parámetro. <br>
	 * <b>post: </b> Se inicializó la cantidad de unidades compradas en 0. <br>
	 * Se inicializó la cantidad de unidades disponibles con la capacidad. <br>
	 * Se inicializaron los atributos nombre, identificador, precio, fopre y tipo con los valores recibidos por parámetro. <br>
	 * @param pIdentificador Identificador del producto. pIdentificador != null && pIdentificador != "".
	 * @param pNombre Nombre del producto. pNombre != null && pNombre != "".
	 * @param pPrecio Precio del producto. pPrecio >= 50.
	 * @param pFopre Indicador si el producto dona parte de sus ganancias al FOPRE.
	 * @param pTipo Tipo del producto. pTipo pertenece a {Tipo.BEBIDA , Tipo.COMIDA}.
	 */
	public Producto( String pIdentificador, String pNombre, double pPrecio, boolean pFopre, Tipo pTipo )
	{
		identificador = pIdentificador;
		nombre = pNombre;
		precio = pPrecio;
		cantidadUnidadesCompradas = 0;
		cantidadUnidadesDisponibles = CAPACIDAD;
		fopre = pFopre;
		tipo = pTipo;

		// TODO Parte 1 Punto F: Completar el método constructor de la clase.
		// Inicializar los nuevos atributos con la información recibida por parámetro.
		// Inicializar el atributo cantidadUnidadesDisponibles según la nueva especificación.
	}

	// -----------------------------------------------------------------
	// Métodos
	// -----------------------------------------------------------------

	/**
	 * Retorna el identificador del producto.
	 * @return Identificador del producto.
	 */
	public String darIdentificador( )
	{
		return identificador;
	}

	/**
	 * Retorna el nombre del producto.
	 * @return Nombre del producto.
	 */
	public String darNombre( )
	{
		return nombre;
	}

	/**
	 * Retorna el precio del producto.
	 * @return Precio del producto.
	 */
	public double darPrecio( )
	{
		return precio;
	}

	/**
	 * Retorna la cantidad de unidades disponibles del producto.
	 * @return Cantidad de unidades disponibles del producto.
	 */
	public int darCantidadUnidadesDisponibles( )
	{
		return cantidadUnidadesDisponibles;
	}

	/**
	 * Retorna la cantidad de unidades compradas del producto.
	 * @return Cantidad de unidades compradas del producto.
	 */
	public int darCantidadUnidadesCompradas( )
	{
		return cantidadUnidadesCompradas;
	}

	/**
	 * Retorna el tipo del producto.
	 * @return Tipo del producto.
	 */
	//TODO Parte 1 Punto G: Declarar y completar el método darTipo según la documentación dada y el modelo conceptual.
	public Tipo darTipo()
	{
		return tipo;
	}
	/**
	 * Indica si el producto dona parte de sus ganancias al programa FOPRE.
	 * @return Retorna true si el producto está asociado al FOPRE, false en caso contrario.
	 */
	public boolean esFopre( )
	{
		boolean rta = false;
		if(fopre == true);
		{
			rta = true;
		}
		return rta;
	}

	/**
	 * Compra una unidad del producto si hay unidades disponibles. <br>
	 * <b>post: </b> Si habían unidades disponibles, se disminuyó la cantidad de unidades disponibles y aumentó la cantidad de unidades compradas. <br>
	 * @return True si se realizó la compra, false en caso de no haber disponibilidad.
	 */
	public boolean comprar( )
	{
		//TODO Parte 1 Punto H: Modificar el método para que tenga en cuenta la documentación dada y las restricciones.
		boolean rta = false;
		if (cantidadUnidadesDisponibles>0)
		{
			cantidadUnidadesDisponibles--;
			cantidadUnidadesCompradas++;
			rta = true;
		}
		return rta;
	}

	/**
	 * Retorna el valor de la donación de este producto al FOPRE.
	 * @return donación al FOPRE.
	 */
	//TODO Parte 1 Punto I: Declarar y completar el método calcularDonacionFopre según la documentación dada y el modelo conceptual.
	public double calcularDonacionFopre()
	{
		double rta = 0;
		if( fopre == true )
		{
			rta=  precio * PORCENTAJE_FOPRE * cantidadUnidadesCompradas ;
		}
		return rta;
	}
}
