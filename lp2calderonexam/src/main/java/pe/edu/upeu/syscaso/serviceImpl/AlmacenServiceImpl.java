package pe.edu.upeu.syscaso.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import pe.edu.upeu.syscaso.dao.AlmacenDao;
import pe.edu.upeu.syscaso.entity.Almacen;
import pe.edu.upeu.syscaso.service.AlmacenService;

public class AlmacenServiceImpl implements AlmacenService{
	@Autowired
	private AlmacenDao dao;
	
	@Override
	public Almacen create(Almacen c) {
		// TODO Auto-generated method stub
		return dao.create(c);
	}

	@Override
	public Almacen update(Almacen c) {
		// TODO Auto-generated method stub
		return dao.update(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);

	}

	@Override
	public Optional<Almacen> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Almacen> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
