/**
 * @author druiz
 */

package com.druiz.demo.controllers;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.druiz.demo.model.Question;
import com.druiz.demo.model.QuestionChoice;
import com.druiz.demo.model.renders.QuestionPostRender;
import com.druiz.demo.repositories.QuestionRepository;

@RestController
@Transactional
public class DemoController {

	@Autowired
	private QuestionRepository questionRepository;

	@RequestMapping(value = "/questions", method = RequestMethod.GET, produces = "application/json")
	public List<Question> getAllQuestions() {
		List<Question> findQuestions = questionRepository.findQuestions();

		return findQuestions;
	}

	@RequestMapping(value = "/questions", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public List<Question> postQuestion(@RequestBody QuestionPostRender body) {
		Question q = new Question();
		q.setPublished_at(new Date());
		q.setQuestion(body.getQuestion());

		body.getChoices().forEach(c -> q.getChoices().add(new QuestionChoice(q, c)));

		questionRepository.store(q);

		List<Question> findQuestions = questionRepository.findQuestions();
		return findQuestions;
	}

}
