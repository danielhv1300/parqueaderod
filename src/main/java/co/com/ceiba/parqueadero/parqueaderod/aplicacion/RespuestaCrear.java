package co.com.ceiba.parqueadero.parqueaderod.aplicacion;

public class RespuestaCrear {

	private String placa;
	private String tipoVehiculo;
	private String resultadoOperacion;

	public RespuestaCrear(String placa, String tipoVehiculo, String resultadoOperacion) {
		super();
		this.placa = placa;
		this.tipoVehiculo = tipoVehiculo;
		this.resultadoOperacion = resultadoOperacion;
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

	public String getResultadoOperacion() {
		return resultadoOperacion;
	}

	public void setResultadoOperacion(String resultadoOperacion) {
		this.resultadoOperacion = resultadoOperacion;
	}

}
