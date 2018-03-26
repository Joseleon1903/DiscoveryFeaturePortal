/*SCRIPT SQL creacion de datos */
/* TABLE:TAGS_TAB  */
INSERT INTO WILDFLY.TAGS_TAB (TAG_ID, NAME) VALUES ('1', '@pantalla');
INSERT INTO WILDFLY.TAGS_TAB (TAG_ID, NAME) VALUES ('2', '@habilidades');
INSERT INTO WILDFLY.TAGS_TAB (TAG_ID, NAME) VALUES ('3', '@BugClaro');
INSERT INTO WILDFLY.TAGS_TAB (TAG_ID, NAME) VALUES ('4', '@GrupoDeTrabajo');
INSERT INTO WILDFLY.TAGS_TAB (TAG_ID, NAME) VALUES ('5', '@BuscarGrupoTrabajo');
INSERT INTO WILDFLY.TAGS_TAB (TAG_ID, NAME) VALUES ('6', '@DeshabilitarGrupo');
INSERT INTO WILDFLY.TAGS_TAB (TAG_ID, NAME) VALUES ('7', '@GrupoTrabajo');


/* TABLE:ESTATISTICA_REPORT_TAB  */
INSERT INTO WILDFLY.ESTATISTICA_REPORT_TAB (ESTADISTICA_REPORT_ID, CONTADOR_FEATURE, CONTADOR_FLUJO, CONTADOR_PANTALLA) VALUES ('1', '100', '50', '50');

/* TABLE: comments_tab */
INSERT INTO WILDFLY.comments_tab (COMMENT_ID, value) VALUES ('1', '# language: es');

/* TABLE: elements_tab */
INSERT INTO WILDFLY.elements_tab (ELEMENT_ID, keyword, type) VALUES ('1', 'Antecedentes', 'background');
INSERT INTO WILDFLY.elements_tab (ELEMENT_ID, keyword, name, type) VALUES ('2', 'Escenario', 'Guardar nueva Plantilla de Materiales exitosamente', 'scenario');
INSERT INTO WILDFLY.elements_tab (ELEMENT_ID, keyword, name, type) VALUES ('3', 'Escenario', 'Guardar Plantilla de Materiales Duplicada', 'scenario');
INSERT INTO WILDFLY.elements_tab (ELEMENT_ID, keyword, name, type) VALUES ('4', 'Escenario', 'Guardar Cambios Plantilla de Materiales', 'scenario');
INSERT INTO WILDFLY.elements_tab (ELEMENT_ID, keyword, name, type) VALUES ('5', 'Escenario', 'Guardar Plantilla de Materiales con sesión Expirada', 'scenario');

/* TABLE:  steps_tab */
INSERT INTO WILDFLY.steps_tab (STEP_ID, keyword, name) VALUES ('1', 'Dado', 'he navegado al portal de aplicación.');
INSERT INTO WILDFLY.steps_tab (STEP_ID, keyword, name) VALUES ('2', 'Y ', 'he navegado a la pantalla Principal de mi Aplicacion');
INSERT INTO WILDFLY.steps_tab (STEP_ID, keyword, name) VALUES ('3', 'Y', 'he puesto el puntero sobre la opcion \\\"Configuración\\\"');
INSERT INTO WILDFLY.steps_tab (STEP_ID, keyword, name) VALUES ('4', 'Y', 'he seleccionado la opción \\\"Plantilla de Materiales\\\"');
INSERT INTO WILDFLY.steps_tab (STEP_ID, keyword, name) VALUES ('5', 'Y', 'he Seleccionado la pestaña \\\"Detalle\\\"');
INSERT INTO WILDFLY.steps_tab (STEP_ID, keyword, name) VALUES ('6', 'Y', 'existen las Plantillas de Materiales:');

/* TABLE:  feature_tab */
INSERT INTO WILDFLY.feature_tab (FEATURE_ID, description, id, keyword, name, uri) VALUES ('1', 'como usuario del sistema, presiono el boton guardar, espero poder guardar los cambios a una Plantilla de Materiales', 'guardar-plantilla-de-materiales', 'Característica', 'Guardar Plantilla de Materiales', 'C:\\\\Users\\\\Jose Eduardo\\\\eclipse-workspace\\\\PruebaLecturaFeature\\\\src\\\\com\\\\java\\\\resource\\\\feature\\\\Boton Guardar Detalle.feature');

/*TABLE: tags_feature */
INSERT INTO WILDFLY.tags_feature (FEATURE_ID, TAG_ID) VALUES ('1', '1');
INSERT INTO WILDFLY.tags_feature (FEATURE_ID, TAG_ID) VALUES ('1', '2');
INSERT INTO WILDFLY.tags_feature (FEATURE_ID, TAG_ID) VALUES ('1', '4');
INSERT INTO WILDFLY.tags_feature (FEATURE_ID, TAG_ID) VALUES ('1', '5');

