package com.fstail.fstail_admin.enums;

import java.util.List;

public enum TipoServicio {
    HTML_BASICO(
        "html","basico", 150, 15,
        List.of(
            EstadoProyecto.RECEPCION,
            EstadoProyecto.BRIEFING,
            EstadoProyecto.DISEÑO_UI,
            EstadoProyecto.ARMANDO_HTML,
            EstadoProyecto.ARMANDO_CSS,
            EstadoProyecto.ARMANDO_JS,
            EstadoProyecto.TESTEANDO,
            EstadoProyecto.EN_PRODUCCION
        )
    ),
    
    HTML_ESTANDAR(
        "html","estandar", 150, 15,
        List.of(
            EstadoProyecto.RECEPCION,
            EstadoProyecto.BRIEFING,
            EstadoProyecto.DISEÑO_UI,
            EstadoProyecto.ARMANDO_HTML,
            EstadoProyecto.ARMANDO_CSS,
            EstadoProyecto.ARMANDO_JS,
            EstadoProyecto.TESTEANDO,
            EstadoProyecto.EN_PRODUCCION
        )
    ),
    
    HTML_PROFECIONAL(
        "html","profecional", 150, 15,
        List.of(
            EstadoProyecto.RECEPCION,
            EstadoProyecto.BRIEFING,
            EstadoProyecto.DISEÑO_UI,
            EstadoProyecto.ARMANDO_HTML,
            EstadoProyecto.ARMANDO_CSS,
            EstadoProyecto.ARMANDO_JS,
            EstadoProyecto.TESTEANDO,
            EstadoProyecto.EN_PRODUCCION
        )
    ),
    
    REACT_BASICO(
        "reactJS","basico", 150, 15,
        List.of(
            EstadoProyecto.RECEPCION,
            EstadoProyecto.BRIEFING,
            EstadoProyecto.DISEÑO_UI,
            EstadoProyecto.REACT_SETUP,
            EstadoProyecto.REACT_COMPONENTS,
            EstadoProyecto.TESTEANDO,
            EstadoProyecto.EN_PRODUCCION
        )
    ),
    
    REACT_ESTANDAR(
        "reactJS","estandar", 150, 15,
        List.of(
            EstadoProyecto.RECEPCION,
            EstadoProyecto.BRIEFING,
            EstadoProyecto.DISEÑO_UI,
            EstadoProyecto.REACT_SETUP,
            EstadoProyecto.REACT_COMPONENTS,
            EstadoProyecto.TESTEANDO,
            EstadoProyecto.EN_PRODUCCION
        )
    ),

    
    REACT_PRO(
        "reactJS","profecional", 150, 15,
        List.of(
            EstadoProyecto.RECEPCION,
            EstadoProyecto.BRIEFING,
            EstadoProyecto.DISEÑO_UI,
            EstadoProyecto.ARMANDO_HTML,
            EstadoProyecto.ARMANDO_CSS,
            EstadoProyecto.ARMANDO_JS,
            EstadoProyecto.TESTEANDO,
            EstadoProyecto.DEPLOY,
            EstadoProyecto.EN_PRODUCCION
        )
    ),
    
    FULL_BASICO(
        "full_stack","basico", 150, 15,
        List.of(
            EstadoProyecto.RECEPCION,
            EstadoProyecto.BRIEFING,
            EstadoProyecto.BD_MODELADO,
            EstadoProyecto.API_DESING,
            EstadoProyecto.CREANDO_ENDPOINT,
            EstadoProyecto.REACT_SETUP,
            EstadoProyecto.REACT_COMPONENTS,
            EstadoProyecto.INTEGRACION_FRONT_BACK,
            EstadoProyecto.TESTEANDO,
            EstadoProyecto.EN_PRODUCCION
        )
    ),
    
    FULL_ESTANDAR(
        "full_stack","estandar", 150, 15,
        List.of(
            EstadoProyecto.RECEPCION,
            EstadoProyecto.BRIEFING,
            EstadoProyecto.BD_MODELADO,
            EstadoProyecto.API_DESING,
            EstadoProyecto.CREANDO_ENDPOINT,
            EstadoProyecto.REACT_SETUP,
            EstadoProyecto.REACT_COMPONENTS,
            EstadoProyecto.INTEGRACION_FRONT_BACK,
            EstadoProyecto.TESTEANDO,
            EstadoProyecto.EN_PRODUCCION
        )
    ),

    FULL_PRO(
        "full_stack","profecional", 150, 15,
        List.of(
            EstadoProyecto.RECEPCION,
            EstadoProyecto.BRIEFING,
            EstadoProyecto.BD_MODELADO,
            EstadoProyecto.API_DESING,
            EstadoProyecto.CREANDO_ENDPOINT,
            EstadoProyecto.REACT_SETUP,
            EstadoProyecto.REACT_COMPONENTS,
            EstadoProyecto.INTEGRACION_FRONT_BACK,
            EstadoProyecto.TESTEANDO,
            EstadoProyecto.EN_PRODUCCION
        )
    );

    private final String stack;
    private final String nivel;
    private final int precio;
    private final int dias;
    private final List<EstadoProyecto> worflow;
   

    private TipoServicio(String stack, String nivel, int precio, int dias, List<EstadoProyecto> worflow) {
        this.stack = stack;
        this.nivel = nivel;
        this.precio = precio;
        this.dias = dias;
        this.worflow = worflow;
    }

    //getters
    
   
    public String getStack() {
        return stack;
    }


    public String getNivel() {
        return nivel;
    }


    public int getPrecio() {
        return precio;
    }


    public int getDias() {
        return dias;
    }


    public List<EstadoProyecto> getWorflow() {
        return worflow;
    }

}
