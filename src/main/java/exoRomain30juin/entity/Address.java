package exoRomain30juin.entity;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name="street")
    private String street;
    @Column(name="complement")
    private String complement;
    @Column(name="zipcode")
    private String zipcode;
    @Column(name="city")
    private String city;
    @Column(name="country")
    private String country;

    public Address(int id, String street, String complement, String zipcode, String city, String country) {
        this.id = id;
        this.street = street;
        this.complement = complement;
        this.zipcode = zipcode;
        this.city = city;
        this.country = country;
    }

    public Address() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
