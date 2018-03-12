package com.discovery.feature.portal.mapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.discovery.feature.portal.mvc.entity.FeatureTab;
import com.discovery.feature.portal.mvc.type.BuscarFeatureType;

public class FeatureMapping {

	public FeatureMapping() {
		// TODO Auto-generated constructor stub
	}

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

}
