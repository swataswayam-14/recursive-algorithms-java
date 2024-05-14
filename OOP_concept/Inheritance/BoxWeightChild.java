package OOP_concept.Inheritance;

public class BoxWeightChild extends InheritanceExample{
    double weight;
    public BoxWeightChild(){
        this.weight = -1;
    }
    public BoxWeightChild(double l, double w, double h, double weight){
        super(l,w,h); //used to initialize values present in parent class
        this.weight = weight;
    }
    public BoxWeightChild(double side , double weight){
        super(side);
        this.weight = weight;
    }
}