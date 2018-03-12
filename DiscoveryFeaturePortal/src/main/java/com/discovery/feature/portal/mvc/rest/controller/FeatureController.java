package com.discovery.feature.portal.mvc.rest.controller;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.discovery.feature.portal.mvc.dao.impl.FeatureDaoImpl;
import com.discovery.feature.portal.mvc.type.BuscarFeatureType;
import com.discovery.feature.portal.mvc.type.FeatureType;
import com.google.gson.Gson;

@Controller
@RequestMapping("/Feature")
public class FeatureController {
	
	private static final Logger logger = Logger.getLogger(FeatureController.class);

	@Autowired
	@Qualifier("featureDaoImpl")
	private FeatureDaoImpl featureDao;

	@RequestMapping(value = "/buscarTodos", produces=MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public @ResponseBody String findAll() {
		logger.info("ejecutando metodo buscarTodos");
		List<FeatureType> lista = featureDao.buscarTodosLosFeature();
		String json = new Gson().toJson(lista);
		return json;
	}
	
	@RequestMapping(value = "/buscarPantallas", produces=MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public @ResponseBody String findAllPantallas() {
		logger.info("ejecutando metodo buscarTodos");
		List<BuscarFeatureType> lista = featureDao.buscarFeaturePantalla();
		String json = new Gson().toJson(lista);
		return json;
	}

}
