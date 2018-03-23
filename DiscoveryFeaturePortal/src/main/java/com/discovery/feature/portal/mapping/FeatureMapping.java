package com.discovery.feature.portal.mapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.discovery.feature.portal.mvc.entity.FeatureTab;
import com.discovery.feature.portal.mvc.type.BuscarDetalleFeatureType;
import com.discovery.feature.portal.mvc.type.BuscarFeatureType;
import com.discovery.feature.portal.mvc.type.EscenarioType;

public final class FeatureMapping {
	

	private FeatureMapping() {
	}

	public static List<BuscarFeatureType> toListBuscarFeatureType(List<FeatureTab> listadoEntity) {
		List<BuscarFeatureType> listaSalida = new ArrayList<>();
		BuscarFeatureType outType = null;
		for (FeatureTab index : listadoEntity) {
			outType = new BuscarFeatureType();
			outType.setFeatureId(index.getFeatureId());
			outType.setIdioma(GenericMapping.buscarIdiomaEnComments(index.getComments()));
			outType.setCaracteristica(index.getDescription());
			outType.setNombre(index.getName());
			outType.setTags(index.getComments().toString());
			listaSalida.add(outType);
		}
		return listaSalida;
	}

	public static BuscarDetalleFeatureType toBuscarDetalleFeatureType(FeatureTab Entity) {
		BuscarDetalleFeatureType type = new BuscarDetalleFeatureType();
		// type.getAntecedentes().addAll(new
		// AntecedenteType().toListType(Entity.getAntecedentes()));
		// type.getEscenarios().addAll(new
		// EscenarioType().toListType(Entity.getEscenarios()));
		return type;
	}

	public static List<EscenarioType> castEscenario(HashMap<String, List<String>> mapList) {
		List<EscenarioType> escenarios = new ArrayList<>();
		EscenarioType exc = null;
		for (Map.Entry<String, List<String>> entry : mapList.entrySet()) {
			exc = new EscenarioType();
			exc.setName(entry.getKey());
			exc.getSteps().addAll(entry.getValue());
			escenarios.add(exc);
		}
		return escenarios;
	}

}
