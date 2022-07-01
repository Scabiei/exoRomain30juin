package exoRomain30juin.repository;

import exoRomain30juin.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer> {

    public List<Address> findByStreet(String street);
    public List<Address> findByComplement(String complement);
    public List<Address> findByZipcode(String zipcode);
    public List<Address> findByCity(String city);
    public List<Address> findByCountry(String country);

}
