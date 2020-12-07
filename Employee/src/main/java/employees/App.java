package employees;

import employees.controller.dto.*;
import employees.service.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.stream.Collectors;

@Slf4j
@SpringBootApplication
@RequiredArgsConstructor
public class App implements CommandLineRunner {

    //private final EmployeesService service;
    //private final DepartmentsService service;
    //private final TitlesService service;
    //private final SalariesService service;
    private final Dept_managerService service;

    @Autowired
    ApplicationContext context;


    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello World!");
        service.getAllDept_manager()
                .stream()
                .map(model -> Dept_managerDto.builder()
                        .emp_no(model.getEmp_no())
                        .dept_no(model.getDept_no())
                        .from_date(model.getFrom_date())
                        .to_date(model.getTo_date())
                        .build())
                .forEach(System.out::println);
    }

    /*@Override
    public void run(String... args) throws Exception {
        System.out.println("Hello World!");
        service.getAllSalaries()
                .stream()
                .map(model -> SalariesDto.builder()
                        .emp_no(model.getEmp_no())
                        .salary(model.getSalary())
                        .from_date(model.getFrom_date())
                        .to_date(model.getTo_date())
                        .build())
                .forEach(System.out::println);
    }*/

    /*@Override
    public void run(String... args) throws Exception {
        System.out.println("Hello World!");
        service.getAllTitles()
                .stream()
                .map(model -> TitlesDto.builder()
                        .emp_no(model.getEmp_no())
                        .title(model.getTitle())
                        .from_date(model.getFrom_date())
                        .to_date(model.getTo_date())
                        .build())
                .forEach(System.out::println);
    }*/

    /*@Override
    public void run(String... args) throws Exception {
        System.out.println("Hello World!");
        service.getAllDepartments()
                .stream()
                .map(model -> DepartmentsDto.builder()
                        .dept_name(model.getDept_name())
                        .build())
                .forEach(System.out::println);
    }*


    /*@Override
    public void run(String... args) throws Exception {
        System.out.println("Hello World!");
        service.getAllEmployees()
                .stream()
                .map(model -> EmployeesDto.builder()
                        .first_name(model.getFirst_name())
                        .last_name(model.getLast_name())
                        .gender(model.getGender())
                        .birth_date(model.getBirth_date())
                        .hire_date(model.getHire_date())
                        .build())
                .forEach(System.out::println);
    }*/

        public static void main( String[] args )
        {
            SpringApplication.run(App.class, args);
        }


}
