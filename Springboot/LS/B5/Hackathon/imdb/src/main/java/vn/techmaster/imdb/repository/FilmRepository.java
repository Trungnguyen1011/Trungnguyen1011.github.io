package vn.techmaster.imdb.repository;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import vn.techmaster.imdb.model.Film;

@Repository
public class FilmRepository implements IFilmRepo {
  private List<Film> films;

  public FilmRepository(@Value("${datafile}") String datafile) {
    try {
      File file = ResourceUtils.getFile("classpath:static/" + datafile);
      ObjectMapper mapper = new ObjectMapper(); // Dùng để ánh xạ cột trong CSV với từng trường trong POJO
      films = Arrays.asList(mapper.readValue(file, Film[].class));
    } catch (IOException e) {
      System.out.println(e);
    }
  }

  public List<Film> getAll() {
    return films;
  }

  @Override
  public Map<String, List<Film>> getFilmByCountry() {
    Map<String, List<Film>> result = new HashMap<String, List<Film>>();
    films.stream().forEach(film -> {
      List<Film> filmList = result.getOrDefault(film.getCountry(), new ArrayList<Film>());
      filmList.add(film);
      result.put(film.getCountry(), filmList);
    });
    return result;
  }

  @Override
  public Entry<String, Integer> getcountryMakeMostFilms() {
    Map<String, Integer> counter = new HashMap<String, Integer>();
    films.stream().forEach(film -> {
      Integer filmCount = counter.getOrDefault(film.getCountry(), 0);
      counter.put(film.getCountry(), filmCount + 1);
    });

    return counter.entrySet().stream().max((c1, c2) -> c1.getValue().compareTo(c2.getValue())).get();
  }

  @Override
  public Entry<Integer, Integer> yearMakeMostFilms() {
    Map<Integer, Integer> counter = new HashMap<Integer, Integer>();
    films.stream().forEach(film -> {
      Integer filmCount = counter.getOrDefault(film.getYear(), 0);
      counter.put(film.getYear(), filmCount + 1);
    });

    return counter.entrySet().stream().max((c1, c2) -> c1.getValue().compareTo(c2.getValue())).get();

  }

  @Override
  public List<String> getAllGeneres() {
    Set<String> generes = new HashSet<String>();
    films.stream().forEach(film -> generes.addAll(film.getGeneres()));
    List<String> result = new ArrayList<String>(generes);
    result.remove("");
    return result;
  }

  @Override
  public List<Film> getFilmsMadeByCountryFromYearToYear(String country, int fromYear, int toYear) {

    return films.stream().filter(film -> film.getYear() >= fromYear && film.getYear() <= toYear
        && film.getCountry().toLowerCase().equals(country.toLowerCase())).collect(Collectors.toList());
  }

  @Override
  public Map<String, List<Film>> categorizeFilmByGenere() {
    Map<String, List<Film>> result = new HashMap<String, List<Film>>();
    getAllGeneres().forEach(g -> result.put(g, new ArrayList<Film>()));
    films.stream().forEach(f -> {
      result.entrySet().stream().filter(entry -> f.getGeneres().contains(entry.getKey())).forEach(e -> {
        List<Film> filmList = result.getOrDefault(e.getKey(), new ArrayList<Film>());
        filmList.add(f);
        result.put(e.getKey(), filmList);
      });
    });
    return result;
  }

  @Override
  public List<Film> top5HighMarginFilms() {
    return films.stream().sorted((f1, f2) -> (f2.getRevenue() - f2.getCost()) - (f1.getRevenue() - f1.getCost()))
        .limit(5).collect(Collectors.toList());
  }

  @Override
  public List<Film> top5HighMarginFilmsIn1990to2000() {
    return films.stream().filter(f -> f.getYear() <= 2000 && f.getYear() >= 1990)
        .sorted((f1, f2) -> (f2.getRevenue() - f2.getCost()) - (f1.getRevenue() - f1.getCost())).limit(5)
        .collect(Collectors.toList());
  }


  @Override
  public double ratioBetweenGenere(String genreX, String genreY) {
    double gX = (double) films.stream().filter(f -> f.getGeneres().contains(genreX)).count();
    double gY = (double) films.stream().filter(f -> f.getGeneres().contains(genreY)).count();
    return gX/gY;
  }

  @Override
  public List<Film> top5FilmsHighRatingButLowMargin() {
    // List
    return null;
  }

}
