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
	
	public static  String BUSCAR_DET_FEAT_FLUJO ="select st.KEYWORD, st.NAME from FEATURE_TAB ft \r\n" + 
			"join ELEMENTS_FEATURE el ON ft.FEATURE_ID = el.FEATURE_ID\r\n" + 
			"join ELEMENTS_TAB elm ON el.ELEMENT_ID = elm.ELEMENT_ID\r\n" + 
			"join STEPS_ELEMENT stle ON el.ELEMENT_ID = stle.ELEMENT_ID  \r\n" + 
			"join STEPS_TAB st ON stle.STEP_ID = st.STEP_ID\r\n" + 
			"where ft.FEATURE_ID = ?" ;
	
	public static String BUSCAR_DET_OBJETOS_FLUJO = "select cl.CELL_ID, cl.CONTENT from FEATURE_TAB ft \r\n" + 
			"join ELEMENTS_FEATURE el ON ft.FEATURE_ID = el.FEATURE_ID\r\n" + 
			"join ELEMENTS_TAB elm ON el.ELEMENT_ID = elm.ELEMENT_ID\r\n" + 
			"join EXAMPLE_ELEMENT exel ON el.ELEMENT_ID = exel.ELEMENT_ID\r\n" + 
			"join Example_tab ex ON exel.EXAMPLE_ID = ex.EXAMPLE_ID\r\n" + 
			"join Rows_TAB rw ON ex.EXAMPLE_ID = rw.EXAMPLE_ID\r\n" + 
			"join CELLS_TAB cl on rw.row_id = cl.Row_id\r\n" + 
			"where ft.FEATURE_ID = ? order by cl.CELL_ID ASC";

}
