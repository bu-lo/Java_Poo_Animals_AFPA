package fr.afpa.pooanimals;

public class Fish extends Animal { //EXTENDS
    private int preferredWaterDepth
    ;

    public Fish (String species, String ecosystem, int preferredWaterDepth){
        super(species, ecosystem);    //SUPER
        this.preferredWaterDepth = preferredWaterDepth;
    }

    //GETTER & SETTER
    //FURCOLOR
    public int getPreferredWaterDepth(){
        return preferredWaterDepth;
    }

    public void setPreferredWaterDepth(int preferredWaterDepth){
        this.preferredWaterDepth = preferredWaterDepth;
    }

    //METHODS

    //DISPLAY LOCOMOTION TYPE
    @Override
    public String displayLocomotionType(){
        return "Most common way of movements: Swimming .";
    }

    //To STRING
    @Override
public String toString(){
    return "Animal {"
            + " Species : " + getSpecies()
            + "| Ecosystem : " + getEcosystem()
            + "| Preferred Water Depth : " + getPreferredWaterDepth()
            + "}";
}

}
