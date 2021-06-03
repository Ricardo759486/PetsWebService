package resources.pojos;

public class Visit {
    private Integer visit_Id;
    private String created_at;
    private String type;
    private String description;
    private Integer vet_Id;
    private Integer pet_Id;

    public Visit(){

    }

    public Visit(Integer visit_Id, String created_at, String type, String description, Integer vet_Id, Integer pet_Id) {
        this.visit_Id = visit_Id;
        this.created_at = created_at;
        this.type = type;
        this.description = description;
        this.vet_Id = vet_Id;
        this.pet_Id = pet_Id;
    }

    public Integer getVisit_Id() {
        return visit_Id;
    }

    public void setVisit_Id(Integer visit_Id) {
        this.visit_Id = visit_Id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getVet_Id() {
        return vet_Id;
    }

    public void setVet_Id(Integer vet_Id) {
        this.vet_Id = vet_Id;
    }

    public Integer getPet_Id() {
        return pet_Id;
    }

    public void setPet_Id(Integer pet_Id) {
        this.pet_Id = pet_Id;
    }
}
