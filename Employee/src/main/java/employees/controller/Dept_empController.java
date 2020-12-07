package employees.controller;

import employees.controller.dto.Dept_empDto;
import employees.controller.dto.Dept_managerDto;
import employees.service.Dept_empService;
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
public class Dept_empController {

    private final Dept_empService service;

    @GetMapping("/dept_emp")
    public Collection<Dept_empDto> listDept_emp(){
        return service.getAllDept_emp()
                .stream()
                .map(model -> Dept_empDto.builder()
                        .emp_no(model.getEmp_no())
                        .dept_no(model.getDept_no())
                        .from_date(model.getFrom_date())
                        .to_date(model.getTo_date())
                        .build())
                .collect(Collectors.toList());
    }
}
