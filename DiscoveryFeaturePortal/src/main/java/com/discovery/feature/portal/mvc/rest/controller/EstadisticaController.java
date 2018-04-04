package com.discovery.feature.portal.mvc.rest.controller;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.discovery.feature.portal.mvc.dao.EstadisticasDao;
import com.discovery.feature.portal.mvc.type.EstadisticaReportType;

@Controller
@RequestMapping("/EstadisticaController")
public class EstadisticaController {

	private static final Logger logger = Logger.getLogger(EstadisticaController.class);

	@Autowired
	private EstadisticasDao estadisticasDao;
	
	
	
	@RequestMapping(value = "/buscarUltima", produces=MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public @ResponseBody EstadisticaReportType findLastStatistics() {
		logger.info("ejecutando metodo buscarTodos");
		EstadisticaReportType type = estadisticasDao.buscarUltimaEstadisticaGeneral();
		return type;
	}


}
