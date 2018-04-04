package com.discovery.feature.portal.mvc.rest.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.discovery.feature.portal.mvc.type.FeatureBuilder;
import com.google.gson.Gson;

@Controller
@RequestMapping("/Mock")
public class MockController {
	
	String feaurePantallaJson = "[{\"comments\":[{\"line\":1,\"value\":\"# language: es\"}],\"line\":3,\"elements\":[{\"line\":6,\"name\":\"\",\"description\":\"\",\"type\":\"background\",\"keyword\":\"Antecedentes\",\"steps\":[{\"line\":7,\"name\":\"que me he loggeado satisfactoriamente\",\"keyword\":\"Dado \"},{\"line\":8,\"name\":\"he navegado a la pantalla \\\"Grupos de Trabajo\\\"\",\"keyword\":\"Y \"},{\"line\":9,\"name\":\"he activado la pestaña \\\"Usuarios\\\"\",\"keyword\":\"Y \"}]},{\"line\":12,\"name\":\"Agregar Usuario satisfactoriamente\",\"description\":\"\",\"id\":\"agregar-usuario-al-grupo-de-trabajo-actual;agregar-usuario-satisfactoriamente\",\"type\":\"scenario\",\"keyword\":\"Escenario\",\"steps\":[{\"line\":13,\"name\":\"Selecione un Usuario del dropdown \\\"Usuarios\\\"\",\"keyword\":\"Cuando \"},{\"line\":14,\"name\":\"Se encuentre seleccionado un grupo de trabajo\",\"keyword\":\"Y \"},{\"line\":15,\"name\":\"Presione el botón \\\"Agregar\\\"\",\"keyword\":\"Y \"},{\"line\":16,\"name\":\"Debe agregarse el Usuario seleccionado al listado de Usuarios del grupo seleccionado\",\"keyword\":\"Entonces \"}],\"tags\":[{\"line\":11,\"name\":\"@SunnyDay\"},{\"line\":11,\"name\":\"@BeforeAgregarSupervisor\"},{\"line\":11,\"name\":\"@AfterAgregarSupervisor\"}]},{\"line\":19,\"name\":\"Agregar Usuario sin seleccionar grupo de trabajo\",\"description\":\"\",\"id\":\"agregar-usuario-al-grupo-de-trabajo-actual;agregar-usuario-sin-seleccionar-grupo-de-trabajo\",\"type\":\"scenario\",\"keyword\":\"Escenario\",\"steps\":[{\"line\":20,\"name\":\"Selecione un Usuario del dropdown \\\"Usuarios\\\"\",\"keyword\":\"Cuando \"},{\"line\":21,\"name\":\"No se encuentre seleccionado un grupo de trabajo\",\"keyword\":\"Y \"},{\"line\":22,\"name\":\"Presione el botón \\\"Agregar\\\"\",\"keyword\":\"Y \"},{\"line\":23,\"name\":\"Debe mostrarse un mensaje indicando que se debe seleccionar un grupo de trabajo\",\"keyword\":\"Entonces \"}],\"tags\":[{\"line\":18,\"name\":\"@SunnyDay\"},{\"line\":18,\"name\":\"@BeforeAgregarSupervisor\"},{\"line\":18,\"name\":\"@AfterAgregarSupervisor\"}]},{\"line\":26,\"name\":\"Agregar Usuario sin seleccionar supervisor del listado\",\"description\":\"\",\"id\":\"agregar-usuario-al-grupo-de-trabajo-actual;agregar-usuario-sin-seleccionar-supervisor-del-listado\",\"type\":\"scenario\",\"keyword\":\"Escenario\",\"steps\":[{\"line\":27,\"name\":\"Se encuentre seleccionado un grupo de trabajo\",\"keyword\":\"Cuando \"},{\"line\":28,\"name\":\"No se selecione un Usuario del dropdown \\\"Usuarios\\\"\",\"keyword\":\"Y \"},{\"line\":29,\"name\":\"Presione el botón \\\"Agregar\\\"\",\"keyword\":\"Y \"},{\"line\":30,\"name\":\"Debe mostrarse un mensaje indicando que se debe seleccionar un Usuario\",\"keyword\":\"Entonces \"}],\"tags\":[{\"line\":25,\"name\":\"@SunnyDay\"},{\"line\":25,\"name\":\"@BeforeAgregarSupervisor\"},{\"line\":25,\"name\":\"@AfterAgregarSupervisor\"}]}],\"name\":\"Agregar Usuario al grupo de trabajo actual\",\"description\":\"Agregar Usuario al grupo de trabajo actual\",\"id\":\"agregar-usuario-al-grupo-de-trabajo-actual\",\"keyword\":\"Característica\",\"uri\":\"C:\\\\Users\\\\jleon\\\\eclipse-workspace\\\\PruebaLecturaFeature\\\\src\\\\com\\\\java\\\\resource\\\\feature\\\\AgregarUsuarioAlGrupoActual.feature\",\"tags\":[{\"line\":2,\"name\":\"@ActividadGrupoTrabajo\"},{\"line\":2,\"name\":\"@GrupoTrabajo\"},{\"line\":2,\"name\":\"@pantalla\"},{\"line\":2,\"name\":\"@BugClaro\"}]}]\r\n";
	String featureFlujoJson ="[{\"comments\":[{\"line\":1,\"value\":\"# language: es\"}],\"line\":4,\"elements\":[{\"examples\":[{\"line\":14,\"name\":\"Escenarios\",\"description\":\"\",\"id\":\"enviar-respuesta-activacion-stb;enviar-respuesta-activacion-stb-satisfactoriamente;escenarios\",\"rows\":[{\"cells\":[\"mensaje\",\"orden\",\"flujo\",\"proceso\",\"actividad\",\"actividadid\"],\"line\":15,\"id\":\"enviar-respuesta-activacion-stb;enviar-respuesta-activacion-stb-satisfactoriamente;escenarios;1\"},{\"cells\":[\"agregarstbdth.xml\",\"14247774\",\"EAID_C52F4272_FCCE_4e4d_B0D5_7447484F5CB4\",\"Activa STB/Smartcard\",\"Envia respuesta de activacion STB\",\"EAID_CF0D44FA_EAE8_4bfc_8ACC_AF8557BA7B2E\"],\"line\":16,\"id\":\"enviar-respuesta-activacion-stb;enviar-respuesta-activacion-stb-satisfactoriamente;escenarios;2\"}],\"keyword\":\"Ejemplos\"}],\"line\":8,\"name\":\"Enviar respuesta activacion STB satisfactoriamente\",\"description\":\"\",\"id\":\"enviar-respuesta-activacion-stb;enviar-respuesta-activacion-stb-satisfactoriamente\",\"type\":\"scenario_outline\",\"keyword\":\"Esquema del escenario\",\"steps\":[{\"line\":9,\"name\":\"He eliminado todo proceso \\\"\\u003cproceso\\u003e\\\" key \\\"\\u003cflujo\\u003e\\\" con orden id interno de orden de trabajo \\\"\\u003corden\\u003e\\\"\",\"keyword\":\"Dado \"},{\"line\":10,\"name\":\"He iniciado el proceso \\\"\\u003cproceso\\u003e\\\" key \\\"\\u003cflujo\\u003e\\\" con orden de trabajo \\\"\\u003cmensaje\\u003e\\\" e inicializado la variable \\\"workOrderId\\\" con id interno orden de trabajo\",\"keyword\":\"Y \"},{\"line\":11,\"name\":\"He activado la actividad \\\"\\u003cactividad\\u003e\\\" id \\\"\\u003cactividadid\\u003e\\\" para id interno de orden \\\"\\u003corden\\u003e\\\"\",\"keyword\":\"Cuando \"},{\"line\":12,\"name\":\"Debe lanzar exception \\\"NotImplementedException\\\"\",\"keyword\":\"Entonces \"}],\"tags\":[{\"line\":7,\"name\":\"@SunnyDay\"}]}],\"name\":\"Enviar respuesta activacion STB\",\"description\":\"Tarea enviar el resultado de activacion de STB/SmartCard a movil\",\"id\":\"enviar-respuesta-activacion-stb\",\"keyword\":\"Característica\",\"uri\":\"C:\\\\Users\\\\jleon\\\\eclipse-workspace\\\\PruebaLecturaFeature\\\\src\\\\com\\\\java\\\\resource\\\\feature\\\\EnviarRespuestaActivacionSTB.feature\",\"tags\":[{\"line\":2,\"name\":\"@flujo\"},{\"line\":2,\"name\":\"@ActivacionSTBSmartCard\"}]}]\r\n";

