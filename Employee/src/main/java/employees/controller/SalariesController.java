package employees.controller;

import employees.controller.dto.SalariesDto;
import employees.controller.dto.TitlesDto;
import employees.service.SalariesService;
import employees.service.TitlesService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;

@Slf4j
@RestController
@RequiredArgsConstructor
public class SalariesController {

    private final SalariesService service;

    @GetMapping("/salaries")
    public Collection<SalariesDto> listSalaries(){
        return service.getAllSalaries()
                .stream()
                .map(model -> SalariesDto.builder()
                        .emp_no(model.getEmp_no())
                        .salary((model.getSalary()))
                        .from_date(model.getFrom_date())
                        .to_date(model.getTo_date())
                        .build())
                .collect(Collectors.toList());
    }
}
