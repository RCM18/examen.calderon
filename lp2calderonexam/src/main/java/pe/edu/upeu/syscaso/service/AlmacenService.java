package pe.edu.upeu.syscaso.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.syscaso.entity.Almacen;
public interface AlmacenService {
	Almacen create(Almacen c);
	Almacen update(Almacen c);
	void delete(Long id);
	Optional<Almacen> read(Long id);
	List<Almacen> readAll();

}
