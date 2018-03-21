package com.discovery.feature.portal.mapping;

import java.util.ArrayList;
import java.util.List;

import com.discovery.feature.portal.mvc.entity.FeatureTab;
import com.discovery.feature.portal.mvc.type.BuscarDetalleFeatureType;
import com.discovery.feature.portal.mvc.type.BuscarFeatureType;

public final class FeatureMapping {

	private FeatureMapping() {}

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
//		type.getAntecedentes().addAll(new AntecedenteType().toListType(Entity.getAntecedentes()));
//		type.getEscenarios().addAll(new EscenarioType().toListType(Entity.getEscenarios()));
		return type;
	}

}
