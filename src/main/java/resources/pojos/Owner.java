package resources.pojos;

public class Owner {
    private Integer person_Id;
    private String name;
    private String address;
    private String neighborhood;
    public Owner(){

    }

    public Owner(Integer person_Id, String name, String address, String neighborhood) {
        this.person_Id = person_Id;
        this.name = name;
        this.address = address;
        this.neighborhood = neighborhood;
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
}
