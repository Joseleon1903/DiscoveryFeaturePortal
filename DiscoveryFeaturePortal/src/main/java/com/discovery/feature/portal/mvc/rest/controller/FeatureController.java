package com.discovery.feature.portal.mvc.rest.controller;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.discovery.feature.portal.mvc.dao.impl.FeatureDaoImpl;
import com.discovery.feature.portal.mvc.type.BuscarDetalleFeatureType;
import com.discovery.feature.portal.mvc.type.FeatureType;
import com.discovery.feature.portal.mvc.type.ResponsePaginationType;
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
	
	@RequestMapping(value = "/buscarPantallas/{pagesize}/{pagenumber}", produces=MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public @ResponseBody String findAllPantallas(@PathVariable("pagesize") Integer pagesize, @PathVariable("pagenumber") Integer pageNumber) {
		logger.info("ejecutando metodo findAllPantallas");
		ResponsePaginationType response = featureDao.buscarFeaturePantalla(pagesize,pageNumber);
		String json = new Gson().toJson(response);
		return json;
	}
	
	@RequestMapping(value = "/buscarDetallefeature/{featureId}", produces=MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public @ResponseBody String findDetailsFeature(@PathVariable("featureId") Long featureId) {
		logger.info("ejecutando metodo findDetailsFeature");
		BuscarDetalleFeatureType detalle = featureDao.buscarDetalleFeature(featureId);
		String json = new Gson().toJson(detalle);
		return json;
	}

	@RequestMapping(value = "/buscarfeature/{pagesize}/{pagenumber}/{testo}", produces=MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public @ResponseBody String findDetailsFeature(@PathVariable("pagesize") Integer pagesize, @PathVariable("pagenumber") Integer pageNumber, @PathVariable("testo") String testo) {
		logger.info("ejecutando metodo findDetailsFeature");
		List<BuscarFeatureType> lista = featureDao.buscarFeatureParametrizado(pagesize,pageNumber,testo);
		String json = new Gson().toJson(lista);
		return json;
	}


}
