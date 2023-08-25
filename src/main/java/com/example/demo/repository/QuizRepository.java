package com.example.demo.repository;

//import ~~jdbcのは@Queryがエラーになったので付けた。教科書にはない
//sample_quizの完成版の方には付いてた↑12章-2時点まではなかった
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Quiz;

/** Quizテーブル：RepositoryImpl */
public interface QuizRepository extends CrudRepository<Quiz, Integer> {
	@Query("SELECT id FROM quiz ORDER BY RANDOM() limit 1")
	Integer getRandomId();

}
