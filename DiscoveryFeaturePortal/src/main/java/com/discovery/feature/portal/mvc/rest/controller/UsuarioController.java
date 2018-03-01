package com.discovery.feature.portal.mvc.rest.controller;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.discovery.feature.portal.mvc.dao.impl.UsuarioDaoImpl;
import com.discovery.feature.portal.mvc.entity.Usuario;

@Controller
@RequestMapping("/User")
public class UsuarioController {

	private static final Logger logger = Logger.getLogger(UsuarioController.class);
	
	@Autowired
	@Qualifier("usuarioDaoImpl")
	private UsuarioDaoImpl usuarioDAO;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Usuario findOne(@PathVariable("id") Long id) {
		logger.info("Id "+ id);
		Usuario user = usuarioDAO.findByUsers(id);
		return user;
	}

}
