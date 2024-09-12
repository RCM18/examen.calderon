package pe.edu.upeu.syscaso.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.syscaso.dao.Forma_PagoDao;
import pe.edu.upeu.syscaso.entity.Forma_Pago;
import pe.edu.upeu.syscaso.repository.Forma_PagoRepository;
@Component
public class Forma_PagoDaoImpl implements Forma_PagoDao{
	@Autowired
	private Forma_PagoRepository forma_pagoRepository;

	@Override
	public Forma_Pago create(Forma_Pago c) {
		// TODO Auto-generated method stub
		return forma_pagoRepository.save(c);
	}

	@Override
	public Forma_Pago update(Forma_Pago c) {
		// TODO Auto-generated method stub
		return forma_pagoRepository.save(c);	
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		forma_pagoRepository.deleteById(id);

	}

	@Override
	public Optional<Forma_Pago> read(Long id) {
		// TODO Auto-generated method stub
		return forma_pagoRepository.findById(id);
	}

	@Override
	public List<Forma_Pago> readAll() {
		// TODO Auto-generated method stub
		return forma_pagoRepository.findAll();
	}


}
