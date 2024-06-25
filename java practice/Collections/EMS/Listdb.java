package Collections.EMS;

import java.util.List;

public class Listdb {
    // Add an employee
    public boolean addEmp(List<emp> list, emp e) {
        return list.add(e);
    }

    // fetch all employee
    public void getAllEmp(List<emp> list) {
        list.forEach(e -> System.out.println(e.toString()));
    }

    // delete an employee
    public boolean deleteEmp(List<emp> list, emp e) {
        return list.remove(e);
    }

    // update an employee
    public void updateEmp() {

    }
}
