package co.com.ceiba.parqueadero.parqueaderod.dominio.modelo;

import co.com.ceiba.parqueadero.parqueaderod.dominio.e.ExcepcionTipoVehiculo;
import co.com.ceiba.parqueadero.parqueaderod.dominio.excepsiones.ExcepcionPlaca;

public class ValidarArgumento {
	
	private ValidarArgumento() {	
	}

	public static void validarPlacaNoNull(String placa, String mensajePlacaObligatoria) {

		if (placa == null) {
            throw new ExcepcionPlaca(mensajePlacaObligatoria);
	}

	}

	public static void validarTipoVehiculoNoNull(String tipoVehiculo, String mensajeTipovehiculoObligatorio) {
		
		if (tipoVehiculo == null) {
            throw new ExcepcionTipoVehiculo(mensajeTipovehiculoObligatorio);
		
	}
	}
}