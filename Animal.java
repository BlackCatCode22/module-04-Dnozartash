import java.util.ArrayList;
import java.util.HashMap;

class Animal {
    private String name;
    private int age;
    private String species;

    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}

class Hyena extends Animal {
    private boolean hasMane;

    public Hyena(String name, int age, boolean hasMane) {
        super(name, age, "Hyena");
        this.hasMane = hasMane;
    }

    public boolean isHasMane() {
        return hasMane;
    }

    public void setHasMane(boolean hasMane) {
        this.hasMane = hasMane;
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }
}

class Lion extends Animal {
    private String furColor;

    public Lion(String name, int age, String furColor) {
        super(name, age, "Lion");
        this.furColor = furColor;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }
}

class Tiger extends Animal {

    public Tiger(String name, int age, boolean isStriped) {
        super(name, age, "Tiger");
    }


}

class Bear extends Animal {
     final String favoriteFood;

    public Bear(String name, int age, String favoriteFood) {
        super(name, age, "Bear");
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

}

class Zoo {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Hyena("ROCCO", 5, true));
        animals.add(new Hyena("CHEWY", 6, false));
        animals.add(new Hyena("CHUNK", 9, true));
        animals.add(new Lion("SIMBA", 7, "Golden"));
        animals.add(new Lion("SNOW", 4, "White"));
        animals.add(new Lion("SCAR", 8, "Brown"));
        animals.add(new Tiger("JEFFERY", 4, true));
        animals.add(new Tiger("TONY", 12, true));
        animals.add(new Tiger("LEO", 3, false));
        animals.add(new Bear("YOGI", 10, "Fish"));
        animals.add(new Bear("BARRY", 12, "Berries"));
        animals.add(new Bear("ROSS", 15, "Nuts"));

        HashMap<String, Integer> speciesCount = new HashMap<>();

        for (Animal animal : animals) {
            speciesCount.put(animal.getSpecies(), speciesCount.getOrDefault(animal.getSpecies(), 0) + 1);
        }

        System.out.println("Animal Report:");
        for (String species : speciesCount.keySet()) {
            System.out.println(species + "s:");
            for (Animal animal : animals) {
                if (animal.getSpecies().equals(species)) {
                    System.out.println("Name: " + animal.getName() + ", Age: " + animal.getAge());
                }
            }
            System.out.println("Total count: " + speciesCount.get(species));
            System.out.println();
        }
    }
}