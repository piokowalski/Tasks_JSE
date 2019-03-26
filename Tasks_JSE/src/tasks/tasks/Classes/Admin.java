package tasks.tasks.Classes;

public class Admin implements User {


    @Override
    public void showInfo() {
        System.out.println(name + " - admin");
    }
}
