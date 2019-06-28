package co.com.ceiba.parqueadero.parqueaderod.dominio.e;

public class ExcepcionTipoVehiculo extends RuntimeException {
	
private static final long serialVersionUID = 7894537765603451801L;
	
	public ExcepcionTipoVehiculo(String mensajeTipovehiculoObligatorio) {

		super(mensajeTipovehiculoObligatorio);

	}
}
