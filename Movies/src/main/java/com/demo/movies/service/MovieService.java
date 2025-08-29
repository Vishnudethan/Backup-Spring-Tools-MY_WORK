package com.demo.movies.service;

import org.springframework.stereotype.Service;

import com.demo.movies.movie.Movie;
import com.demo.movies.repository.MovieRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    // Create
    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    // Read All
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    // Read by ID
    public Optional<Movie> getMovieById(Long id) {
        return movieRepository.findById(id);
    }

    // Update
    public Movie updateMovie(Long id, Movie updatedMovie) {
        return movieRepository.findById(id)
                .map(movie -> {
                    movie.setName(updatedMovie.getName());
                    movie.setRating(updatedMovie.getRating());
                    movie.setGenre(updatedMovie.getGenre());
                    return movieRepository.save(movie);
                })
                .orElseThrow(() -> new RuntimeException("Movie not found with id " + id));
    }

    // Delete
    public void deleteMovie(Long id) {
        movieRepository.deleteById(id);
    }
}
