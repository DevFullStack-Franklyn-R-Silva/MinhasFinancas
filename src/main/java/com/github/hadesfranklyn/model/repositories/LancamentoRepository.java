package com.github.hadesfranklyn.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.hadesfranklyn.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}
