package vetClinic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Clinic {
    private int capacity;
    private List<Pet> data;

    public Clinic(int capacity) {
        this.capacity = capacity;
        this.data=new ArrayList<>();
    }

    public void add(Pet pet){
        if (data.size()<capacity){
        this.data.add(pet);
        }
    }

    public boolean remove(String name){
        for (Pet pet : data) {
            if (pet.getName().equals(name)){
                data.remove(pet);
                return true;
            }
        }
        return false;
    }

    public Pet getPet(String name, String owner) {
        for (Pet pet : data) {
            if (pet.getName().equals(name)&& pet.getOwner().equals(owner)){
                return pet;
            }
        }
        return null;
    }

    public Pet getOldestPet() {
        return data.stream().max(Comparator.comparingInt(Pet::getAge)).get();
    }

    public int getCount() {
        return data.size();
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        sb.append("The clinic has the following patients:");
        for (Pet pet : data) {
            sb.append(System.lineSeparator());
            sb.append(pet.getName() + " " + pet.getOwner());
        }
        return sb.toString();
    }
}
