package com.dx.admindx;

public class CViaje {

    private String idViaje ;

    private String folioViaje ;

    private String tracking ;

    private String idCliente  ;

    private String idRuta  ;

    private String nombreRuta  ;

    private String secuencia  ;

    private String id  ;

    private String idDetalleViaje  ;

    private String idDetalleViajeDestino  ;

    private String idOperador  ;

    private String idOperador2  ;

    private String idRemolquePrincipal  ;

    private String latitud  ;

    private String longitud  ;

    private String claveUnidad  ;

    private String nombreOrigen  ;

    private String nombreCortoOrigen  ;

    private String fechaVentanaOrigen  ;

    private String fechaEntradaOrigen  ;

    private String fechaSalidaOrigen  ;

    private String nombreDestino  ;

    private String nombreCortoDestino  ;

    private String fechaVentanaDestino  ;

    private String fechaEntradaDestino  ;

    private String fechaSalidaDestino  ;

    private String carga  ;

    private String descripcionCarga  ;

    private String tipoMovimiento  ;

    private String descripcionTipoMovimiento  ;

    private String estatus  ;

    private String nombreEstatus  ;

    private String idUnidad  ;

    private String nombreUnidad  ;

    private String nombreOperador  ;

    private String etaCalculado  ;

    private String factura  ;

    private String peso  ;

    private String bultos  ;

    private String porcLlenado  ;

    private String sello ;

    public CViaje(String idViaje, String folioViaje, String tracking, String idCliente, String idRuta, String nombreRuta, String secuencia, String id, String idDetalleViaje, String idDetalleViajeDestino, String idOperador, String idOperador2, String idRemolquePrincipal, String latitud, String longitud, String claveUnidad, String nombreOrigen, String nombreCortoOrigen, String fechaVentanaOrigen, String fechaEntradaOrigen, String fechaSalidaOrigen, String nombreDestino, String nombreCortoDestino, String fechaVentanaDestino, String fechaEntradaDestino, String fechaSalidaDestino, String carga, String descripcionCarga, String tipoMovimiento, String descripcionTipoMovimiento, String estatus, String nombreEstatus, String idUnidad, String nombreUnidad, String nombreOperador, String etaCalculado, String factura, String peso, String bultos, String porcLlenado, String sello) {
        this.idViaje = idViaje;
        this.folioViaje = folioViaje;
        this.tracking = tracking;
        this.idCliente = idCliente;
        this.idRuta = idRuta;
        this.nombreRuta = nombreRuta;
        this.secuencia = secuencia;
        this.id = id;
        this.idDetalleViaje = idDetalleViaje;
        this.idDetalleViajeDestino = idDetalleViajeDestino;
        this.idOperador = idOperador;
        this.idOperador2 = idOperador2;
        this.idRemolquePrincipal = idRemolquePrincipal;
        this.latitud = latitud;
        this.longitud = longitud;
        this.claveUnidad = claveUnidad;
        this.nombreOrigen = nombreOrigen;
        this.nombreCortoOrigen = nombreCortoOrigen;
        this.fechaVentanaOrigen = fechaVentanaOrigen;
        this.fechaEntradaOrigen = fechaEntradaOrigen;
        this.fechaSalidaOrigen = fechaSalidaOrigen;
        this.nombreDestino = nombreDestino;
        this.nombreCortoDestino = nombreCortoDestino;
        this.fechaVentanaDestino = fechaVentanaDestino;
        this.fechaEntradaDestino = fechaEntradaDestino;
        this.fechaSalidaDestino = fechaSalidaDestino;
        this.carga = carga;
        this.descripcionCarga = descripcionCarga;
        this.tipoMovimiento = tipoMovimiento;
        this.descripcionTipoMovimiento = descripcionTipoMovimiento;
        this.estatus = estatus;
        this.nombreEstatus = nombreEstatus;
        this.idUnidad = idUnidad;
        this.nombreUnidad = nombreUnidad;
        this.nombreOperador = nombreOperador;
        this.etaCalculado = etaCalculado;
        this.factura = factura;
        this.peso = peso;
        this.bultos = bultos;
        this.porcLlenado = porcLlenado;
        this.sello = sello;
    }

    public String getIdViaje() {
        return idViaje;
    }

    public String getFolioViaje() {
        return folioViaje;
    }

    public String getTracking() {
        return tracking;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public String getIdRuta() {
        return idRuta;
    }

    public String getNombreRuta() {
        return nombreRuta;
    }

    public String getSecuencia() {
        return secuencia;
    }

    public String getId() {
        return id;
    }

    public String getIdDetalleViaje() {
        return idDetalleViaje;
    }

    public String getIdDetalleViajeDestino() {
        return idDetalleViajeDestino;
    }

    public String getIdOperador() {
        return idOperador;
    }

    public String getIdOperador2() {
        return idOperador2;
    }

    public String getIdRemolquePrincipal() {
        return idRemolquePrincipal;
    }

    public String getLatitud() {
        return latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public String getClaveUnidad() {
        return claveUnidad;
    }

    public String getNombreOrigen() {
        return nombreOrigen;
    }

    public String getNombreCortoOrigen() {
        return nombreCortoOrigen;
    }

    public String getFechaVentanaOrigen() {
        return fechaVentanaOrigen;
    }

    public String getFechaEntradaOrigen() {
        return fechaEntradaOrigen;
    }

    public String getFechaSalidaOrigen() {
        return fechaSalidaOrigen;
    }

    public String getNombreDestino() {
        return nombreDestino;
    }

    public String getNombreCortoDestino() {
        return nombreCortoDestino;
    }

    public String getFechaVentanaDestino() {
        return fechaVentanaDestino;
    }

    public String getFechaEntradaDestino() {
        return fechaEntradaDestino;
    }

    public String getFechaSalidaDestino() {
        return fechaSalidaDestino;
    }

    public String getCarga() {
        return carga;
    }

    public String getDescripcionCarga() {
        return descripcionCarga;
    }

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public String getDescripcionTipoMovimiento() {
        return descripcionTipoMovimiento;
    }

    public String getEstatus() {
        return estatus;
    }

    public String getNombreEstatus() {
        return nombreEstatus;
    }

    public String getIdUnidad() {
        return idUnidad;
    }

    public String getNombreUnidad() {
        return nombreUnidad;
    }

    public String getNombreOperador() {
        return nombreOperador;
    }

    public String getEtaCalculado() {
        return etaCalculado;
    }

    public String getFactura() {
        return factura;
    }

    public String getPeso() {
        return peso;
    }

    public String getBultos() {
        return bultos;
    }

    public String getPorcLlenado() {
        return porcLlenado;
    }

    public String getSello() {
        return sello;
    }
}
