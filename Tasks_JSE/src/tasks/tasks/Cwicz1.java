package tasks.tasks;

import tasks.tasks.Classes.Admin;
import tasks.tasks.Classes.Developer;
import tasks.tasks.Classes.User;


//jjdd6_task_day3.pdf
public class Cwicz1 {
    public void run() {

        User admin1 = new Admin();
        admin1.showInfo();


        User dev1 = new Developer();
        dev1.showInfo();
    }
}
