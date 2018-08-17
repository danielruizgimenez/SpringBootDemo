/**
 * @author druiz
 */

package com.druiz.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.druiz.demo.model.base.Identifiable;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "QUESTION_CHOICES")
public class QuestionChoice extends Identifiable {

	@ManyToOne
	@JsonIgnore
	private Question question;

	@Column
	private String choice;

	@Column
	private long votes = 0L;

	public QuestionChoice() {
		super();
	}
	
	public QuestionChoice(Question question, String choice) {
		super();
		this.question = question;
		this.choice = choice;
	}

	/**
	 * @return the question
	 */
	public Question getQuestion() {
		return question;
	}

	/**
	 * @param question
	 *            the question to set
	 */
	public void setQuestion(Question question) {
		this.question = question;
	}

	/**
	 * @return the choice
	 */
	public String getChoice() {
		return choice;
	}

	/**
	 * @param choice
	 *            the choice to set
	 */
	public void setChoice(String choice) {
		this.choice = choice;
	}

	/**
	 * @return the votes
	 */
	public long getVotes() {
		return votes;
	}

	/**
	 * @param votes
	 *            the votes to set
	 */
	public void setVotes(long votes) {
		this.votes = votes;
	}

}
