package fr.afpa.pooanimals;

public class LandMammal extends Animal {   //EXTENDS
    private String furColor;

    public LandMammal (String species, String ecosystem, String furColor){
        super(species, ecosystem);    //SUPER
        this.furColor = furColor;
    }

    //GETTER & SETTER
    //FURCOLOR
    public String getFurColor(){
        return furColor;
    }

    public void setFurColor(String furColor){
        this.furColor = furColor;
    }

    //METHODS

    //DISPLAY LOCOMOTION TYPE
    @Override
    public String displayLocomotionType(){
        return "Most common way of movements: Walk/Fly/Jump .";
    }

    //TO STRING
    @Override
public String toString(){
    return "Animal {"
            + " Species : " + getSpecies()
            + "| Ecosystem : " + getEcosystem()
            + "| FurColor : " + getFurColor()
            + "}";
}

}
