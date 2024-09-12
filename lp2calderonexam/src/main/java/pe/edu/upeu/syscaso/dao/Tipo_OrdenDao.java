package pe.edu.upeu.syscaso.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.syscaso.entity.Tipo_Orden;

public interface Tipo_OrdenDao {
	Tipo_Orden create(Tipo_Orden c);
	Tipo_Orden update(Tipo_Orden c);
	void delete(Long id);
	Optional<Tipo_Orden> read(Long id);
	List<Tipo_Orden> readAll();

}
