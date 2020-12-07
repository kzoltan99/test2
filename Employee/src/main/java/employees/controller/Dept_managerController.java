package employees.controller;

import employees.controller.dto.DepartmentsDto;
import employees.controller.dto.Dept_managerDto;
import employees.service.DepartmentsService;
import employees.service.Dept_managerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;

@Slf4j
@RestController
@RequiredArgsConstructor
public class Dept_managerController {

    private final Dept_managerService service;

    @GetMapping("/dept_manager")
    public Collection<Dept_managerDto> listDept_manager(){
        return service.getAllDept_manager()
                .stream()
                .map(model -> Dept_managerDto.builder()
                        .emp_no(model.getEmp_no())
                        .dept_no(model.getDept_no())
                        .from_date(model.getFrom_date())
                        .to_date(model.getTo_date())
                        .build())
                .collect(Collectors.toList());
    }
}
