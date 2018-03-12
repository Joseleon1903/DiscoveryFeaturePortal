package com.discovery.feature.portal.mvc.rest.controller;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.discovery.feature.portal.mvc.dao.impl.EstadisticasDaoImpl;
import com.discovery.feature.portal.mvc.type.EstadisticaReportType;

@Controller
@RequestMapping("/EstadisticaController")
public class EstadisticaController {

	private static final Logger logger = Logger.getLogger(EstadisticaController.class);

	@Autowired
	@Qualifier("estadisticasDaoImpl")
	private EstadisticasDaoImpl estatisticasDao;
	
	@RequestMapping(value = "/buscarUltima", produces=MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public @ResponseBody EstadisticaReportType findAll() {
		logger.info("ejecutando metodo buscarTodos");
		EstadisticaReportType type = estatisticasDao.buscarUltimaEstadisticaGeneral();
		return type;
	}


}
