package uniremington.com.ivrapp.domain.repository;

import uniremington.com.ivrapp.domain.IvrApp;
import uniremington.com.ivrapp.persistence.entity.IvrAplicacion;

import java.util.List;
import java.util.Optional;

public interface IAppIvrRepository {

    List<IvrApp> getAll();

    Optional<IvrApp> getByIdApp(int idApp);

    IvrApp save(IvrApp ivrApp);

    void delete(int ivrApp);

}
