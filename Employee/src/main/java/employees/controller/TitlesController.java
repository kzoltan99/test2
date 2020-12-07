package employees.controller;

import employees.controller.dto.EmployeesDto;
import employees.controller.dto.TitlesDto;
import employees.service.EmployeesService;
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
public class TitlesController {

    private final TitlesService service;

    @GetMapping("/titles")
    public Collection<TitlesDto> listTitles(){
        return service.getAllTitles()
                .stream()
                .map(model -> TitlesDto.builder()
                        .emp_no(model.getEmp_no())
                        .title(model.getTitle())
                        .from_date(model.getFrom_date())
                        .to_date(model.getTo_date())
                        .build())
                .collect(Collectors.toList());
    }
}
