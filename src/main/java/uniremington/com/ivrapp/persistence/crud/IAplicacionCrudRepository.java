package uniremington.com.ivrapp.persistence.crud;

import org.springframework.data.repository.CrudRepository;
import uniremington.com.ivrapp.persistence.entity.IvrAplicacion;

public interface IAplicacionCrudRepository extends CrudRepository<IvrAplicacion, Integer> {

    IvrAplicacion findByIdIvrUrl(int idIvrUrl);

}
