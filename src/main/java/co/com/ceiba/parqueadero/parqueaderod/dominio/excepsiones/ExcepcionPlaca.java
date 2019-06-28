package co.com.ceiba.parqueadero.parqueaderod.dominio.excepsiones;

public class ExcepcionPlaca extends RuntimeException {
	
	private static final long serialVersionUID = 7894537765603451801L;
	
	public ExcepcionPlaca(String mensajePlacaObligatoria) {

		super(mensajePlacaObligatoria);
	}

}
