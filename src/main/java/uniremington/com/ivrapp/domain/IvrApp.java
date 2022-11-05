package uniremington.com.ivrapp.domain;

import java.time.LocalDateTime;

public class IvrApp {
    private Integer idAppUrl;
    private String nameApp;
    private String appUrl;
    private String phone;
    private String routingPoint;
    private String environment;
    private LocalDateTime date;

    private Character state;

    public Integer getIdAppUrl() {
        return idAppUrl;
    }

    public void setIdAppUrl(Integer idAppUrl) {
        this.idAppUrl = idAppUrl;
    }

    public String getNameApp() {
        return nameApp;
    }

    public void setNameApp(String nameApp) {
        this.nameApp = nameApp;
    }

    public String getAppUrl() {
        return appUrl;
    }

    public void setAppUrl(String appUrl) {
        this.appUrl = appUrl;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRoutingPoint() {
        return routingPoint;
    }

    public void setRoutingPoint(String routingPoint) {
        this.routingPoint = routingPoint;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Character getState() {
        return state;
    }

    public void setState(Character state) {
        this.state = state;
    }
}
