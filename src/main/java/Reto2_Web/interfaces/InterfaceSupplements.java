package Reto2_Web.interfaces;


import Reto2_Web.modelo.Supplements;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InterfaceSupplements extends MongoRepository<Supplements, String> {
    
}
