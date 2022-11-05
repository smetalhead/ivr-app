package uniremington.com.ivrapp.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uniremington.com.ivrapp.domain.IvrApp;
import uniremington.com.ivrapp.domain.repository.IAppIvrRepository;

import java.util.List;
import java.util.Optional;

@Service
public class IvrAppService {

    @Autowired
    private IAppIvrRepository ivrRepository;

    public List<IvrApp> getAll() {
        return ivrRepository.getAll();
    }

    public Optional<IvrApp> getByIdApp(int idApp) {
        return ivrRepository.getByIdApp(idApp);
    }


    public IvrApp save(IvrApp ivrApp) {
        return ivrRepository.save(ivrApp);
    }

    public boolean delete(int idApp) {
        return getByIdApp(idApp).map(app -> {
            ivrRepository.delete(idApp);
            return true;
        }).orElse(false);
    }
}
