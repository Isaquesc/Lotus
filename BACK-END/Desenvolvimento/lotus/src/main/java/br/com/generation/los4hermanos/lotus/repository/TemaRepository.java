package br.com.generation.los4hermanos.lotus.repository;

import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.generation.los4hermanos.lotus.model.Tema;

public interface TemaRepository extends JpaRepository<Tema, Long> {
    public List<Tema> findAllByNomeContainingIgnoreCase(String tema);
    // public Optional<Tema> findAllByPalavraChaveContainingIgnoreCase(String palavraChave);

}
