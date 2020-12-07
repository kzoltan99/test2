package employees.controller;

import employees.controller.dto.EmployeesDto;
import employees.controller.dto.EmployeesRecordRequestDto;
import employees.model.Employees;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import employees.service.EmployeesService;

import java.util.Collection;
import java.util.stream.Collectors;

@Slf4j
@RestController
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeesService service;

    @GetMapping("/employees")
    public Collection<EmployeesDto> listEmployees(){
        return service.getAllEmployees()
                .stream()
                .map(model -> EmployeesDto.builder()
                        .first_name(model.getFirst_name())
                        .last_name(model.getLast_name())
                        .gender(model.getGender())
                        .birth_date(model.getBirth_date())
                        .hire_date(model.getHire_date())
                        .build())
                .collect(Collectors.toList());
    }

    @PostMapping("/employees")
    public void record(@RequestBody EmployeesRecordRequestDto requestDto) {

            service.recordEmployees(new Employees(
                    requestDto.getBirth_date(),
                    requestDto.getFirst_name(),
                    requestDto.getLast_name(),
                    requestDto.getGender(),
                    requestDto.getHire_date()

            ));
        }
}
