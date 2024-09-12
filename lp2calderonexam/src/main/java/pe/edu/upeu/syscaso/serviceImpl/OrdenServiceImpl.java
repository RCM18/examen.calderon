package pe.edu.upeu.syscaso.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.syscaso.dao.OrdenDao;
import pe.edu.upeu.syscaso.entity.Orden;
import pe.edu.upeu.syscaso.service.OrdenService;

@Service
public class OrdenServiceImpl implements OrdenService{
	@Autowired
	private OrdenDao dao;
	
	@Override
	public Orden create(Orden c) {
		// TODO Auto-generated method stub
		return dao.create(c);
	}

	@Override
	public Orden update(Orden c) {
		// TODO Auto-generated method stub
		return dao.update(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);

	}

	@Override
	public Optional<Orden> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Orden> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
