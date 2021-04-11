package Google;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Company company;
    private List<Pokemon> pokemonList;
    private List<Parent> parentList;
    private List<Child> childList;
    private Car car;

    public Person(String name) {
        this.name = name;
        this.pokemonList = new ArrayList<>();
        this.parentList = new ArrayList<>();
        this.childList = new ArrayList<>();
        company=new Company();
    }


    @Override
    public String toString() {
        return String.format("%s%n" +
                "Company:%s%n" +
                "Car:%s%n" +
                "Pokemon:%n" +
                "%s" +
                "Parents:%n" +
                "%s" +
                "Children:%n" +
                "%s",name,company,carString(),pokemonStringList(),parentsStringList(),childrenStringList() );
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public List<Parent> getParentList() {
        return parentList;
    }

    public List<Child> getChildrenList() {
        return childList;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String pokemonStringList(){
        StringBuilder sb= new StringBuilder();
        for (Pokemon pokemon : pokemonList) {
            sb.append(pokemon);
        }
        return sb.toString();
    }

    public String parentsStringList(){
        StringBuilder sb= new StringBuilder();
        for (Parent parent : parentList) {
            sb.append(parent);
        }
        return sb.toString();
    }

    public String childrenStringList(){
        StringBuilder sb= new StringBuilder();
//        if (childList.isEmpty()){
//            return sb.toString();
//        }
        for (int i = 0; i < childList.size(); i++) {
            Child child = childList.get(i);
            sb.append(child);
            if (i<childList.size()-1){
                sb.append(System.lineSeparator());
            }
        }
        return sb.toString();
    }

    public String carString(){
        if (car==null){
            return "";
        }
        return car.toString();
    }

    public Company getCompany() {
        return company;
    }
}
