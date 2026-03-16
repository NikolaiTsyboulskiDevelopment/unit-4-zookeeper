import java.util.ArrayList;

public class Zoo {

    // ===== Instance Variables =====
    private ArrayList<Cage> cages;


    // ===== Constructors =====
    public Zoo() {
        cages = new ArrayList<>();
        Cage cage1 = new Cage();
        Cage cage2 = new Cage();
        Cage cage3 = new Cage();
        cages.add(cage1);
        cages.add(cage2);
        cages.add(cage3);
    }

    public Zoo(int numCages) {
        cages = new ArrayList<>();
        for (int i = 0; i < numCages; i++) {
            Cage cage = new Cage();
            cages.add(cage);
        }
    }

    // ===== Methods =====
    public int howManyAnimals() {
         return Animal.getAnimalCount();
    }
    public boolean putAnimalInCage(Cage cage, Animal animal) {
        if (cages.contains(cage)) {
            cage.addAnimal(animal);
            return true;
        }
        return false;
        }
    public boolean moveAnimal(Cage from, Cage to, Animal animal) {
        if (cages.contains(from) && cages.contains(to)) {
            if (from.getAnimalAtIndex(from.getNumAnimals() - 1) == animal) {
                from.removeAnimal(animal);
                to.addAnimal(animal);
                return true;
            }
        }
        return false;
    }

    // ===== Getters =====

    public ArrayList<Cage> getCages() {
        return cages;
    }

    public Cage getCageAtIndex(int index) {
        int windex = 0;
        if (index >= 0 && index < cages.size()) {
            return cages.get(index);
        }
        return null;
    }

    public String toString() {
        String zooSummary = "There are " + cages.size() + " cages.\n";
        for (int i = 0; i < cages.size(); i++) {
            zooSummary += "Cage " + i + ": " + cages.get(i) + "\n";
        }
        return zooSummary;
    }

    // ===== Main for Testing (not graded) =====
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        System.out.println("Total animals created:" + zoo.howManyAnimals());
        Animal animaldatsNew = new Animal();
        zoo.putAnimalInCage(zoo.getCageAtIndex(0), animaldatsNew);
        Animal animalRelocation = zoo.getCageAtIndex(0).getAnimalAtIndex(0);
        zoo.moveAnimal(zoo.getCageAtIndex(0), zoo.getCageAtIndex(1), animalRelocation);
        Cage newCage = new Cage();
        boolean val = zoo.moveAnimal(zoo.getCageAtIndex(0), newCage, animalRelocation);
        System.out.println("move:" + val);
        Zoo newZoo = new Zoo(2);
        Animal newAnimal = new Animal();
        boolean val2 = newZoo.putAnimalInCage(newCage, newAnimal);
        System.out.println("DId i make new cage" + val2);
        System.out.println("Animal sound:" + newAnimal.speak());
        
    }
}