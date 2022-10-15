import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What personality of therapist do you prefer?");
        System.out.println("Introvert");
        System.out.println("Extrovert");
        System.out.println("Ambivert");
        String therapistPersonality = scanner.next().toLowerCase();
        if(therapistPersonality.equals("introvert")){
            //do something
        }
        else if(therapistPersonality.equals("extrovert")){
            //do something
        }
        else {
            //do something
        }

        System.out.println("What age range do you want as your therapist?");
        System.out.println("20s");
        System.out.println("30s");
        System.out.println("40s");
        System.out.println("50s");
        System.out.println("60s and over");
        String therapistAge = scanner.next().toLowerCase();
        if(therapistAge.equals("20s")){
            //do something
        }
        else if(therapistAge.equals("30s")){
            //do something
        }
        else if(therapistAge.equals("40s")){
            //do something
        }
        else  if(therapistAge.equals("50s")){
            //do something
        }
        else{
            //do something
        }

        System.out.println("What gender of therapist do you prefer?");
        System.out.println("Male");
        System.out.println("Female");
        System.out.println("LGBTQ");
        String therapistGender =  scanner.next().toLowerCase();
        if(therapistGender.equals("male")){
            //do something
        }
        else if(therapistGender.equals("female")){
            //do  something
        }
        else{
            //do  something
        }

        System.out.println("What kind of characteristics do you want for your therapist?\n");
        System.out.println("Good Listener");
        System.out.println("Good Advisor");
        System.out.println("Good Reactor");
        String therapistCharacteristics = scanner.next().toLowerCase();
        if(therapistCharacteristics.equals("good listener")){
            //do something
        }
        else if(therapistCharacteristics.equals("good advisor")){
            //do something
        }
        else{
            //do something
        }

        System.out.println("Have you experienced any trauma?");
        System.out.println("Childhood trauma");
        System.out.println("Sexual trauma");
        System.out.println("Bullying");
        System.out.println("No");
        String trauma = scanner.next().toLowerCase();
        if(trauma.equals("childhood trauma")){
            //do something
        }
        else if(trauma.equals("sexual trauma")){
            //do something
        }
        else if(trauma.equals("bullying")){
            //do  something
        }
        else{
            //do something
        }

    }
}
