package com.discovery.feature.portal.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/home")
public class HomePageController {

	private static final Logger logger = Logger.getLogger(HomePageController.class);

	@RequestMapping(method = RequestMethod.GET)
	public String displayHome(HttpServletRequest request) {
		logger.info("redirigiendo pagina home.");
		return  "portal/dashboard/dashboardPage";
	}


}
