public class Workouts extends Weight{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter what part of your body you would like to focus on");
        System.out.println("Please choose from the following:");
        ArrayList<String> bodypart = new ArrayList<String>();
        bodypart.add("0. Warmup")
        bodypart.add("1.Arms");
        bodypart.add("2.Legs");
        bodypart.add("3.Core");
        bodypart.add("4.Glutes");
        System.out.println(bodypart);
        String Body = input.next();
        System.out.println("Enter how many months you would like to reach your desired weight");
        int Month = input.next.Int();
        System.out.println("What is your level of experince in working out");
        String Level = input.next();
    }
        public static armWorkouts(){
            if(input="Arms"){
                System.out.println("Arm Workouts entered here");
            }
        }
        public static abWorkouts() {
            if (input = "Core") {
                System.out.println("Core Workouts entered here");
            }
        }
        public static legWorkouts(){
            if(input="Legs"){
                System.out.println("Leg workouts entered here");
            }
        }
        public static cardioWorkouts(){
            if(input="Cardio"){
                System.out.println("Cardio workouts entered here");
            }
        }
        public static Warmup(){
            if(input="Warmup")
            System.out.println("Warmups here");
        }



    }
}