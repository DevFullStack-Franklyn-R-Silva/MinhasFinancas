package com.github.hadesfranklyn.services;

import java.util.List;

import com.github.hadesfranklyn.model.entity.Lancamento;
import com.github.hadesfranklyn.model.entity.enums.StatusLancamento;

public interface LancamentoService {

	Lancamento salvar(Lancamento lancamento);

	Lancamento atualizar(Lancamento lancamento);

	void deletar(Lancamento lancamento);

	List<Lancamento> buscar(Lancamento lancamentoFiltro);

	void atualizarStatus(Lancamento lancamento, StatusLancamento status);

	void validar(Lancamento lancamento);
}
