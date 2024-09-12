package pe.edu.upeu.syscaso.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import pe.edu.upeu.syscaso.dao.Tipo_OrdenDao;
import pe.edu.upeu.syscaso.entity.Tipo_Orden;
import pe.edu.upeu.syscaso.service.Tipo_OrdenService;

public class Tipo_OrdenServiceImpl implements Tipo_OrdenService{
	@Autowired
	private Tipo_OrdenDao dao;
	
	@Override
	public Tipo_Orden create(Tipo_Orden c) {
		// TODO Auto-generated method stub
		return dao.create(c);
	}

	@Override
	public Tipo_Orden update(Tipo_Orden c) {
		// TODO Auto-generated method stub
		return dao.update(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);

	}

	@Override
	public Optional<Tipo_Orden> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Tipo_Orden> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
