import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class Tree_Test {  public static void main(String[] args) {
    Set<String> hashSet = new HashSet<>();             //  Stores unique value and does not maintain insertion order - Super fast
    Set<String> setLinked = new LinkedHashSet<>();     //  Stores Unique Values and Maintains insertion order - slow than hashSet
    Set<EmployeeData> treeSet = addNames();  //new TreeSet<>()            //  Store unique and Maintain sorting order


    for (EmployeeData hash : treeSet) {
        System.out.println(hash.getName() + " " + hash.getAge() + ": " + hash.getCity());
    }


}


private static Set<EmployeeData> addNames() {
    Set<EmployeeData> treeSet = new TreeSet<>();
    treeSet.add(new EmployeeData("Umesh", 22, "Pune"));
    treeSet.add(new EmployeeData("Kumar", 23, "Pune"));
    treeSet.add(new EmployeeData("Anju", 23, "Patiala"));
    treeSet.add(new EmployeeData("Anju", 23, "Patiala"));
    treeSet.add(new EmployeeData("Manju", 27, "Noida"));
    treeSet.add(new EmployeeData("Manju", 27, "Noida"));
    return treeSet;
}

private static class EmployeeData implements Comparable {
    private String Name;
    private int age;
    private String city;

    public EmployeeData(String name, int age, String city) {
        Name = name;
        this.age = age;
         this.city = city;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public int compareTo(Object o) {
        EmployeeData employeeData = null;
        employeeData=(EmployeeData) o;
        if (this.getName().compareTo(employeeData.getName()) != 0) {
            return this.getName().compareTo(employeeData.getName());
        } if (this.getAge() - employeeData.getAge() != 0){
            return this.getAge() - employeeData.getAge();
        } else {
            return this.getCity().compareTo(employeeData.getCity());
        }

    }
}}
