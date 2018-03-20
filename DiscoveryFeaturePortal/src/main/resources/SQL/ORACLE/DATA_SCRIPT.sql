SCript SQL creacion de datos

TABLE: ANTECEDENTE_TAB
INSERT INTO "WILDFLY"."ANTECEDENTE_TAB" (FEATURE_ID, CONTENIDO) VALUES ('1', 'he navegado al portal de aplicación.')
INSERT INTO "WILDFLY"."ANTECEDENTE_TAB" (FEATURE_ID, CONTENIDO) VALUES ('2', 'he navegado a la pantalla Principal de mi Aplicacion')
INSERT INTO "WILDFLY"."ANTECEDENTE_TAB" (FEATURE_ID, CONTENIDO) VALUES ('3', 'he puesto el puntero sobre la opcion "Configuración"')
INSERT INTO "WILDFLY"."ANTECEDENTE_TAB" (FEATURE_ID, CONTENIDO) VALUES ('4', 'he seleccionado la opción "Habilidades"')

TABLE:TAGS_TAB
INSERT INTO "WILDFLY"."TAGS_TAB" (TAG_ID, NAME) VALUES ('1', '@pantalla')
INSERT INTO "WILDFLY"."TAGS_TAB" (TAG_ID, NAME) VALUES ('2', '@habilidades')
INSERT INTO "WILDFLY"."TAGS_TAB" (TAG_ID, NAME) VALUES ('3', '@BugClaro')
INSERT INTO "WILDFLY"."TAGS_TAB" (TAG_ID, NAME) VALUES ('4', '@GrupoDeTrabajo')
INSERT INTO "WILDFLY"."TAGS_TAB" (TAG_ID, NAME) VALUES ('5', '@BuscarGrupoTrabajo')
INSERT INTO "WILDFLY"."TAGS_TAB" (TAG_ID, NAME) VALUES ('6', '@DeshabilitarGrupo')
INSERT INTO "WILDFLY"."TAGS_TAB" (TAG_ID, NAME) VALUES ('77', '@GrupoTrabajo')


TABLE:ESTATISTICA_REPORT_TAB
INSERT INTO "WILDFLY"."ESTATISTICA_REPORT_TAB" (ESTADISTICA_REPORT_ID, CONTADOR_FEATURE, CONTADOR_FLUJO, CONTADOR_PANTALLA) VALUES ('1', '100', '50', '50')