/*TABLE: comments_feature*/
INSERT INTO WILDFLY.comments_feature (FEATURE_ID, COMMENT_ID) VALUES ('1', '1');


INSERT INTO "WILDFLY"."STEPS_TAB" (STEP_ID, KEYWORD, LINE, NAME) VALUES ('1', 'Y ', '18', 'He llenado los campos con la Informacion:');
INSERT INTO "WILDFLY"."STEPS_TAB" (STEP_ID, KEYWORD, LINE, NAME) VALUES ('2', 'Cuando ', '23', 'Hago click en el boton \"Guardar\"');
INSERT INTO "WILDFLY"."STEPS_TAB" (STEP_ID, KEYWORD, LINE, NAME) VALUES ('3', 'Entonces ', '24', 'Espero que la Informacion en los campos se persista');
INSERT INTO "WILDFLY"."STEPS_TAB" (STEP_ID, KEYWORD, LINE, NAME) VALUES ('4', 'Y ', '25', 'Se muestren los Campos con la Informacion:')


INSERT INTO "WILDFLY"."STEPS_TAB" (STEP_ID, KEYWORD, LINE, NAME) VALUES ('5', 'Y ', '33', 'He llenado los campos con la Informacion:');
INSERT INTO "WILDFLY"."STEPS_TAB" (STEP_ID, KEYWORD, LINE, NAME) VALUES ('6', 'Cuando ', '38', 'Hago click en el boton \"Guardar\"');
INSERT INTO "WILDFLY"."STEPS_TAB" (STEP_ID, KEYWORD, LINE, NAME) VALUES ('7', 'Entonces ', '39', 'Debe desplegarse el mensaje de Error \"Esta Plantilla ya existe\"');

INSERT INTO "WILDFLY"."STEPS_ELEMENT" (ELEMENT_ID, STEP_ID) VALUES ('2', '1');
INSERT INTO "WILDFLY"."STEPS_ELEMENT" (ELEMENT_ID, STEP_ID) VALUES ('2', '2');
INSERT INTO "WILDFLY"."STEPS_ELEMENT" (ELEMENT_ID, STEP_ID) VALUES ('2', '3');
INSERT INTO "WILDFLY"."STEPS_ELEMENT" (ELEMENT_ID, STEP_ID) VALUES ('3', '4');
INSERT INTO "WILDFLY"."STEPS_ELEMENT" (ELEMENT_ID, STEP_ID) VALUES ('3', '5');
INSERT INTO "WILDFLY"."STEPS_ELEMENT" (ELEMENT_ID, STEP_ID) VALUES ('3', '6');
INSERT INTO "WILDFLY"."STEPS_ELEMENT" (ELEMENT_ID, STEP_ID) VALUES ('3', '7');

INSERT INTO "WILDFLY"."ELEMENTS_FEATURE" (FEATURE_ID, ELEMENT_ID) VALUES ('1', '1');
INSERT INTO "WILDFLY"."ELEMENTS_FEATURE" (FEATURE_ID, ELEMENT_ID) VALUES ('1', '2');
INSERT INTO "WILDFLY"."ELEMENTS_FEATURE" (FEATURE_ID, ELEMENT_ID) VALUES ('1', '3');

INSERT INTO "WILDFLY"."STEPS_TAB" (STEP_ID, KEYWORD, LINE, NAME) VALUES ('8', 'Dado', '1', 'he navegado al portal de aplicación.');
INSERT INTO "WILDFLY"."STEPS_TAB" (STEP_ID, KEYWORD, LINE, NAME) VALUES ('9', 'Y ', '2', 'he navegado a la pantalla Principal de mi Aplicacion');
INSERT INTO "WILDFLY"."STEPS_TAB" (STEP_ID, KEYWORD, LINE, NAME) VALUES ('10', 'Y', '3', 'he puesto el puntero sobre la opcion \"Configuración\"');

INSERT INTO "WILDFLY"."STEPS_ELEMENT" (ELEMENT_ID, STEP_ID) VALUES ('1', '8');
INSERT INTO "WILDFLY"."STEPS_ELEMENT" (ELEMENT_ID, STEP_ID) VALUES ('1', '9');
INSERT INTO "WILDFLY"."STEPS_ELEMENT" (ELEMENT_ID, STEP_ID) VALUES ('1', '10');

INSERT INTO "WILDFLY"."TYPE_FEATURE_TAB" (TYPE_FEATURE_ID, TYPE) VALUES ('1', 'Pantalla');
INSERT INTO "WILDFLY"."TYPE_FEATURE_TAB" (TYPE_FEATURE_ID, TYPE) VALUES ('2', 'Flujos');
INSERT INTO "WILDFLY"."TYPE_FEATURE_TAB" (TYPE_FEATURE_ID, TYPE) VALUES ('3', 'Mixto');


commit;