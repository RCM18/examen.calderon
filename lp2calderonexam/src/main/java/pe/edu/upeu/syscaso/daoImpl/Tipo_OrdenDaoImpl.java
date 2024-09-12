package pe.edu.upeu.syscaso.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.syscaso.dao.Tipo_OrdenDao;
import pe.edu.upeu.syscaso.entity.Tipo_Orden;
import pe.edu.upeu.syscaso.repository.Tipo_OrdenRepository;
@Component
public class Tipo_OrdenDaoImpl implements Tipo_OrdenDao{
	@Autowired
	private Tipo_OrdenRepository tipo_ordenRepository;

	@Override
	public Tipo_Orden create(Tipo_Orden c) {
		// TODO Auto-generated method stub
		return tipo_ordenRepository.save(c);
	}

	@Override
	public Tipo_Orden update(Tipo_Orden c) {
		// TODO Auto-generated method stub
		return tipo_ordenRepository.save(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		tipo_ordenRepository.deleteById(id);

	}

	@Override
	public Optional<Tipo_Orden> read(Long id) {
		// TODO Auto-generated method stub
		return tipo_ordenRepository.findById(id);
	}

	@Override
	public List<Tipo_Orden> readAll() {
		// TODO Auto-generated method stub
		return tipo_ordenRepository.findAll();
	}


}
