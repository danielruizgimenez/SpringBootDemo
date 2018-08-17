/**
 * @author druiz
 */

package com.druiz.demo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.druiz.demo.model.base.Identifiable;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "QUESTIONS")
public class Question extends Identifiable {

	@Column
	private String question;

	@Column
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
	private Date published_at;

	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(mappedBy = "question", cascade = { CascadeType.ALL }, orphanRemoval = true)
	private List<QuestionChoice> choices = new ArrayList<QuestionChoice>();

	/**
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * @param question
	 *            the question to set
	 */
	public void setQuestion(String question) {
		this.question = question;
	}

	/**
	 * @return the published_at
	 */
	public Date getPublished_at() {
		return published_at;
	}

	/**
	 * @param published_at
	 *            the published_at to set
	 */
	public void setPublished_at(Date published_at) {
		this.published_at = published_at;
	}

	/**
	 * @return the choices
	 */
	public List<QuestionChoice> getChoices() {
		return choices;
	}

	/**
	 * @param choices
	 *            the choices to set
	 */
	public void setChoices(List<QuestionChoice> choices) {
		this.choices = choices;
	}

}
