package com.discovery.feature.portal.mapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.discovery.feature.portal.mvc.entity.FeatureTab;
import com.discovery.feature.portal.mvc.type.AntecedenteType;
import com.discovery.feature.portal.mvc.type.BuscarDetalleFeatureType;
import com.discovery.feature.portal.mvc.type.BuscarFeatureType;
import com.discovery.feature.portal.mvc.type.EscenarioType;

public final class FeatureMapping {

	private FeatureMapping() {}

	public static List<BuscarFeatureType> toListBuscarBuscarFeatureType(List<FeatureTab> listadoEntity) {
		List<BuscarFeatureType> listaSalida = new ArrayList<>();
		BuscarFeatureType outType = null;
		for (FeatureTab index : listadoEntity) {
			outType = new BuscarFeatureType();
			outType.setFeatureId(index.getFeatureId());
			outType.setIdioma(index.getIdioma());
			outType.setCaracteristica(index.getCaracteristica());
			outType.setFechaUltimaActualizacion(new Date());
			outType.setNombre(index.getNombre());
			listaSalida.add(outType);
		}
		return listaSalida;
	}
	
	public static BuscarDetalleFeatureType toBuscarDetalleFeatureType(FeatureTab Entity) {
		BuscarDetalleFeatureType type = new BuscarDetalleFeatureType();
		type.getAntecedentes().addAll(new AntecedenteType().toListType(Entity.getAntecedentes()));
		type.getEscenarios().addAll(new EscenarioType().toListType(Entity.getEscenarios()));
		return type;
	}

}
