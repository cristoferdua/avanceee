package pe.edu.upeu.calcfx.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upeu.calcfx.modelo.CalcTO;

public interface CalcRepository extends JpaRepository<CalcTO,Long>{

        }
