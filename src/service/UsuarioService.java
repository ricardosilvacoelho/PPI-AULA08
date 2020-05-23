package service;

import model.Usuario;

import java.sql.SQLException;

import dao.UsuarioDAO;

public class UsuarioService {
	
	public boolean validar(Usuario usuario) throws SQLException{
		UsuarioDAO dao = new UsuarioDAO();
		return dao.validar(usuario);
	}
}