package Collections.EMS;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class runner {
    runner() {

    }
    public static void main(String[] args) throws IOException {
        List<emp> list = new ArrayList<>();
        console con = new console();
        Listdb db = new Listdb();
        while (true) {
            switch (con.showOptions()) {
                case 1:
                    db.getAllEmp(list);
                    break;
                case 2:
                    emp e = con.acceptEmp();
                    boolean inserted = db.addEmp(list, e);
                    if(inserted) {
                        System.out.println("Employee inserted successfully");
                        System.out.println("Employee ID: " + e.id + "\n");
                    } else {
                        System.out.println("Error while inserting the employee");
                    }
                    break;
                case 3:
                    db.updateEmp();
                    break;
                case 4:
                    db.deleteEmp();
                    break;
                case 5:
                    System.out.println("Thank you for using our Employee Management System!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
        }
    }
}
