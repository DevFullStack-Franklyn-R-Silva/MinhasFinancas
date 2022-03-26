package com.github.hadesfranklyn.services;

import com.github.hadesfranklyn.model.entity.Usuario;

public interface UsuarioService {

	Usuario autenticar(String email, String senha);

	Usuario salvarUsuario(Usuario usuario);

	void validarEmail(String email);
}
