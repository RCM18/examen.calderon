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
import pe.edu.upeu.syscaso.entity.Tipo_Orden;
import pe.edu.upeu.syscaso.service.Tipo_OrdenService;

@RestController
@RequestMapping("/api/alumnos")
public class Tipo_OrdenController {
	@Autowired
	private Tipo_OrdenService tipo_ordenService;
	
	@GetMapping
	public ResponseEntity<List<Tipo_Orden>> readAll(){
		try {
			List<Tipo_Orden> tipos = tipo_ordenService.readAll();
			if(tipos.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(tipos, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PostMapping
	public ResponseEntity<Tipo_Orden> crear(@Valid @RequestBody Tipo_Orden cat){
		try {
			Tipo_Orden c = tipo_ordenService.create(cat);
			return new ResponseEntity<>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<Tipo_Orden> getAlumnoId(@PathVariable("id") Long id){
		try {
			Tipo_Orden c = tipo_ordenService.read(id).get();
			return new ResponseEntity<>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Tipo_Orden> delAlumno(@PathVariable("id") Long id){
		try {
			tipo_ordenService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> updateAlumno(@PathVariable("id") Long id, @Valid @RequestBody Tipo_Orden cat){

			Optional<Tipo_Orden> c = tipo_ordenService.read(id);
			if(c.isEmpty()) {
				return new ResponseEntity<>(tipo_ordenService.update(cat), HttpStatus.OK);
			}else {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}		
		
	}
}
