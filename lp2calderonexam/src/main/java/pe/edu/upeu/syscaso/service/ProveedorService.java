package pe.edu.upeu.syscaso.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.syscaso.entity.Proveedor;
public interface ProveedorService {
	Proveedor create(Proveedor c);
	Proveedor update(Proveedor c);
	void delete(Long id);
	Optional<Proveedor> read(Long id);
	List<Proveedor> readAll();

}
