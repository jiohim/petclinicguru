package pl.jiohim.petclinicguru.services.map;


import org.springframework.stereotype.Service;
import pl.jiohim.petclinicguru.model.Vet;
import pl.jiohim.petclinicguru.services.VetService;
import java.util.Set;


@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }


    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(Vet object) {
        super.delete(object);

    }


}
