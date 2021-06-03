package resources.pojos;

public class Vet {
    private String userName;
    private Integer vet_Id;
    private String name;
    private String address;
    private String neighborhood;

    public Vet(){

    }

    public Vet(String userName, Integer vet_Id, String name, String address, String neighborhood) {
        this.userName = userName;
        this.vet_Id = vet_Id;
        this.name = name;
        this.address = address;
        this.neighborhood = neighborhood;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getVet_Id() {
        return vet_Id;
    }

    public void setVet_Id(Integer vet_Id) {
        this.vet_Id = vet_Id;
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
