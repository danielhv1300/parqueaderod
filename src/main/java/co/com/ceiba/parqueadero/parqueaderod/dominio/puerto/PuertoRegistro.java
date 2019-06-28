package co.com.ceiba.parqueadero.parqueaderod.dominio.puerto;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.ceiba.parqueadero.parqueaderod.dominio.modelo.Registro;

public interface PuertoRegistro extends JpaRepository<Registro, Long> {
	
	void crear(Registro registro);

	boolean parqueado(Registro registro);

}
