package employees.exceptions;

import employees.model.Employees;
import lombok.Data;

@Data
public class UnknownEmployeeException  extends Exception{

    private Employees employees;

    public UnknownEmployeeException(Employees employees) {this.employees = employees;}

    public UnknownEmployeeException(String message, Employees employees) {
        super(message);
        this.employees = employees;
    }

    public UnknownEmployeeException(String message) {super(message);}
}
