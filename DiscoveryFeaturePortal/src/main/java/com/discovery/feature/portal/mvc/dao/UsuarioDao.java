package com.discovery.feature.portal.mvc.dao;

import org.springframework.stereotype.Component;

import com.discovery.feature.portal.mvc.entity.Usuario;

@Component
public interface UsuarioDao {

	Usuario findByUsers(long id);

}
