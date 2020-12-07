package employees.dao;

import employees.dao.entity.EmployeesEntity;
import employees.dao.entity.TitlesEntity;
import employees.dao.entity.TitlesId;
import employees.model.Employees;
import employees.model.Titles;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@Slf4j
@RequiredArgsConstructor
public class TitlesDaoImpl implements TitlesDao {

    private final TitlesRepository titlesRepository;

    @Override
    public void createTitles(Titles titles) {

    }

    @Override
    public Collection<Titles> readAll() {
        return StreamSupport.stream(titlesRepository.findById_Title("Engineer", PageRequest.of(0, 9)).getContent().spliterator(),false)
                .map(entity -> new Titles(
                        entity.getId().getId().getId(),
                        entity.getId().getTitle(),
                        entity.getId().getFrom_date(),
                        entity.getTo_date()

                ))
                .collect(Collectors.toList());
    }

    /*@Override
    public void createTitles(Titles titles) {

        TitlesEntity titlesEntity;

        titlesEntity = TitlesEntity.builder()
                .id().id().id()
                .to_date(titles.getTo_date())
                .build();
        log.info("TitlesEntity: {}", titlesEntity);
        try {
            titlesRepository.save(titlesEntity);
        }
        catch(Exception e){
            log.error(e.getMessage());
        }

    }*/
}
