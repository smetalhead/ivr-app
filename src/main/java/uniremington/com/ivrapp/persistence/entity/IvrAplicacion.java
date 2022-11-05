package uniremington.com.ivrapp.persistence.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "apps")
public class IvrAplicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idIvrUrl;
    private String nombreIvr;
    private String urlIvr;
    private String didIvr;
    private String puntoRuteo;
    private String entorno;
    private LocalDateTime fechaCreacion;
    private Character estado;

    public Integer getIdIvrUrl() {
        return idIvrUrl;
    }

    public void setIdIvrUrl(Integer idIvrUrl) {
        this.idIvrUrl = idIvrUrl;
    }

    public String getNombreIvr() {
        return nombreIvr;
    }

    public void setNombreIvr(String nombreIvr) {
        this.nombreIvr = nombreIvr;
    }

    public String getUrlIvr() {
        return urlIvr;
    }

    public void setUrlIvr(String urlIvr) {
        this.urlIvr = urlIvr;
    }

    public String getDidIvr() {
        return didIvr;
    }

    public void setDidIvr(String didIvr) {
        this.didIvr = didIvr;
    }

    public String getPuntoRuteo() {
        return puntoRuteo;
    }

    public void setPuntoRuteo(String puntoRuteo) {
        this.puntoRuteo = puntoRuteo;
    }

    public String getEntorno() {
        return entorno;
    }

    public void setEntorno(String entorno) {
        this.entorno = entorno;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }
}


