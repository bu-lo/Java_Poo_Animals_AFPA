package fr.afpa.pooanimals;

public class Bird extends Animal { // EXTENDS
    private int wingSpan;

    public Bird(String species, String ecosystem, int wingSpan) {
        super(species, ecosystem); // SUPER
        this.wingSpan = wingSpan;
    }

    // GETTER & SETTER
    // FURCOLOR
    public int getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }


    //METHODS

    //DISPLAY LOCOMOTION TYPE
    @Override
    public String displayLocomotionType(){
        return "Most common way of movements: Fly .";
    }

    //TO STRING
    @Override
    public String toString() {
        return "Animal {"
                + " Species : " + getSpecies()
                + "| Ecosystem : " + getEcosystem()
                + "| WingSpan : " + getWingSpan()
                + "}";
    }

}
