package com.discovery.feature.portal.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/flujos")
public class FlujosController {

	private static final Logger logger = Logger.getLogger(FlujosController.class);

	@RequestMapping(method = RequestMethod.GET)
	public String displayPantallas(HttpServletRequest request) {
		logger.info("redirigiendo pagina pagina pantalla.");
		return  "portal/flujos/FlujosPage";
	}

	

}
