package Google;

public class Company {
    private String companyName ;
    private String department;
    private double salary;

    public Company(String companyName, String department, double salary) {
        this.companyName = companyName;
        this.department = department;
        this.salary = salary;
    }

    public Company() {
    }

    @Override
    public String toString() {
        if (companyName==null){
            return "";
        }
        return String.format("%n%s %s %s",companyName,department,salaryString());
    }

    public String salaryString(){
        String output;
        if (salary == 0) {
            output="";
        }else{
        output = String.format("%.2f",salary);
        }
        return output;
    }
}
