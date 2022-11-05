package uniremington.com.ivrapp.persistence.mapper;


import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import uniremington.com.ivrapp.domain.IvrApp;
import uniremington.com.ivrapp.persistence.entity.IvrAplicacion;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IAppIvrMapper {
    @Mappings({
            @Mapping(source = "idIvrUrl", target = "idAppUrl"),
            @Mapping(source = "nombreIvr", target = "nameApp"),
            @Mapping(source = "urlIvr", target = "appUrl"),
            @Mapping(source = "didIvr", target = "phone"),
            @Mapping(source = "puntoRuteo", target = "routingPoint"),
            @Mapping(source = "entorno", target = "environment"),
            @Mapping(source = "estado", target = "state"),
    })
    IvrApp toIvrApp(IvrAplicacion ivrAplicacion);

    List<IvrApp> toIvrApps(List<IvrAplicacion> ivrAplicaciones);


    @InheritInverseConfiguration
    IvrAplicacion toIvrAplicacion(IvrApp ivrApp);
}
