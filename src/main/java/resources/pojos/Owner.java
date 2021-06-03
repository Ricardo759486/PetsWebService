package resources.pojos;

import java.util.List;

public class Owner {
    private String user;
    private Integer person_Id;
    private String name;
    private String address;
    private String neighborhood;
    private List<Pet> pets;

    public Owner() {

    }

    public Owner(String user, Integer person_Id, String name, String address, String neighborhood) {
        this.user = user;
        this.person_Id = person_Id;
        this.name = name;
        this.address = address;
        this.neighborhood = neighborhood;
    }

    public Owner(String user, Integer person_Id, String name, String address, String neighborhood, List<Pet> pets) {
        this.user = user;
        this.person_Id = person_Id;
        this.name = name;
        this.address = address;
        this.neighborhood = neighborhood;
        this.pets = pets;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Integer getPerson_Id() {
        return person_Id;
    }

    public void setPerson_Id(Integer person_Id) {
        this.person_Id = person_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
}
