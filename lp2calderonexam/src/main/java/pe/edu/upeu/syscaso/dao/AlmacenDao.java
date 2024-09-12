package pe.edu.upeu.syscaso.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.syscaso.entity.Almacen;

public interface AlmacenDao {
	Almacen create(Almacen c);
	Almacen update(Almacen c);
	void delete(Long id);
	Optional<Almacen> read(Long id);
	List<Almacen> readAll();

}
