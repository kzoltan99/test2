package employees.controller;

import employees.controller.dto.DepartmentsDto;
import employees.controller.dto.DepartmentsRecordRequestDto;
import employees.controller.dto.EmployeesRecordRequestDto;
import employees.model.Departments;
import employees.model.Employees;
import employees.service.DepartmentsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;

@Slf4j
@RestController
@RequiredArgsConstructor
public class DepartmentsController {

    private final DepartmentsService service;

    @GetMapping("/departments")
    public Collection<DepartmentsDto> listDepartments(){
        return service.getAllDepartments()
                .stream()
                .map(model -> DepartmentsDto.builder()
                        .dept_name(model.getDept_name())
                        .build())
                .collect(Collectors.toList());
    }

    @PostMapping("/departments")
    public void record(@RequestBody DepartmentsRecordRequestDto requestDto) {

        service.recordDepartments(new Departments(
                requestDto.getDept_no(),
                requestDto.getDept_name()

        ));
    }
}
