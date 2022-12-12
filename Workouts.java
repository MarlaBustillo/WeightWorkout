import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

import static java.lang.Math.max;


public class Workouts extends Weight{
    public Workouts(double weight, double name, double Idealw) {
        super(weight, name, String.valueOf(Idealw));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter what part of your body you would like to focus on");
        System.out.println("Please choose from the following:");
        ArrayList<String> workouts = new ArrayList<String>();
        workouts.add("1.Arms");
        workouts.add("2.Legs");
        workouts.add("3.Core");
        workouts.add("4.Glutes");
        System.out.println(workouts);
        int workout=input.nextInt();
        System.out.println("Enter how many months you would like to reach your desired weight");
        int Month = input.nextInt();
        System.out.println("What is your level of experience in working out");
        String Level = input.next();
        if(Level=="B"){
            System.out.println("You gotta start somewhere!");
        } else if (Level=="M") {
            System.out.println("Let's get to it!");

        }else if (Level=="E")
            System.out.println("Go run a mile!");
        }

    public static <MyList> void armWorkouts(){
        Scanner input = new Scanner(System.in);
        String input1 = input.next();
        if(input1=="Upper-Body"){
            MyList arms;
            String [] arm={"Shoulder Press","Cable Biceps Bar","Chest Press"};
            System.out.println("Arm Workouts entered here");
            System.out.println(arm);
        }
    }
    public static <MyList> void abWorkouts() {
        Scanner input = new Scanner(System.in);
        String input2 = input.next();
        if (input2 =="Core") {
            MyList core;
            String [] abs={"Turkish Get Up", "Russian Twists","Cable Machine Crunches"};
            System.out.println("Core Workouts entered here");
            System.out.println(abs);
        }
    }
    public static <MyList> void legWorkouts(){
        Scanner input = new Scanner(System.in);
        String input3 = input.next();
        if(input3=="Lower-Body"){
            MyList Legs;
            String [] legs={"Leg Press","Leg Extensions","Seated Leg Curl"};
            System.out.println("Leg workouts entered here");
            System.out.println(legs);
        }
    }
    public static <MyList> void cardioWorkouts(){
        Scanner input = new Scanner(System.in);
        String input4 = input.next();
        if(input4=="Cool Down Cardio"){
            MyList Cardio;
            String [] cardio={"Stair Master", "TrueForm Trainer","Treadmill"};
            System.out.println("Cardio workouts entered here");
            System.out.println(cardio);
        }
    }
    public static void Warmup(){
        Scanner input = new Scanner(System.in);
        String input5 = input.next();
        if(input5=="Warmup")
            System.out.println("Warmups here");
        Stack warmup=new Stack();

        warmup.add("Push-Ups");
        warmup.add("Jumping Jacks");
        warmup.add("Arm Swings");


    }






}
