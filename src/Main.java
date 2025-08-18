//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setName("Joao");
        manager.setLogin("admin");
        manager.setPassword("admin");
        System.out.println(manager.getName() + manager.getLogin() + " " + manager.getPassword());
    }
}