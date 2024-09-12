package pe.edu.upeu.syscaso.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import pe.edu.upeu.syscaso.dao.Forma_PagoDao;
import pe.edu.upeu.syscaso.entity.Forma_Pago;
import pe.edu.upeu.syscaso.service.Forma_PagoService;

public class Forma_PagoServiceImpl implements Forma_PagoService{
	@Autowired
	private Forma_PagoDao dao;
	
	@Override
	public Forma_Pago create(Forma_Pago c) {
		// TODO Auto-generated method stub
		return dao.create(c);
	}

	@Override
	public Forma_Pago update(Forma_Pago c) {
		// TODO Auto-generated method stub
		return dao.update(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);

	}

	@Override
	public Optional<Forma_Pago> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Forma_Pago> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
