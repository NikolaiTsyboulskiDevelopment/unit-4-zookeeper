import java.util.ArrayList;

public class Cage {

    // ===== Instance Variables =====
    private ArrayList<Animal> animals;

    // ===== Constructors =====
    public Cage() {
        animals = new ArrayList<>();
        animals.add(new Animal());
    }
    public Cage(Animal animal) {
        animals = new ArrayList<>(); 
        animals.add(animal);
    }

    public int getNumAnimals() {
        return animals.size();
    
    }
   public Animal getAnimalAtIndex(int index) {
        if (index >= 0 && index < animals.size()) {
            return animals.get(index);
        }
        return null;
    }

    // ===== Behaviors =====
    public void addAnimal(Animal animal) {
      animals.add(animal);

    }
    public boolean removeAnimal(Animal animal) {
      return animals.remove(animal);
    }


    @Override
    public String toString() {
        return "Cage with " + animals.size() + " animals: " + animals; 
    }
}