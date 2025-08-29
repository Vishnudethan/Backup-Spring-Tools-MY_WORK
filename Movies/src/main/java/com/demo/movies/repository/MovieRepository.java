package com.demo.movies.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.movies.movie.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    // No need to write any code, JpaRepository gives us CRUD methods already
}
