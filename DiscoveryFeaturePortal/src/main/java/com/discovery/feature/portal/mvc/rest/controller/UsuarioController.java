package com.discovery.feature.portal.mvc.rest.controller;

import org.jboss.logging.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.discovery.feature.portal.mvc.type.UsuarioType;

@Controller
@RequestMapping("/User")
public class UsuarioController {

	private static final Logger logger = Logger.getLogger(UsuarioController.class);
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public UsuarioType findOne(@PathVariable("id") Long id) {
		logger.info("Id "+ id);
		return new UsuarioType("Mario");
	}

}
