import domain.Employee;
import domain.Manager;
import domain.Salesman;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        printEmployee(new Manager());
        printEmployee(new Salesman());

    }
    //Não pede default por causa do sealed do domain.Employee
    public static void printEmployee(Employee employee) {
        switch (employee) {
            case Manager manager -> {
                employee.setCode("123");
                employee.setName("Joao");
                employee.setSalary(5000);
                manager.setLogin("admin");
                manager.setPassword("admin");
                manager.setCommission(1700);

                System.out.println(employee.getName() + " " + manager.getCode() + " " + manager.getSalary() + " " + manager.getLogin() + " " + manager.getPassword());
            }
            case Salesman salesman -> {
                employee.setCode("1234");
                employee.setName("Lucas");
                employee.setSalary(2800);
                salesman.setSoldAmount(50);
                salesman.setPercentPerSold(50);

                System.out.println(salesman.getCode() + " " + salesman.getName() + " " + salesman.getSalary() + " " + salesman.getPercentPerSold() + " " + salesman.getSoldAmount());
            }
        }
        employee.getFullSalary();
        System.out.println(employee.getFullSalary());
    }
}
