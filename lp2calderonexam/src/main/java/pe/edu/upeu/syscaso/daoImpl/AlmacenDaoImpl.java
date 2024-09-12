package pe.edu.upeu.syscaso.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.syscaso.dao.AlmacenDao;
import pe.edu.upeu.syscaso.entity.Almacen;
import pe.edu.upeu.syscaso.repository.AlmacenRepository;

@Component
public class AlmacenDaoImpl implements AlmacenDao{
	@Autowired
	private AlmacenRepository almacenRepository;

	@Override
	public Almacen create(Almacen c) {
		// TODO Auto-generated method stub
		return almacenRepository.save(c);
	}

	@Override
	public Almacen update(Almacen c) {
		// TODO Auto-generated method stub
		return almacenRepository.save(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		almacenRepository.deleteById(id);

	}

	@Override
	public Optional<Almacen> read(Long id) {
		// TODO Auto-generated method stub
		return almacenRepository.findById(id);
	}

	@Override
	public List<Almacen> readAll() {
		// TODO Auto-generated method stub
		return almacenRepository.findAll();
	}


}
