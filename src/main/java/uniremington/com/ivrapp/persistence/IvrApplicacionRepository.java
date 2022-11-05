package uniremington.com.ivrapp.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import uniremington.com.ivrapp.domain.IvrApp;
import uniremington.com.ivrapp.domain.repository.IAppIvrRepository;
import uniremington.com.ivrapp.persistence.crud.IAplicacionCrudRepository;
import uniremington.com.ivrapp.persistence.entity.IvrAplicacion;
import uniremington.com.ivrapp.persistence.mapper.IAppIvrMapper;

import java.util.List;
import java.util.Optional;


@Repository
public class IvrApplicacionRepository implements IAppIvrRepository {

    @Autowired
    private IAppIvrMapper ivrMapper;

    @Autowired
    private IAplicacionCrudRepository aplicacionCrudRepository;

    @Override
    public List<IvrApp> getAll() {
        List<IvrAplicacion> ivrAplicaciones = (List<IvrAplicacion>) aplicacionCrudRepository.findAll();
        return ivrMapper.toIvrApps(ivrAplicaciones);
    }

    @Override
    public Optional<IvrApp> getByIdApp(int idApp) {
        return aplicacionCrudRepository.findById(idApp).map(ivr -> ivrMapper.toIvrApp(ivr));
    }

    @Override
    public IvrApp save(IvrApp ivrApp) {
        IvrAplicacion aplicacion = ivrMapper.toIvrAplicacion(ivrApp);
        return ivrMapper.toIvrApp(aplicacionCrudRepository.save(aplicacion));
    }

    @Override
    public void delete(int idApp) {
        aplicacionCrudRepository.deleteById(idApp);
    }

}
