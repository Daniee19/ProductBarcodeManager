
package com.codigodebarra.dao;

import com.codigodebarra.model.Usuario;

public interface UsuarioDao extends Dao<Usuario>{
   public boolean evaluarUsuario(String nombreUsuario, char[] contrasenia);
}
