package br.com.fiap.Ecotrack.repository;

import br.com.fiap.Ecotrack.model.DicaESG;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DicaRepository extends JpaRepository<DicaESG, Long> {
}
