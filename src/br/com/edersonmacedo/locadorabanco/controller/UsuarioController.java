package br.com.edersonmacedo.locadorabanco.controller;

import br.com.edersonmacedo.locadorabanco.model.Usuario;
import br.com.edersonmacedo.locadorabanco.model.persistencia.UsuarioDAOImplements;
import br.com.edersonmacedo.locadorabanco.model.persistencia.dao.UsuarioDAO;

public class UsuarioController {
    public int salvar(Usuario u){
            
            UsuarioDAO dao = new UsuarioDAOImplements();
            return dao.salve(u);
    }
    
}
