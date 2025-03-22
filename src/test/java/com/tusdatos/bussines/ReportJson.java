package com.tusdatos.bussines;

public class ReportJson {

    public static String reportJsonCC111() {
        return """
                {
                    "cidob": {
                        "Alias": " ",
                        "Cargo": "Primer ministro (2010-2014)",
                        "Informacion_completa": "link",
                        "Mandato": "23 mayo 2013 - 7 abril 2016",
                        "Nacimiento": "Ciudad prueba,  marzo 1975",
                        "Pais": "Pais pruebas",
                        "Partido político": "Partido de pruebas (PD)"
                    },
                    "contadores_s": [
                        {
                            "c_dula": "111",
                            "contador": "MIGUEL FERNANDO PEREZ GOMEZ",
                            "fecha_ejecutoria": "2010-06-23T00:00:00.000",
                            "fecha_fin": "2010-12-23T00:00:00.000",
                            "fecha_inicio": "2010-06-23T00:00:00.000",
                            "fecha_registro": "2010-07-14T00:00:00.000",
                            "fecha_resoluci_n": "2009-12-03T00:00:00.000",
                            "meses": "6",
                            "proceso_jur_dico": "1235",
                            "resoluci_n": "372",
                            "tipo": "SUSPENSIÓN"
                        }
                    ],
                    "contaduria": true,
                    "contaduria_pdf": true,
                    "contraloria": true,
                    "contraloria2": true,
                    "dest": "static/img/63776b99-4f26-4f11-b426-dcbbb124dfb8",
                    "dict_hallazgos": {
                        "altos": [
                            {
                                "codigo": "sirna",
                                "descripcion": "El titular del documento consultado aparece con sanciones vigentes en los archivos de Antecedentes Disciplinarios de la Comisión, así como los del Tribunal Disciplinario y los de la Sala Jurisdiccional Disciplinaria en el ejercicio de su profesión como abogado.",
                                "fuente": "sirna",
                                "hallazgo": "SIRNA: Esta sancionado en el Sistema de Información del Registro Nacional de Abogados"
                            }
                        ],
                        "bajos": [
                            {
                                "codigo": "rama_demandante",
                                "descripcion": "El titular consultado ha presentado una demanda contra una persona o entidad, pero la información proporcionada no es suficiente para identificar claramente el tipo de proceso judicial en el que está involucrado el demandado en la Rama Judicial Unificada. Te sugerimos revisar y analizar el detalle de la consulta asociados con el proceso para que puedas identificar y entender mejor la naturaleza del caso.",
                                "fuente": "rama_unificada",
                                "hallazgo": "Rama Unificada: Registra como demandante en un proceso no identificado (Estudiar evidencia)"
                            },
                            {
                                "codigo": "secop2",
                                "descripcion": "El documento registra en la base de datos SECOP 2 (Sistema Electrónico de Contratación Pública), dentro de la cual se encuentran los datos de procesos de contratación con el estado registrados en Colombia compra eficiente.",
                                "fuente": "secop2",
                                "hallazgo": "SECOP 2: Registra en la fuente"
                            },
                            {
                                "codigo": "reputacional_news",
                                "descripcion": "Es posible que el titular de documento se encuentra en al menos una noticia o sitio de internet al consultarlo con base a su nombre completo. Las noticias pueden tener un sentimiento positivo, neutral o negativo. Para mayor información revisar el enlace de la noticia en la sección reputacional.  ",
                                "fuente": "reputacional",
                                "hallazgo": "Noticias Reputacionales"
                            },
                            {
                                "codigo": "reputacional_social",
                                "descripcion": "Es posible que el titular de documento se encuentra en alguna red social como Facebook, LinkedIn, YouTube o Twitter. Para mayor información revisar el enlace de la red social en la sección reputacional. ",
                                "fuente": "reputacional",
                                "hallazgo": "Redes Sociales"
                            }
                        ],
                        "infos": [
                            {
                                "codigo": "rut",
                                "descripcion": "El titular del documento está inscrito en el Registro Único Tributario (RUT).",
                                "fuente": "rut",
                                "hallazgo": "RUT: Inscrito en Registro Único Tributario"
                            },
                            {
                                "codigo": "libretamilitar_info",
                                "descripcion": "Información de la Libreta Militar para personas que tienen su situación definida expedido por el Comando de Reclutamiento y Control de Reservas del Ejército de Colombia.",
                                "fuente": "libretamilitar",
                                "hallazgo": "Libreta Militar: Titular posee libreta militar: Reservista-2da Clase"
                            }
                        ],
                        "medios": [
                            {
                                "codigo": "juzgados_tyba",
                                "descripcion": "El titular consultado se encuentra relacionado ya sea como demandado o demandante, pero la información proporcionada no es suficiente para identificar claramente el tipo de proceso judicial en el que está involucrado en los Juzgados TYBA Te sugerimos revisar y analizar el detalle de la consulta asociados con el proceso para que puedas identificar y entender mejor la naturaleza del caso.",
                                "fuente": "juzgados_tyba",
                                "hallazgo": "Juzgados TYBA: Registra en la Rama Judicial TYBA"
                            }
                        ]
                    },
                    "error": false,
                    "errores": [],
                    "europol": {
                        "birth_date": "Ene 22, 1975 (48 años)",
                        "crimes": [
                            "crimen1",
                            "crimen2"
                        ],
                        "gender": "Hombre",
                        "more_info": "Info",
                        "name": "PEREZ GOMEZ, Miguel Fernando",
                        "nationality": "Prueba",
                        "picture": "link",
                        "state_of_case": "Investigación activa",
                        "status": "Wanted by prueba"
                    },
                    "fecha": "Este reporte fue generado el 4, Oct 2023 a las 10:00AM",
                    "fopep": {
                        "documento": "111",
                        "estado": "",
                        "fecha_inclusion": "2014-12-01",
                        "tipo_documento": "CC"
                    },
                    "garantias_mobiliarias": [
                        {
                            "Acreedor(es)": "Banco s.a.",
                            "Detalles": {
                                "Acreedor": {
                                    "Celular": "",
                                    "Ciudad": "Ciudad de prueba",
                                    "Correo Electrónico 1": "",
                                    "Correo Electrónico 2": "",
                                    "Dirección": "",
                                    "Dígito De Verificación": "8",
                                    "Número de Identificación": "852",
                                    "Porcentaje de participación": "100,00%",
                                    "Razón Social o Nombre": "Banco s.a.",
                                    "Teléfono": "",
                                    "Tipo Identificación": "NIT"
                                },
                                "Bienes garantizados": {},
                                "Bienes inmuebles": {},
                                "Deudor": {
                                    "Bien para uso": "",
                                    "Celular": "",
                                    "Ciudad": "PASTO",
                                    "Correo Electrónico": "",
                                    "Dirección": "",
                                    "Dígito De Verificación": "",
                                    "Género": "MASCULINO",
                                    "Número de Identificación": "111",
                                    "Razón Social o Nombre": "MIGUEL FERNANDO PEREZ GOMEZ",
                                    "Sectores": "Otras actividades de servicios.",
                                    "Tamaño de la empresa": "",
                                    "Teléfono": "",
                                    "Tipo Identificación": "CEDULA DE CIUDADANIA"
                                },
                                "Info general": {
                                    "Fecha Finalización": "19/01/2030 11:59:59 p.m.",
                                    "Fecha de inscripción en el registro especial o de celebración del contrato": "",
                                    "Garantía Inscrita en un Registro Especial": "",
                                    "Monto Máximo de la obligación garantizada": "$ 69.990.000",
                                    "Tipo Garantía": "Garantía Mobiliaria"
                                }
                            },
                            "Fecha de inscripción inicial\\n(dd/mm/aaaa hh:mm:ss)": "23/01/2018 12:49:25 p.m.",
                            "Folio Electrónico": "45484864564211351",
                            "Garante - Deudor": "MIGUEL FERNANDO PEREZ GOMEZ",
                            "Número de Identificación": "111",
                            "Ultima Operación": "Formulario Registral de Inscripción Inicial"
                        }
                    ],
                    "genero": "M",
                    "google": [
                        {
                            "description": "Descripción de prueba",
                            "idioma": "es",
                            "keyword": "MIGUEL FERNANDO PEREZ GOMEZ",
                            "link": "link",
                            "rank": 1,
                            "sentimiento": "neutral",
                            "source": "google",
                            "title": "MIGUEL FERNANDO PEREZ GOMEZ"
                        },
                        {
                            "description": "Descripccion de prueba 2",
                            "idioma": "es",
                            "keyword": "MIGUEL FERNANDO PEREZ GOMEZ",
                            "link": "link",
                            "rank": 3,
                            "sentimiento": "neutral",
                            "source": "google",
                            "title": "titulo de prueba"
                        }
                    ],
                    "hallazgos": "alto",
                    "iadb": [
                        {
                            "_from": "January 10, 2022",
                            "country": "PAIS DE PRUEBA",
                            "entity": "Individual",
                            "grounds": "Fraud",
                            "nationality": "NACIONALIDAD DE PRUEBA",
                            "source": "IDB",
                            "title": "MIGUEL FERNANDO PEREZ GOMEZ",
                            "to": "January 09, 2025"
                        }
                    ],
                    "id": "19272354",
                    "inmov_bog": {
                        "datos_de_entrada_a_patios": [
                            {
                                "clase_vehículo": "10 - MOTOCICLETA",
                                "comparendo": " 192545512",
                                "conductor": "",
                                "dirección": "CARRERA 72 - CALLE 14 ",
                                "fecha_de_entrada": "06/15/2012 10:52",
                                "fecha_de_inmovilización": "06/15/2012 10:52",
                                "imagen_comparendo": "VER COMPARENDO",
                                "infracción": "DESCRIPCIÓN DE LA INFRACCIÓN",
                                "nombre_conductor": "MIGUEL FERNANDO PEREZ GOMEZ",
                                "nro_documento": "111",
                                "nro_inventario": "816217",
                                "patio": "NUMERO PATIO",
                                "placa": "BKA452",
                                "servicio": "OFICIAL",
                                "tipo_documento": "CEDULA DE CIUDADANIA"
                            }
                        ],
                        "datos_de_salida_a_patios": [
                            {
                                "autorizado_salida": "",
                                "día_autorización": "06/16/2012 10:57",
                                "el_vehículo_debe_salir_en_grúa": "NO",
                                "fecha_salida": "SIN INFORMACION",
                                "nombre_autorizado": "FERNANDOROJAS CARPETA ",
                                "nro_autorización": "11238",
                                "nro_documento": "111",
                                "nro_factura": "SIN INFORMACION",
                                "tipo_autorización": "DEFINITIVA ",
                                "tipo_documento": "CEDULA DE CIUDADANIA"
                            }
                        ]
                    },
                    "inpec": {
                        "Establecimiento a cargo": "COMPLEJO CARCELARIO Y PENITENCIARIO CIUDAD DE PRUEBA",
                        "Estado de ingreso": "PRISION DOMICILIARIA",
                        "Género": "MASCULINO",
                        "Identificación": "111",
                        "Nombre": "MIGUEL FERNANDO PEREZ GOMEZ",
                        "Número único (INPEC)": "486524",
                        "Situación jurídica": "CONDENADO"
                    },
                    "interpol": true,
                    "juzgados_tyba": [
                        {
                            "CODIGO PROCESO": "110541468445212351854",
                            "DESPACHO": "SALA PLENA CONSEJO DE PRUEBA",
                            "INFO PROCES0": {
                                "Celular": "",
                                "Ciudad": "PRUEBA, D.C",
                                "Clase Proceso": "PERDIDA DE INVESTIDURA",
                                "Corporación": "CONSEJO DE PRUEBA",
                                "Correo Electrónico Externo": "prueba@consejodeprueba.gov.co",
                                "Código Proceso": "110541468445212351854",
                                "Departamento": "DEPARTAMENTO DE PRUEBA",
                                "Despacho": "sala plena consejo de prueba",
                                "Dirección": "",
                                "Distrito\\\\Circuito": "ÚNICO NACIONAL",
                                "Especialidad": "CONSEJO DE PRUEBA - SALA PLENA",
                                "Fecha Finalización": "",
                                "Fecha Providencia": "16/08/2018",
                                "Fecha Publicación": "28/08/2018",
                                "Número Despacho": "000",
                                "Observaciones Finalización": "",
                                "Subclase Proceso": "EN GENERAL / SIN SUBCLASE",
                                "Teléfono": "",
                                "Tipo Decisión": "ADMITE",
                                "Tipo Proceso": "CONSTITUCIONAL",
                                "actuaciones": [],
                                "sujetos": [
                                    {
                                        "ES EMPLAZADO": "NO",
                                        "FECHA REGISTRO": "28-08-2018",
                                        "NOMBRE(S) Y APELLIDO(S) / RAZÓN SOCIAL": "DEMANDANTE DE PRUEBA",
                                        "NÚMERO DE IDENTIFICACIÓN": "1.485.123.584",
                                        "TIPO DOCUMENTO": "CC",
                                        "TIPO SUJETO": "DEMANDANTE/ACCIONANTE"
                                    }
                                ]
                            }
                        }
                    ],
                    "libretamilitar": {
                        "clase": "Reservista-1ra Clase",
                        "documento": "111",
                        "nombre": "MIGUEL FERNANDO PEREZ GOMEZ",
                        "tipo_documento": "Cédula de Ciudadanía"
                    },
                    "lista_banco_mundial": {
                        "debarred_firms_individuals": [],
                        "others_sanctions": []
                    },
                    "lista_onu": true,
                    "monitoring_date": "Wed, 27 Sep 2023 00:00:00 GMT",
                    "nombre": "MIGUEL FERNANDO PEREZ GOMEZ",
                    "nombre-procuraduria": "MIGUEL FERNANDO PEREZ GOMEZ",
                    "ofac": {
                        "": "Ciudad de prueba, Pais de prueba",
                        "Citizenship:": "",
                        "Date of Birth:": "22 Jen 1975",
                        "First Name:": "Miguel Fernando",
                        "Last Name:": "Perez Gomez",
                        "List:": "Individual",
                        "Nationality:": "Nacionalidad de prueba",
                        "Place of Birth:": "Ciudad de prueba, Pais de prueba",
                        "Program:": "REALES BRITTO",
                        "Remarks:": "",
                        "Title:": "",
                        "Type:": "Individual",
                        "addresses": [
                            {
                                "Address": "",
                                "City": "",
                                "Country": "Pais de prueba",
                                "Postal Code": "",
                                "State/Province": ""
                            }
                        ],
                        "aliases": [
                            {
                                "Category": "weak",
                                "Name": "Migue",
                                "Type": "a.k.a."
                            }
                        ],
                        "docs": [
                            {
                                "Country": "Pais de prueba",
                                "Expire Date": "",
                                "ID#": "AS34512",
                                "Issue Date": "",
                                "Type": "Passport"
                            }
                        ]
                    },
                    "ofac_nombre": {
                        "": "Ciudad de prueba, Pais de prueba",
                        "Citizenship:": "",
                        "Date of Birth:": "22 Jen 1975",
                        "First Name:": "Miguel Fernando",
                        "Last Name:": "Perez Gomez",
                        "List:": "Individual",
                        "Nationality:": "Nacionalidad de prueba",
                        "Place of Birth:": "Ciudad de prueba, Pais de prueba",
                        "Program:": "REALES BRITTO",
                        "Remarks:": "",
                        "Title:": "",
                        "Type:": "Individual",
                        "addresses": [
                            {
                                "Address": "",
                                "City": "",
                                "Country": "Pais de prueba",
                                "Postal Code": "",
                                "State/Province": ""
                            }
                        ],
                        "aliases": [
                            {
                                "Category": "weak",
                                "Name": "Migue",
                                "Type": "a.k.a."
                            }
                        ],
                        "docs": [
                            {
                                "Country": "Pais de prueba",
                                "Expire Date": "",
                                "ID#": "AS34512",
                                "Issue Date": "",
                                "Type": "Passport"
                            }
                        ]
                    },
                    "peps": [
                        {
                            "AKA": "",
                            "CATEGORIA": "Listas restrictivas",
                            "CODIGO": "OFAC_545468515",
                            "DIRECCION": "",
                            "ESTADO": "",
                            "FECHA_FINAL_ROL": "",
                            "FECHA_UPDATE": "Nov  7 2022 12:00AM",
                            "ID": "1082884409",
                            "NACIONALIDAD_PAISDEORIGEN": "",
                            "NOMBRECOMPLETO": "MIGUE",
                            "NOMBRE_DESCRIPTIVO_LISTA": "OFAC Lista Clinton",
                            "NOMBRE_LISTA": "Office of Foreign Assets Control OFAC",
                            "ORIGEN_LISTA": "INTERNACIONAL",
                            "PRIMER_APELLIDO": "",
                            "PRIMER_NOMBRE": "",
                            "RELACIONADO_CON": "",
                            "ROL_O_DESCRIPCION1": "",
                            "ROL_O_DESCRIPCION2": "",
                            "SEGUNDO_APELLIDO": "",
                            "SEGUNDO_NOMBRE": "",
                            "TIPO_ID": "C",
                            "TIPO_LISTA": "OFAC",
                            "TIPO_PERSONA": ""
                        }
                    ],
                    "peps2": true,
                    "peps_denom": [
                        {
                            "AKA": "",
                            "CATEGORIA": "Listas restrictivas",
                            "CODIGO": "OFAC_545468515",
                            "DIRECCION": "",
                            "ESTADO": "",
                            "FECHA_FINAL_ROL": "",
                            "FECHA_UPDATE": "Nov  7 2022 12:00AM",
                            "ID": "1082884409",
                            "NACIONALIDAD_PAISDEORIGEN": "",
                            "NOMBRECOMPLETO": "MIGUE",
                            "NOMBRE_DESCRIPTIVO_LISTA": "OFAC Lista Clinton",
                            "NOMBRE_LISTA": "Office of Foreign Assets Control OFAC",
                            "ORIGEN_LISTA": "INTERNACIONAL",
                            "PRIMER_APELLIDO": "",
                            "PRIMER_NOMBRE": "",
                            "RELACIONADO_CON": "",
                            "ROL_O_DESCRIPCION1": "",
                            "ROL_O_DESCRIPCION2": "",
                            "SEGUNDO_APELLIDO": "",
                            "SEGUNDO_NOMBRE": "",
                            "TIPO_ID": "C",
                            "TIPO_LISTA": "OFAC",
                            "TIPO_PERSONA": ""
                        }
                    ],
                    "personeriabog": [
                        {
                            "nombre": "MIGUEL FERNANDO PEREZ GOMEZ",
                            "sancion": "Sancion de prueba"
                        }
                    ],
                    "policia": true,
                    "procuraduria": [
                        {
                            "datos": [
                                {
                                    "Instancias": [
                                        {
                                            "Autoridad": "PERSONERIA DE PRUEBA - DELEGADA ASUNTOS DISCIPLINARIOS IV",
                                            "Fecha providencia": "30-08-2016",
                                            "Nombre": "PRIMERA",
                                            "fecha efecto Juridicos": "04-04-2017"
                                        }
                                    ],
                                    "SIRI": "SIRI: 1213583",
                                    "Sanciones": [
                                        {
                                            "Clase sanción": "PRINCIPAL",
                                            "Entidad": "INSTITUTO DISTRITAL DE PATRIMONIO CULTURAL- PRUEBA (PRUEBA DC)    PRUEBA DC(PRUEBA DC)",
                                            "Sanción": "DESTITUCION",
                                            "Término": ""
                                        }
                                    ]
                                }
                            ],
                            "delito": "ANTECEDENTES DISCIPLINARIOS"
                        }
                    ],
                    "profesion": {
                        "abogado": {},
                        "abogados_judicial": [],
                        "anec": {},
                        "colpsic": {},
                        "comvezcol": {},
                        "conalpe": {},
                        "conaltel": [],
                        "consejopro": {},
                        "copnia": {
                            "certificate_number": "123585-346875",
                            "certificate_status": "VIGENTE",
                            "certificate_type": "MATRICULA PROFESIONAL",
                            "document_number": "111",
                            "document_type": "CEDULA DE CIUDADANIA",
                            "full_name": "MIGUEL FERNANDO PEREZ GOMEZ",
                            "profession": "INGENIERIA AMBIENTAL",
                            "resolution_date": "7/13/2018",
                            "resolution_number": "328"
                        },
                        "cpae": {},
                        "cpbiol": {},
                        "cpiq": {},
                        "cpnt": {},
                        "cpqcol": {},
                        "jcc": {},
                        "rethus": {}
                    },
                    "proveedores_ficticios": true,
                    "rama": {
                        "armeniajepms": true,
                        "barranquillajepms": true,
                        "bogotajepms": true,
                        "bucaramangajepms": true,
                        "bugajepms": true,
                        "calijepms": true,
                        "cartagenajepms": true,
                        "florenciajepms": true,
                        "ibaguejepms": true,
                        "manizalesjepms": true,
                        "medellinjepms": true,
                        "monteriajepms": true,
                        "neivajepms": true,
                        "palmirajepms": true,
                        "pastojepms": true,
                        "pereirajepms": true,
                        "popayanjepms": true,
                        "quibdojepms": true,
                        "tunjajepms": true,
                        "villavicenciojepms": true
                    },
                    "rama_unificada": [
                        {
                            "actuaciones": [
                                {
                                    "actuacion": "Sentencia de Primera Instancia de Tutela",
                                    "anotacion": "SE CONCEDIO LA TUTELA",
                                    "cant": 1,
                                    "codRegla": "00                              ",
                                    "conDocumentos": false,
                                    "consActuacion": 1,
                                    "fechaActuacion": "2011-03-09T00:00:00",
                                    "fechaFinal": "",
                                    "fechaInicial": "",
                                    "fechaRegistro": "2011-03-09T00:00:00",
                                    "idRegActuacion": 1686213572,
                                    "llaveProceso": "54001546887464684865"
                                }
                            ],
                            "cantFilas": -1,
                            "claseProceso": "Tutelas",
                            "contenidoRadicacion": "",
                            "demandado": [
                                "Demandado de prueba"
                            ],
                            "demandante": [
                                "MIGUEL FERNANDO PEREZ GOMEZ"
                            ],
                            "departamento": "NORTE DE PRUEBA",
                            "despacho": "JUZGADO 004 PENAL MUNICIPAL DE PRUEBA ",
                            "detalle": true,
                            "esPrivado": false,
                            "estado_actuacion": "SI",
                            "fechaConsulta": "2023-09-07T16:47:43",
                            "fechaProceso": "2011-03-03T00:00:00",
                            "fechaUltimaActuacion": "2011-03-09T00:00:00",
                            "idConexion": 398,
                            "idProceso": 1584513,
                            "idRegProceso": 0,
                            "is_demandado": false,
                            "llaveProceso": "54001546887464684865",
                            "ponente": "",
                            "recurso": "Sin Tipo de Recurso",
                            "subclaseProceso": "Sin Subclase de Proceso",
                            "sujetos": [
                                {
                                    "cant": 0,
                                    "esEmplazado": false,
                                    "idRegSujeto": 0,
                                    "identificacion": "",
                                    "nombreRazonSocial": "MIGUEL FERNANDO PEREZ GOMEZ",
                                    "tipoSujeto": "Demandante"
                                }
                            ],
                            "sujetosProcesales": "Demandante: MIGUEL FERNANDO PEREZ GOMEZ | Demandado: Demandado de prueba | Ministerio Publico: MINISTERIO PUBLICO ",
                            "tieneActuaciones": true,
                            "tipoProceso": "Especiales",
                            "ubicacion": "Despacho",
                            "ultimaActualizacion": ""
                        }
                    ],
                    "registraduria_certificado": {
                        "cedula": "111",
                        "estado": "VIGENTE",
                        "fecha_exp": "20 DE DICIEMBRE DE 1999",
                        "lugar_exp": "MEDELLIN - ANTIOQUIA",
                        "nombre": "MIGUEL FERNANDO PEREZ GOMEZ"
                    },
                    "relacionados": [
                        {
                            "empresa": {
                                "razon_social": "EMPRESA DE PRUEBA S.A.S.",
                                "representacion_legal_y_vinculos": [
                                    {
                                        "no identificación": "111",
                                        "nombre": "MIGUEL FERNANDO PEREZ GOMEZ",
                                        "tipo de vinculo": "Representante Legal - Principal"
                                    }
                                ]
                            },
                            "nit": 900539452
                        }
                    ],
                    "reputacional": {
                        "news": [
                            {
                                "description": "Se encontro que aparecio en una noticia de prueba",
                                "idioma": "",
                                "keyword": "MIGUEL FERNANDO PEREZ GOMEZ",
                                "link": "Link",
                                "rank": 2,
                                "sentimiento": "",
                                "source": "google",
                                "title": "Titulo de prueba"
                            }
                        ],
                        "notable": {},
                        "social": [
                            {
                                "description": "Ve el perfil de prueba de MIGUEL FERNANDO PEREZ GOMEZ",
                                "idioma": "",
                                "keyword": "MIGUEL FERNANDO PEREZ GOMEZ",
                                "link": "Link",
                                "rank": 1,
                                "sentimiento": "",
                                "source": "google",
                                "title": "Titulo de prueba"
                            }
                        ]
                    },
                    "rndc": [
                        {
                            "Cedula Conductor": "111",
                            "Consecutivo": "300822183",
                            "Destino": "CIUDAD DE PRUEBA",
                            "Fecha Expedición": "2022/11/05",
                            "Fecha Hora Radicación": "2022/11/05 16:39:02",
                            "Nombre Empresa Transportadora": "EMPRESA TRANSPORTADORA DE PRUEBA",
                            "Nro de Radicado": "135415415",
                            "Origen": "CIUDAD DE PRUEBA DE ORIGEN",
                            "Placa": "WPT523",
                            "Placa Remolque": "S74236",
                            "Tipo Doc": "Manifiesto"
                        }
                    ],
                    "rnmc": {
                        "apelacion": "NO",
                        "articulo": "Art. 35 Comportamientos que afectan las relaciones entre las personas y las autoridades",
                        "departamento": "DEPARTAMENTO DE PRUEBA",
                        "expediente": "25-875-6-1538-123",
                        "expendiente": "25-875-6-1538-123",
                        "fecha": "30/04/2020 05:45:00 p. m.",
                        "formato": "25875114022",
                        "identificación": "123",
                        "infractor": "MIGUEL FERNANDO PEREZ GOMEZ",
                        "municipio": "MUNICIPIO DE PRUEBA"
                    },
                    "rues": true,
                    "ruaf": {
                        "ARL": [
                            {
                                "Actividad Economica": "EMPRESAS DE PRUEBA DE TRANSPORTE URBANO",
                                "Administradora": "Seguros de Vida Ciudad de Prueba",
                                "Estado de Afiliación": "Activa",
                                "Fecha de Afiliación": "2022-05-01",
                                "Fecha de corte": "2022-11-04",
                                "Municipio Labora": "CIUDAD DE PRUEBA"
                            }
                        ],
                        "Basico": [
                            {
                                "Fecha de corte": "2022-11-04",
                                "Número de Identificación": "CC 123",
                                "Primer Apellido": "PEREZ",
                                "Primer Nombre": "MIGUEL",
                                "Segundo Apellido": "GOMEZ",
                                "Segundo Nombre": "FERNANDO",
                                "Sexo": "M"
                            }
                        ],
                        "Caja de compensación": [
                            {
                                "Administradora CF": "CAJA DE PRUEBA DE CIUDAD DE PRUEBA",
                                "Estado de Afiliación": "Inactivo",
                                "Fecha de Afiliación": "2017-07-21",
                                "Fecha de corte": "2022-11-04",
                                "Municipio Labora": "CIUDAD DE PRUEBA",
                                "Tipo de Afiliado": "Trabajador afiliado dependiente",
                                "Tipo de Miembro de la Población Cubierta": "Afiliado"
                            },
                            {
                                "Administradora CF": "CAJA DE PRUEBA DE CIUDAD DE PRUEBA",
                                "Estado de Afiliación": "Inactivo",
                                "Fecha de Afiliación": "2020-03-17",
                                "Fecha de corte": "2022-11-04",
                                "Municipio Labora": "CIUDAD DE PRUEBA",
                                "Tipo de Afiliado": "Trabajador afiliado dependiente",
                                "Tipo de Miembro de la Población Cubierta": "Afiliado"
                            }
                        ],
                        "Cesantías": [
                            {
                                "Cesantías": "No se encontraron afiliaciones",
                                "Fecha de corte": "2022-11-04"
                            }
                        ],
                        "Pensionado": [
                            {
                                "Fecha de corte": "2022-11-04",
                                "Pensionado": "No se encontraron afiliaciones"
                            }
                        ],
                        "Pensiones": [
                            {
                                "Administradora": "COMPAÑIA DE PRUEBA DE CIUDAD DE PRUEBA",
                                "Estado de Afiliación": "Activo cotizante",
                                "Fecha de Afiliación": "2007-03-01",
                                "Fecha de corte": "2022-11-04",
                                "Régimen": "PENSIONES: AHORRO INDIVIDUAL"
                            }
                        ],
                        "Programas de Asistencia Social": [
                            {
                                "Fecha de corte": "2022-11-04",
                                "Programas de Asistencia Social": "No se encontraron afiliaciones"
                            }
                        ],
                        "Salud": [
                            {
                                "Administradora": "ENTIDAD DE PRUEBA DE CIUDAD DE PRUEBA",
                                "Departamento -> Municipio": "CIUDAD DE PRUEBA",
                                "Estado de Afiliación": "Activo",
                                "Fecha Afiliacion": "31/05/2022",
                                "Fecha de corte": "2022-11-04",
                                "Régimen": "Contributivo",
                                "Tipo de Afiliado": "COTIZANTE"
                            }
                        ]
                    },
                    "runt_app": {
                        "exitoso": true,
                        "licencia": {
                            "licencias": [
                                {
                                    "categoria": "A2",
                                    "estado": "ACTIVA",
                                    "fecha_expedicion": "16/07/2021",
                                    "fecha_vencimiento": "16/07/2031",
                                    "numero_licencia": "1082854555",
                                    "sustrato": "LC02045482"
                                },
                                {
                                    "categoria": "B1",
                                    "estado": "ACTIVA",
                                    "fecha_expedicion": "14/03/2018",
                                    "fecha_vencimiento": "14/03/2028",
                                    "numero_licencia": "1082854555",
                                    "sustrato": "LC02045482"
                                }
                            ],
                            "totalLicencias": 2
                        },
                        "multa": {
                            "estado_cancelacion": "NO",
                            "estado_paz_salvo": "SI",
                            "estado_suspension": "",
                            "fecha_cancelacion": "No Reporta",
                            "fecha_suspension": "No Reporta",
                            "numero_comparendos": "0",
                            "numero_paz_salvo": "562454684875"
                        },
                        "nombres": "MIGUEL FERNANDO PEREZ GOMEZ"
                    },
                    "rut": "111-1",
                    "rut_estado": "REGISTRO ACTIVO",
                    "secop2": [
                        {
                            "anno_bpin": "2021",
                            "c_digo_bpin": "2021004689999",
                            "ciudad": "Ciudad Prueba",
                            "codigo_de_categoria_principal": "V1.99999999",
                            "codigo_entidad": "701515999",
                            "codigo_proveedor": "713213999",
                            "condiciones_de_entrega": "Según acuerdo ficticio",
                            "departamento": "Departamento Prueba",
                            "descripcion_del_proceso": "PRESTAR SERVICIOS DE APOYO EN EL DEPARTAMENTO DE PRUEBA",
                            "destino_gasto": "Inversión Prueba",
                            "dias_adicionados": "0",
                            "documento_proveedor": "1234567890",
                            "entidad_centralizada": "Centralizada",
                            "es_grupo": "No",
                            "es_pyme": "No",
                            "espostconflicto": "No",
                            "estado_bpin": "Válido",
                            "estado_contrato": "En prueba",
                            "fecha_de_fin_del_contrato": "2023-05-26T00:00:00.000",
                            "fecha_de_firma": "2022-12-27T17:12:41.000",
                            "fecha_de_inicio_del_contrato": "2022-12-27T00:00:00.000",
                            "fecha_fin_liquidacion": "2023-09-25 04:59:00",
                            "fecha_inicio_liquidacion": "2023-05-25 04:59:00",
                            "g_nero_representante_legal": "Hombre",
                            "habilita_pago_adelantado": "No",
                            "id_contrato": "CO1.PCCNTR.9999999",
                            "identificaci_n_representante_legal": "1234567890",
                            "justificacion_modalidad_de": "ServiciosFicticios",
                            "liquidaci_n": "Si",
                            "localizaci_n": "Ciudad Prueba,  Departamento Prueba ,  Ciudad Prueba",
                            "modalidad_de_contratacion": "Contratación ficticia",
                            "nacionalidad_representante_legal": "Prueba",
                            "nit_entidad": "890299999",
                            "nombre_entidad": "DEPARTAMENTO DE PRUEBA",
                            "nombre_representante_legal": "MIGUEL FERNANDO PEREZ GOMEZ",
                            "objeto_del_contrato": "PRESTAR SERVICIOS DE APOYO EN EL DEPARTAMENTO DE PRUEBA",
                            "obligaci_n_ambiental": "No",
                            "obligaciones_postconsumo": "No",
                            "orden": "Territorial",
                            "origen_de_los_recursos": "Distribuido",
                            "pilares_del_acuerdo": "No aplica",
                            "presupuesto_general_de_la_nacion_pgn": "0",
                            "proceso_de_compra": "CO1.BDOS.9999999",
                            "proveedor_adjudicado": "MIGUEL FERNANDO PEREZ GOMEZ",
                            "puntos_del_acuerdo": "No aplica",
                            "rama": "Ejecutivo",
                            "recursos_de_credito": "0",
                            "recursos_propios": "0",
                            "recursos_propios_alcald_as_gobernaciones_y_resguardos_ind_genas_": "99999999",
                            "referencia_del_contrato": "CO1.PCCNTR.9999999",
                            "reversion": "No",
                            "saldo_cdp": "9999999999",
                            "saldo_vigencia": "9999999999",
                            "sector": "Servicio Ficticio",
                            "sistema_general_de_participaciones": "0",
                            "sistema_general_de_regal_as": "0",
                            "tipo_de_contrato": "Servicio Ficticio",
                            "tipo_de_identificaci_n_representante_legal": "Cédula Ficticia",
                            "tipodocproveedor": "Cédula Ficticia",
                            "ultima_actualizacion": "2023-03-23T00:00:00.000",
                            "urlproceso": {
                                "url": "link"
                            },
                            "valor_amortizado": "0",
                            "valor_de_pago_adelantado": "0",
                            "valor_del_contrato": "99999999",
                            "valor_facturado": "99999999",
                            "valor_pagado": "99999999",
                            "valor_pendiente_de": "0",
                            "valor_pendiente_de_ejecucion": "0",
                            "valor_pendiente_de_pago": "0"
                        }
                    ],
                    "secop": [
                        {
                            "cuantia_proceso": "156526328",
                            "detalle_del_objeto_a_contratar": "Detalle de prueba.",
                            "estado_del_proceso": "Celebrado",
                            "fecha_de_firma_del_contrato": "27/06/2019",
                            "nom_raz_social_contratista": "MIGUEL FERNANDO PEREZ GOMEZ",
                            "nombre_del_represen_legal": "MIGUEL FERNANDO PEREZ GOMEZ",
                            "ruta_proceso_en_secop_i": {
                                "url": "Link"
                            },
                            "tipo_de_contrato": "Prestación de Servicios",
                            "tipo_de_proceso": "Contratación Directa (Ley 1150 de 2007)"
                        }
                    ],
                    "secop_s": [
                        {
                            "descripcion_contrato": "Descripccion de prueba",
                            "documento_contratista": "111",
                            "fecha_de_publicacion": "20-07-2023",
                            "municipio": "CIUDAD PRUEBA - PROVINCIA PRUEBA",
                            "nit_entidad": "999999999",
                            "nivel": "Nivel Ficticio",
                            "nombre_contratista": "MIGUEL FERNANDO PEREZ GOMEZ",
                            "nombre_entidad": "AGENCIA FICTICIA DE ESTRATEGIAS LEGALES (AFEL)",
                            "numero_de_contrato": "456-2023",
                            "numero_de_resolucion": "254-2023",
                            "numero_proceso": "5432",
                            "orden": "Orden Ficticio",
                            "ruta_de_proceso": "Link",
                            "tipo_documento": "Cc",
                            "tipo_incumplimiento": "Incumplimiento Ficticio",
                            "valor_sancion": "$9,999,999"
                        }
                    ],
                    "sena": [
                        {
                            "Certificación": "2023/07/31 12:47:14.0",
                            "Descarga": "Link",
                            "Estado de Certificación": "Firmado",
                            "Estado del Aprendiz": "Certificado",
                            "Programa": "2781092 - COMPLEMENTARIA VIRTUAL EN CERTIFICACION DE PRUEBA  Y  EL REGISTRO PARA LOCALIZACION Y CARACTERIZACION DE LAS PERSONAS CON ASUNTOS DE PRUEBAS",
                            "Registro": "9123002781092CC164168461E",
                            "Tipo": "Nota Especial"
                        }
                    ],
                    "sigep": {
                        "Experiencia Laboral": [
                            {
                                "Rangos de salario por nivel": "Escala"
                            },
                            {
                                "Rangos de salario por nivel": "ASESOR"
                            },
                            {
                                "Rangos de salario por nivel": "ASESOR"
                            }
                        ],
                        "Formación Académica": [
                            "ONCE - NO APLICA - Graduado",
                            "PROFESIONAL - NO APLICA - Graduado"
                        ],
                        "Informacion basica": {
                            "cargo_funcionario": "No Reportado",
                            "dependencia_funcionario": "GRUPO DE VIGILANCIA DE PRUEBA",
                            "institucion_funcionario": "CONTRALORIA GENERAL DE PRUEBA",
                            "nombre_funcionario": "MIGUEL FERNANDO PEREZ GOMEZ"
                        }
                    },
                    "simit": {
                        "acuerdos_pagar": 0,
                        "acuerdos_pagos": [],
                        "cantidad_multas": 0,
                        "cursos": [
                            {
                                "centro_intruccion": "CENTRO DE PRUEBA",
                                "certificado": "26201",
                                "cuidad": "CIUDAD DE PRUEBA",
                                "estado": "No aplicado",
                                "fecha_comparendo": "",
                                "fecha_curso": "09/08/2011",
                                "fecha_reporte": "",
                                "numero_multa": "11001000000541564521"
                            }
                        ],
                        "multas": [],
                        "numero_documento": "111",
                        "paz_salvo": true,
                        "total_acuardos_por_pagar": 0,
                        "total_general": 0,
                        "total_multas": 0,
                        "total_multas_pagar": 0,
                        "total_pagar": 0
                    },
                    "simur": [
                        {
                            "Estado comparendo": "NO NOTIFICADO DEI",
                            "Fecha Infraccion": "09/07/2023",
                            "Intereses": "$000",
                            "No Comparendo": "11001000000039204546878",
                            "Placa": "WRM553",
                            "Saldo": "$522,90000",
                            "Tipo": "COMPARENDO -ELECTRONICO"
                        }
                    ],
                    "sirna": [
                        {
                            "apellidos": "PEREZ GOMEZ",
                            "codigo_de_estado_de_sancion": "9521354811",
                            "estado_de_la_sancion": "Sanción en Ejecución",
                            "fecha_de_finalizacion": "02/02/2024",
                            "fecha_de_inicio": "03/08/2023",
                            "nombres": "MIGUEL FERNANDO",
                            "numero_de_cedula": "111",
                            "tipo_de_sancion": "Suspensión"
                        }
                    ],
                    "sisben": {
                        "Actualizacion Ciudadano": "20/05/2019",
                        "Apellido": "PEREZ GOMEZ",
                        "Departamento": "DEPARTAMENTO DE PRUEBA",
                        "Estado": "Registro válido",
                        "Ficha": "1145312382135141",
                        "Grupo": "C3",
                        "Municipio": "MUNICIPIO DE PRUEBA",
                        "Nombre": "MIGUEL FERNANDO",
                        "Tipo de grupo": "Vulnerable"
                    },
                    "sisconmp": {
                        "Apellidos": "PEREZ GOMEZ",
                        "Clase": "",
                        "DCInstitucionEducativa": 3,
                        "DIVCODIGSede": "5000145412",
                        "DIVNOMBRSede": "CIUDAD DE PRUEBA",
                        "DescripcionClase": "",
                        "EntidadCertificadora": "MEN",
                        "FechaExpedicion": "2022/11/01",
                        "FechaExpedicionLicencia": "2017/09/15",
                        "FechaVencimiento": "2023/11/01",
                        "FechaVencimientoLicencia": "2029/09/13",
                        "Inactivo": "No",
                        "InstitucionEducativa": "CEA AUTO PRUEBA",
                        "NDI": "79765445485",
                        "NIDSede": "75182",
                        "NITInstitucionEducativa": 401235454,
                        "NombreArchivo": "",
                        "NombreCapacitacion": "ACTUALIZACION",
                        "NombreSede": "CEA AUTO PRUEBA",
                        "Nombres": "MIGUEL FERNANDO",
                        "NumeroLicencia": "4684874545",
                        "TDI": "CC",
                        "TipoCapacitacion": "CURSO BASICO",
                        "TipoVehiculo": "",
                        "ValorNumericoClase": 0
                    },
                    "transitobog": true
                }
                """;
    }
}
