package co.com.ceiba.parqueadero.parqueaderod.dominio.servicios;

import co.com.ceiba.parqueadero.parqueaderod.dominio.modelo.Registro;
import co.com.ceiba.parqueadero.parqueaderod.dominio.puerto.PuertoRegistro;


public class ServicioRegistro {
	
	private static final String MENSAJE_RESTRICCION_PLACA_LETRA = "A";
	private static final String MENSAJE_DIAS_RESTRICCION = "El vehiculo no está autorizado a ingresar, solo puede hacer uso del parquedero los días domingo y lunes.";
	private static final String MENSAJE_RESTRICCION_CUPO = "El parquedero no cuenta con cupos disponibles para el vehiculo.";
	private static final String MENSAJE_EN_PARQUEADERO = "El vehiculo aparace registrado actualmente en el parqueadero.";
	private static final String MENSAJE_NO_EXISTE="El vehiculo no se encuentra parqueado actualmente.";
	
	private static final int CAPACIDAD_CARROS=20;
	private static final int CAPACIDAD_MOTOS=10;
	
	private PuertoRegistro puertoRegistro;
	
	public ServicioRegistro (PuertoRegistro puertoRegistro) {
		this.puertoRegistro = puertoRegistro;
	}
	
	public void SetIngreso(Registro registro) {
		validacionPrevia(registro);
		this.puertoRegistro.crear(registro);
		
	}

	private void validacionPrevia(Registro registro) {
	boolean parqueado = puertoRegistro.parqueado(registro);
		
	}

	
	
}
