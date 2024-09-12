package pe.edu.upeu.syscaso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upeu.syscaso.entity.Orden;

public interface OrdenRepository extends JpaRepository<Orden, Long> {

}
