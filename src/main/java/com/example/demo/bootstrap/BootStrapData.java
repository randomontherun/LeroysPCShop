package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        OutsourcedPart CPU= new OutsourcedPart();
        CPU.setCompanyName("Leroy's Computer Store");
        CPU.setName("CPU");
        CPU.setInv(5);
        CPU.setPrice(20.0);
        CPU.setId(100L);
        outsourcedPartRepository.save(CPU);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("CPU"))thePart=part;
        }

        OutsourcedPart motherboard= new OutsourcedPart();
        motherboard.setCompanyName("Leroy's Computer Store");
        motherboard.setName("Motherboard");
        motherboard.setInv(5);
        motherboard.setPrice(20.0);
        motherboard.setId(101L);
        outsourcedPartRepository.save(motherboard);

        OutsourcedPart RAM= new OutsourcedPart();
        RAM.setCompanyName("Leroy's Computer Store");
        RAM.setName("RAM");
        RAM.setInv(5);
        RAM.setPrice(20.0);
        RAM.setId(102L);
        outsourcedPartRepository.save(RAM);

        OutsourcedPart GPU= new OutsourcedPart();
        GPU.setCompanyName("Leroy's Computer Store");
        GPU.setName("GPU");
        GPU.setInv(5);
        GPU.setPrice(20.0);
        GPU.setId(103L);
        outsourcedPartRepository.save(GPU);

        OutsourcedPart PSU= new OutsourcedPart();
        motherboard.setCompanyName("Leroy's Computer Store");
        PSU.setName("PSU");
        PSU.setInv(5);
        PSU.setPrice(20.0);
        PSU.setId(104L);
        outsourcedPartRepository.save(PSU);

        System.out.println(thePart.getCompanyName());

        /*
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }
        */


        Product gamingPC= new Product("Gaming PC",100.0,15);
        Product workstation= new Product("Workstation",100.0,15);
        Product streamingPC= new Product("Streaming  PC",100.0,15);
        Product budgetPC= new Product("Budget PC",50.0,15);
        Product server= new Product("Server",100.0,15);
        productRepository.save(gamingPC);
        productRepository.save(workstation);
        productRepository.save(streamingPC);
        productRepository.save(budgetPC);
        productRepository.save(server);


        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
