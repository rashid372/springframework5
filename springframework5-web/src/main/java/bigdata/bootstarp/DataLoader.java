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

    public DataLoader(VetService vetService, OwnerService ownerService) {
        this.vetService = vetService;
        this.ownerService = ownerService;
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
        vet1.setId(4L);
        vet1.setFirstName("Same2");
        vet1.setLastName("Axe2");

        vetService.save(vet1);

        Vet vet2=new Vet();
        vet2.setId(5L);
        vet2.setFirstName("Same2");
        vet2.setLastName("Axe2");

        vetService.save(vet2);

        System.out.println("Vet data has been loaded!");

    }
}
