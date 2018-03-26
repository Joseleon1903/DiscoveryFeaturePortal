package com.discovery.feature.portal.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/pantallas")
public class PantallasController {
	
	private static final Logger logger = Logger.getLogger(PantallasController.class);

	@RequestMapping(method = RequestMethod.GET)
	public String displayPantallas(HttpServletRequest request) {
		logger.info("redirigiendo pagina pagina pantalla.");
		return  "portal/pantallas/PantallasPage";
	}

	

}
