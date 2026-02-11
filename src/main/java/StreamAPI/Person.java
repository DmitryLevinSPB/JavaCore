package StreamAPI;

public class Person  implements Comparable<Person>{

    private String lastName;
    private String firstName;
    private Integer age;

    public Person(String lastName, String firstName,int age){
this.firstName = firstName;
this.lastName = lastName;
this.age = age;
}

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    @Override
    public String toString(){
        return "Person{" +
                "firstName'=" + firstName + '\'' +
                ",lastName'=" + lastName + '\'' +
                ",age'= "  + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        //return firstName.compareTo(o.getFirstName());
        return  age.compareTo(o.getAge());
    }
}

