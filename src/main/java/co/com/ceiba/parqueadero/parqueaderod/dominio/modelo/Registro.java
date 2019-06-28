package co.com.ceiba.parqueadero.parqueaderod.dominio.modelo;

import java.util.Date;

public class Registro {
	
	private static final String MENSAJE_PLACA_OBLIGATORIA = "La placa es un dato obligatorio.";
    private static final String MENSAJE_TIPOVEHICULO_OBLIGATORIO = "El campo tipo vehiculo es obligatorio.";
    private static final String MENSAJE_VALOR_INCORRECTO_TIPOVEHICULO = "El campo tipo vehiculo no tiene valor (%S) valido.";
    private static final String MENSAJE_CILINDRAJE_OBLIGATORIO = "El campo cilindraje es requerido.";
    private static final String MENSAJE_VALOR_INCORRECTO_CILINDRAJE = "El campo cilindraje debe ser numerico.";

    private static final String VALOR_TIPOVEHICULO_CARRO = "CARRO";
    private static final String VALOR_TIPOVEHICULO_MOTO = "MOTOCICLETA";


	private int id;
	private String placa;
	private String tipoVehiculo;
	private int cilindraje;
	private Date fechaingreso;
	private Date fechasalida;
	private long value;
	
	public Registro(int id, String placa, String tipoVehiculo, int cilindraje, Date fechaingreso, Date fechasalida,
			long value) {
		ValidarArgumento.validarPlacaNoNull(placa, MENSAJE_PLACA_OBLIGATORIA);
		ValidarArgumento.validarTipoVehiculoNoNull(tipoVehiculo, MENSAJE_TIPOVEHICULO_OBLIGATORIO);
		this.id = id;
		this.placa = placa;
		this.tipoVehiculo = tipoVehiculo;
		this.cilindraje = cilindraje;
		this.fechaingreso = fechaingreso;
		this.fechasalida = fechasalida;
		this.value = value;	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public int getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}

	public Date getFechaingreso() {
		return fechaingreso;
	}

	public void setFechaingreso(Date fechaingreso) {
		this.fechaingreso = fechaingreso;
	}

	public Date getFechasalida() {
		return fechasalida;
	}

	public void setFechasalida(Date fechasalida) {
		this.fechasalida = fechasalida;
	}

	public long getValue() {
		return value;
	}

	public void setValue(long value) {
		this.value = value;
	}


}
