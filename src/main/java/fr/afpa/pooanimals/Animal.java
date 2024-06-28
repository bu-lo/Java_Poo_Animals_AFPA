package fr.afpa.pooanimals;

public abstract class Animal {  //ABSTRACT
    private String species;
    private String ecosystem;

    public Animal(String species, String ecosystem) {
        this.species = species;
        this.ecosystem = ecosystem;
    }

    // GETTERS & SETTERS
    // SPECIES

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    // ECOSYSTEM

public String getEcosystem(){
    return ecosystem;
}

    public void setEcosystem(String ecosystem) {
        this.ecosystem = ecosystem;
    }

    // METHODS

    //DISPLAY LOCOMOTION TYPE
    abstract public String displayLocomotionType();

    //TO STRING
    @Override
    public String toString() {
        return "Animal {"
                + " Species : " + getSpecies()
                + "| Ecosystem : " + getEcosystem()
                + "}";
    }

}
