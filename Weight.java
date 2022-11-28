import java.util.Scanner;

public class Weight {

    private double weight;
    private double Idealw;
    private static String name;

    public Weight(double weight, double idealw, String name) {
        this.weight = weight;
        Idealw = idealw;
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter your current weight");
        double weightinput=input.nextDouble();
        this.weight = weight;
    }

    public double getIdealw() {
        return Idealw;
    }

    public void setIdealw(double idealw) {
        Idealw = idealw;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void Printinformation(){
        getName();


    }
    }

