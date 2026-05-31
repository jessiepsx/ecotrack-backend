package br.com.fiap.Ecotrack.repository;

import br.com.fiap.Ecotrack.model.AcaoSustentavel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcaoRepository extends JpaRepository<AcaoSustentavel, Long> {
}
