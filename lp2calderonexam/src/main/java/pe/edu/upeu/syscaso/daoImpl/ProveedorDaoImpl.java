package pe.edu.upeu.syscaso.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.syscaso.dao.ProveedorDao;
import pe.edu.upeu.syscaso.entity.Proveedor;
import pe.edu.upeu.syscaso.repository.ProveedorRepository;
@Component
public class ProveedorDaoImpl implements ProveedorDao {
	@Autowired
	private ProveedorRepository proveedorRepository;

	@Override
	public Proveedor create(Proveedor c) {
		// TODO Auto-generated method stub
		return proveedorRepository.save(c);
	}

	@Override
	public Proveedor update(Proveedor c) {
		// TODO Auto-generated method stub
		return proveedorRepository.save(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		proveedorRepository.deleteById(id);

	}

	@Override
	public Optional<Proveedor> read(Long id) {
		// TODO Auto-generated method stub
		return proveedorRepository.findById(id);
	}

	@Override
	public List<Proveedor> readAll() {
		// TODO Auto-generated method stub
		return proveedorRepository.findAll();
	}


}
