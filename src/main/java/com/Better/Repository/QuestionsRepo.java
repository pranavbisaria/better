package com.Better.Repository;

import com.Better.Models.QuestionModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionsRepo extends JpaRepository<QuestionModel, Integer> {
}
