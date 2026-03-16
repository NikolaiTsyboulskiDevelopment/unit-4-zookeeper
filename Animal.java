import java.util.ArrayList;
import java.util.Random;

public class Animal {

    // ===== Instance Variables =====
    private String animalType;
    private static int animalCount = 0;
    private static final String[] TYPES = {
        "Lion", "Bear", "Elephant", "Giraffe", "Zebra", "Penguin", "Snake", "Monkey"
    };
    
    public Animal() {
        int randomValue = new Random().nextInt(TYPES.length);
        this.animalType = TYPES[randomValue];
        animalCount++;
    }
    public Animal(String type) {
        this.animalType = type;
        animalCount++;
    }
    public String getAnimalType() {
        return animalType;
    }
    public static int getAnimalCount() {
        return animalCount;
    }
    public String speak() {
        if(animalType.equals("Lion")) {
            return "Grr";
        }
        if(animalType.equals("Elephant")) {
            return "Trumpet";
        }
        if(animalType.equals("Giraffe")) {
            return "Munch";
        }
        if(animalType.equals("Zebra")) {
            return "Neigh";
        }
        if(animalType.equals("Penguin")) {
            return "Squawk";
        }
        if(animalType.equals("Monkey")) {
            return "Ooh Ooh Ah Ah";
        }
        else {
            return "idk, call the government";
        }
    }


    public String toString() {
      return "This is a " + animalType + ". It makes a " + speak() + " sound.";
    }
}