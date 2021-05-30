package resources.pojos;

public class Case {
    private Integer case_Id;
    private String created_At;
    private String type;
    private String description;
    private Integer pet_Id;
    public Case(){

    }

    public Case(Integer case_Id, String created_At, String type, String description, Integer pet_Id) {
        this.case_Id = case_Id;
        this.created_At = created_At;
        this.type = type;
        this.description = description;
        this.pet_Id = pet_Id;
    }

    public Integer getCase_Id() {
        return case_Id;
    }

    public void setCase_Id(Integer case_Id) {
        this.case_Id = case_Id;
    }

    public String getCreated_At() {
        return created_At;
    }

    public void setCreated_At(String created_At) {
        this.created_At = created_At;
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

    public Integer getPet_Id() {
        return pet_Id;
    }

    public void setPet_Id(Integer pet_Id) {
        this.pet_Id = pet_Id;
    }
}