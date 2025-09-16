package com.demo.movies.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.demo.movies.movie.Movie;
import com.demo.movies.service.MovieService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*") 
@RequestMapping("/api/movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    // Create
//    @PostMapping
//    public Movie addMovie(@RequestBody Movie movie) {
//        return movieService.addMovie(movie);
//    }
//    @PostMapping
//    public ResponseEntity<Map<String, Object>> addMovie(@RequestBody Movie movie) {
//        Movie savedMovie = movieService.addMovie(movie); // Save the movie
//
//        Map<String, Object> response = new HashMap<>();
//        response.put("message", "Movie added successfully");
//        response.put("movie", savedMovie);
//
//        return ResponseEntity.ok(response); // 200 OK + JSON response
//    }

//    @PostMapping
//    public ResponseEntity<Movie> addMovie(@RequestBody Movie movie) {
//        Movie savedMovie = movieService.addMovie(movie);
//        return ResponseEntity.status(HttpStatus.CREATED).body(savedMovie);
//    }
//    @PostMapping
//    public ResponseEntity<Map<String, Object>> addMovie(@RequestBody Movie movie) {
//        Movie savedMovie = movieService.addMovie(movie);
//
//        Map<String, Object> response = new HashMap<>();
//        response.put("message", "Movie added successfully");
//        response.put("movie", savedMovie);
//
//        return ResponseEntity.status(HttpStatus.CREATED).body(response);
//    }


    //create
    @PostMapping
    public ResponseEntity<String> addMovie(@RequestBody Movie movie) {
        movieService.addMovie(movie);  // save the movie
        return ResponseEntity.ok("Movie added successfully");
    }


    // Read All
    @GetMapping
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    // Read by ID
    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable Long id) {
        return movieService.getMovieById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Update
    @PutMapping("/{id}")
    public Movie updateMovie(@PathVariable Long id, @RequestBody Movie movie) {
        return movieService.updateMovie(id, movie);
    }

    // Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMovie(@PathVariable Long id) {
        movieService.deleteMovie(id);
        return ResponseEntity.noContent().build();
    }
}
