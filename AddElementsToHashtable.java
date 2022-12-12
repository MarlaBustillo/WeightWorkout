import java.util.Hashtable;

public class AddElementsToHashtable {
    public static void main(String args[])
    {

        Hashtable<String, String> ht1 = new Hashtable<>();


        Hashtable<String, String> ht2
                = new Hashtable<String, String>();


        ht1.put("Fat Loss", " 12 reps, 3 sets");
        ht1.put("Gain Muscle", "8 reps, 3 sets");
        ht1.put("Health and Endurance", "16 reps, 3 sets");

        ht2.put("Affordable Gyms #1", "Planet Fitness");
        ht2.put("Affordable Gyms #2", "Youfit Gyms");
        ht2.put("Affordable Gyms #3", "LA Fitness");


        System.out.println("Here are some tips : " + ht1);
        System.out.println("Here are a couple affordable gyms in your area." + ht2);
    }
}


