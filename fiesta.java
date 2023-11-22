package modelo.javabean;

public class Fiesta {
	// las CONSTANTES SUELEN SER PUBLICAS, FINAL POR QUE SUELEN TERMINAR LAS ULTIMAS SIEMPRE
	public static  final double PRECIO_BOCATA ; // NO FORMAN PARTE DE LOS OBJETOS
	public static  final double PRECIO_BEBIDA ;
	public static  final double PRECIO_INVITADOS ;
	static{
		PRECIO_BOCATA = 4;
		PRECIO_BEBIDA = 2;
		PRECIO_INVITADOS = 5;
	}
	// ATRIBUTOS DE LA CLASE, COMPARTIDO POR TODOS LOS OBJETOS SON, ESTATICOS
	//---------------------------- 	private int idEmpleado;
	private String tipo;
	private String direccion;
	private int bocadillos;
	private int bebidas;
	private int invitados;
	private String fecha;
	private String hora;
	//2 ----------------------------METODOS source

	public Fiesta(String tipo, String direccion, int bocadillos, int bebidas, int invitados, String fecha,String hora) {
		super();
		this.tipo = tipo;
		this.direccion = direccion;
		this.bocadillos = bocadillos;
		this.bebidas = bebidas;
		this.invitados = invitados;
		this.fecha = fecha;
		this.hora = hora;
	}

	// ----------------------------metodo por defecto, SOURCEE -- GENERATE GETTER AND SETTERS
	public Fiesta() {
		super();
	}

	//GETTER AND SETTER


	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getBocadillos() {
		return bocadillos;
	}

	public void setBocadillos(int bocadillos) {
		this.bocadillos = bocadillos;
	}

	public int getBebidas() {
		return bebidas;
	}

	public void setBebidas(int bebidas) {
		this.bebidas = bebidas;
	}

	public int getInvitados() {
		return invitados;
	}

	public void setInvitados(int invitados) {
		this.invitados = invitados;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}





	// TO STRING
	@Override
	public String toString() {
		return "Fiesta [Tipo = "+ tipo + ", direccion =" + direccion + ", bocadillos =" + bocadillos + ", bebidas= "
				+ bebidas + ", invitados = " + invitados + ", fecha = " + fecha + ", hora = " + hora + "]";}
	//---------------------------- else if 
	public void invitar(){
	//	invitados = invitados + 1;
	//	invitados +=1;
		invitados ++; // asi SUMA 1 -------
		}
	public void invitar(int invitados) {
		//this.invitados = this.invitados + invitados ;
		this.invitados += invitados; //+= para ACUMULAR -------
		}

	public void cancelarInvitacion(){

		invitados --; //  RESTA 1 -------
		}

	public void cancelarInvitacion(int invitados) {
		//this.invitados = this.invitados -= invitados ;
		this.invitados -= invitados; //+= para ACUMULAR -------
		}

public double precioFiesta() {
	return invitados *PRECIO_INVITADOS +
			bebidas * PRECIO_BEBIDA +
			bocadillos *PRECIO_BOCATA;
}




}
