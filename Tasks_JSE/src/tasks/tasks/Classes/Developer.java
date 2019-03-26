package tasks.tasks.Classes;

public class Developer implements User {


    @Override
    public void showInfo() {
        System.out.println(name + " - dev");
    }
}