/**
 * @author druiz
 */

package com.druiz.demo.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.druiz.demo.model.Question;
import com.druiz.demo.model.base.Identifiable;

@Repository
public class QuestionRepository {

	@PersistenceContext
	private EntityManager em;

	public List<Question> findQuestions() {
		return em.createQuery("from Question", Question.class).getResultList();
	}

	public <T extends Identifiable> T store(T object) {
		em.persist(object);

		return object;
	}
}
