import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student  s2 = new Student("Ringo", "Starr", 2.5);
        Employee e1 = new Employee("John", "Lennon", "Manager", 27045.78);
        Student  s4 = new Student("Paul", "McCartney", 3.5);
        Employee e2 = new Employee("George", "Harrison", "Developer", 50000);


        List<Person> people = new ArrayList<>();
        people.add(s2);
        people.add(e1);
        people.add(s4);
        people.add(e2);

        printData(people);
    }

    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            if (person instanceof Employee) {
                Employee employee = (Employee) person;
                System.out.printf("Employee: %d. %s %s earns %.2f tenge\n", employee.getId(), employee.getName(), employee.getSurname(), employee.getSalary());
            }
            if (person instanceof Student) {
                Student student = (Student) person;
                System.out.printf("Student: %d. %s %s earns %.2f tenge\n", student.getId(), student.getName(), student.getSurname(), student.getPaymentAmount());
            }
        }
    }
}