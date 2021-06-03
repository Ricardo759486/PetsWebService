package resources.pojos;

import java.util.List;

public class Pet {
    private Integer pet_Id;
    private String microchip;
    private String name;
    private String species;
    private String race;
    private String size;
    private String sex;
    private String picture;
    private Integer owner_Id;
    private Owner owners;

    public Pet(){

    }
    public Pet(Integer pet_Id, String microchip, String name, String species, String race, String size, String sex, String picture, Integer owner_Id) {
        this.pet_Id = pet_Id;
        this.microchip = microchip;
        this.name = name;
        this.species = species;
        this.race = race;
        this.size = size;
        this.sex = sex;
        this.picture = picture;
        this.owner_Id = owner_Id;
    }

    public Pet(Integer pet_Id, String name, String species, String race, String size, String sex, String picture, Integer owner_Id) {
        this.pet_Id = pet_Id;
        this.name = name;
        this.species = species;
        this.race = race;
        this.size = size;
        this.sex = sex;
        this.picture = picture;
        this.owner_Id = owner_Id;
    }

    public Pet(Integer pet_Id, String microchip, String name, String species, String race, String size, String sex, String picture, Integer owner_Id, Owner owners) {
        this.pet_Id = pet_Id;
        this.microchip = microchip;
        this.name = name;
        this.species = species;
        this.race = race;
        this.size = size;
        this.sex = sex;
        this.picture = picture;
        this.owner_Id = owner_Id;
        this.owners = owners;
    }

    public Pet(Integer pet_Id, String name, String species, String race, String size, String sex, String picture, Integer owner_Id, Owner owners) {
        this.pet_Id = pet_Id;
        this.name = name;
        this.species = species;
        this.race = race;
        this.size = size;
        this.sex = sex;
        this.picture = picture;
        this.owner_Id = owner_Id;
        this.owners = owners;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "pet_Id=" + pet_Id +
                ", microchip='" + microchip + '\'' +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", race='" + race + '\'' +
                ", size='" + size + '\'' +
                ", sex='" + sex + '\'' +
                ", picture='" + picture + '\'' +
                ", owner_Id=" + owner_Id +
                ", owners=" + owners +
                '}';
    }

    public Integer getPet_Id() {
        return pet_Id;
    }

    public void setPet_Id(Integer pet_Id) {
        this.pet_Id = pet_Id;
    }

    public String getMicrochip() {
        return microchip;
    }

    public void setMicrochip(String microchip) {
        this.microchip = microchip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Integer getOwner_Id() {
        return owner_Id;
    }

    public void setOwner_Id(Integer owner_Id) {
        this.owner_Id = owner_Id;
    }

    public Owner getOwners() {
        return owners;
    }

    public void setOwners(Owner owners) {
        this.owners = owners;
    }
}