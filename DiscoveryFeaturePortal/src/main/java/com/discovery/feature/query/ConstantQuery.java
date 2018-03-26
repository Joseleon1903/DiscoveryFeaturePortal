package com.discovery.feature.query;

public class ConstantQuery {
	
	
	public static  String BUSCAR_DET_FEAT_PANTALLA_ANTECEDENTES ="select ft.FEATURE_ID, ft.NAME, st.KEYWORD, st.NAME AS DESCRIPCION from FEATURE_TAB ft \r\n" + 
			"join ELEMENTS_FEATURE el ON ft.FEATURE_ID = el.FEATURE_ID\r\n" + 
			"join ELEMENTS_TAB elm ON el.ELEMENT_ID = elm.ELEMENT_ID\r\n" + 
			"join STEPS_ELEMENT stle ON el.ELEMENT_ID = stle.ELEMENT_ID\r\n" + 
			"join STEPS_TAB st ON stle.STEP_ID = st.STEP_ID\r\n" + 
			"where ft.FEATURE_ID = ? AND elm.KEYWORD = ? ";
	
	public static  String BUSCAR_DET_FEAT_PANTALLA_ESCENARIOS ="select ft.FEATURE_ID, elm.NAME, st.KEYWORD,el.ELEMENT_ID, st.NAME AS DESCRIPCION from FEATURE_TAB ft \r\n" + 
			"join ELEMENTS_FEATURE el ON ft.FEATURE_ID = el.FEATURE_ID\r\n" + 
			"join ELEMENTS_TAB elm ON el.ELEMENT_ID = elm.ELEMENT_ID\r\n" + 
			"join STEPS_ELEMENT stle ON el.ELEMENT_ID = stle.ELEMENT_ID\r\n" + 
			"join STEPS_TAB st ON stle.STEP_ID = st.STEP_ID\r\n" + 
			"where ft.FEATURE_ID = ? AND elm.KEYWORD = ? " ;

}
