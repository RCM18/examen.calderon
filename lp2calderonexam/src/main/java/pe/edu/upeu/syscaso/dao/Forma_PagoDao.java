package pe.edu.upeu.syscaso.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.syscaso.entity.Forma_Pago;

public interface Forma_PagoDao {
	Forma_Pago create(Forma_Pago c);
	Forma_Pago update(Forma_Pago c);
	void delete(Long id);
	Optional<Forma_Pago> read(Long id);
	List<Forma_Pago> readAll();

}
