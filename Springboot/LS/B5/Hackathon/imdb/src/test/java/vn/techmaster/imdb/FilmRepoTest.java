package vn.techmaster.imdb;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import vn.techmaster.imdb.model.Film;
import vn.techmaster.imdb.repository.FilmRepository;

@SpringBootTest
class FilmRepoTest {
	@Autowired
	private FilmRepository filmRepo;

	@Test
	public void getAll() {
		List<Film> filmList = filmRepo.getAll();
		assertEquals(filmList.size(), 30);
	}

	@Test
	public void getFilmByCountry() {
		Map<String, List<Film>> filmListByCountry = filmRepo.getFilmByCountry();
		assertEquals(filmListByCountry.get("China").size(), 9);
		assertEquals(filmListByCountry.get("Germany").size(), 1);
	}

	@Test
	public void getcountryMakeMostFilms() {
		Entry<String, Integer> counter = filmRepo.getcountryMakeMostFilms();
		assertEquals(counter.getKey(), "China");
		assertEquals(counter.getValue(), 9);
	}

	@Test
	public void yearMakeMostFilms() {
		Entry<Integer, Integer> counter = filmRepo.yearMakeMostFilms();
		assertEquals(counter.getKey(), 1985);
		assertEquals(counter.getValue(), 4);
	}

	@Test
	public void getAllGeneres() {
		List<String> generes = filmRepo.getAllGeneres();
		System.out.println(generes);
		assertEquals(generes.size(), 15);
		assertTrue(generes.contains("horror"));

	}

	@Test
	public void getFilmsMadeByCountryFromYearToYear() {
		List<Film> filmList = filmRepo.getFilmsMadeByCountryFromYearToYear("china", 1999, 2005);
		assertEquals(filmList.size(), 2);

	}

	@Test
	public void categorizeFilmByGenere() {
		Map<String, List<Film>> filmList = filmRepo.categorizeFilmByGenere();
		assertEquals(filmList.keySet().size(), 15);
		assertEquals(filmList.get("fiction").size(), 3);
	}

	@Test
	public void top5HighMarginFilms() {
		List<Film> filmList = filmRepo.top5HighMarginFilms();
		assertEquals(filmList.size(), 5);
		assertTrue(filmList.get(0).getId() == 11);
	}

	@Test
	public void top5HighMarginFilmsIn1990to2000() {
		List<Film> filmList = filmRepo.top5HighMarginFilmsIn1990to2000();
		assertEquals(filmList.size(), 5);
		assertTrue(filmList.get(0).getId() == 11);
	}

	

	@Test
	public void ratioBetweenGenere() {
		double filmRatio = filmRepo.ratioBetweenGenere("fiction", "drama");
		assertEquals(filmRatio, 0.75d);
		
	}
}
