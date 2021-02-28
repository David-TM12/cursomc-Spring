package com.davidmagalhaes.cursomc.repositories;

import com.davidmagalhaes.cursomc.domain.Endereco;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepositoryImplementation <Endereco, Integer> {
}
