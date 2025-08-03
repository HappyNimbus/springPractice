package max.code.mySpringProject;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftwareEngineerService {

    private final SoftwareEngineerRepo softwareEngineerRepo;

    public SoftwareEngineerService(SoftwareEngineerRepo softwareEngineerRepo) {
        this.softwareEngineerRepo = softwareEngineerRepo;
    }

    public List<SoftwareEngineer> getAllSoftwareEngineers(){
        return softwareEngineerRepo.findAll();
    }

    public SoftwareEngineer getEngineerByID(Integer id){
        return softwareEngineerRepo.findById(id)
            .orElseThrow(() -> new IllegalStateException(id + " not found"));
    }

    public void insertSoftwareEngineer(SoftwareEngineer softwareEngineer){
        softwareEngineerRepo.save(softwareEngineer);
    }
}
