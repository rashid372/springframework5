package bigdata.bootstarp;

import com.bigdata.model.Owner;
import com.bigdata.model.Vet;
import com.bigdata.service.OwnerService;
import com.bigdata.service.VetService;
import com.bigdata.service.map.OwnerMapService;
import com.bigdata.service.map.VetMapService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final VetService vetService;
    private final OwnerService ownerService;

    public DataLoader() {
        this.vetService = new VetMapService();
        this.ownerService = new OwnerMapService();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1=new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Rashid");
        owner1.setLastName("Mumtaz");

        ownerService.save(owner1);

        Owner owner2=new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Shahid");
        owner2.setLastName("Mumtaz");

        ownerService.save(owner2);

        System.out.println("Owner Data Loaded.");

        Vet vet=new Vet();
        vet.setId(3L);
        vet.setFirstName("Same");
        vet.setLastName("Axe");

        vetService.save(vet);

        Vet vet1=new Vet();
        vet.setId(4L);
        vet.setFirstName("Same2");
        vet.setLastName("Axe2");

        vetService.save(vet1);

        System.out.println("Vet data has been loaded!");

    }
}