	@RequestMapping(value = "/test",produces=MediaType.APPLICATION_JSON_VALUE,  method = RequestMethod.GET)
	public @ResponseBody String findOne() {
		String json = new Gson().toJson(feaurePantallaJson);
		Object objecto =  new Gson().fromJson(feaurePantallaJson, Object.class);
		return new Gson().toJson(objecto);
	}
	
	@RequestMapping(value = "/testPantalla",produces=MediaType.APPLICATION_JSON_VALUE,  method = RequestMethod.GET)
	public @ResponseBody String testPantalla() {
		FeatureBuilder[] objecto =  new Gson().fromJson(feaurePantallaJson, FeatureBuilder[].class);
		return new Gson().toJson(objecto);
	}
	
	@RequestMapping(value = "/testFlujo",produces=MediaType.APPLICATION_JSON_VALUE,  method = RequestMethod.GET)
	public @ResponseBody String testFlujo() {
		String json = new Gson().toJson(featureFlujoJson);
		Object objecto =  new Gson().fromJson(featureFlujoJson, Object.class);
		return new Gson().toJson(objecto);
	}
	
	@RequestMapping(value = "/testFlujoObject",produces=MediaType.APPLICATION_JSON_VALUE,  method = RequestMethod.GET)
	public @ResponseBody String testFlujoObject() {
		FeatureBuilder[] objecto =  new Gson().fromJson(featureFlujoJson, FeatureBuilder[].class);
		return new Gson().toJson(objecto);
	}
	
}
