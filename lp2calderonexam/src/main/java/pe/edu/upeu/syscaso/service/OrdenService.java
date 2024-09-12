package pe.edu.upeu.syscaso.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.syscaso.entity.Orden;
public interface OrdenService {
	
	Orden create(Orden c);
	Orden update(Orden c);
	void delete(Long id);
	Optional<Orden> read(Long id);
	List<Orden> readAll();

}
