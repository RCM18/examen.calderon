package pe.edu.upeu.syscaso.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import pe.edu.upeu.syscaso.entity.Forma_Pago;
import pe.edu.upeu.syscaso.service.Forma_PagoService;

@RestController
@RequestMapping("/api/formas")
public class Forma_PagoController {
	@Autowired
	private Forma_PagoService forma_pagoService;
	
	@GetMapping
	public ResponseEntity<List<Forma_Pago>> readAll(){
		try {
			List<Forma_Pago> formas = forma_pagoService.readAll();
			if(formas.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(formas, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PostMapping
	public ResponseEntity<Forma_Pago> crear(@Valid @RequestBody Forma_Pago cat){
		try {
			Forma_Pago c = forma_pagoService.create(cat);
			return new ResponseEntity<>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<Forma_Pago> getAlumnoId(@PathVariable("id") Long id){
		try {
			Forma_Pago c = forma_pagoService.read(id).get();
			return new ResponseEntity<>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Forma_Pago> delAlumno(@PathVariable("id") Long id){
		try {
			forma_pagoService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> updateAlumno(@PathVariable("id") Long id, @Valid @RequestBody Forma_Pago cat){

			Optional<Forma_Pago> c = forma_pagoService.read(id);
			if(c.isEmpty()) {
				return new ResponseEntity<>(forma_pagoService.update(cat), HttpStatus.OK);
			}else {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}		
		
	}

}
