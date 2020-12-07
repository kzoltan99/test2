package employees.service;

import employees.model.Titles;

import java.util.Collection;

public interface TitlesService {

    Collection<Titles> getAllTitles();

    void recordTitles(Titles titles);
}
