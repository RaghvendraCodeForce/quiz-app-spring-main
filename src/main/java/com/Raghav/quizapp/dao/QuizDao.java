package com.Raghav.quizapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Raghav.quizapp.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
}
