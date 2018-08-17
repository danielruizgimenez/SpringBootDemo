/**
 * @author druiz
 */

package com.druiz.demo.model.renders;

import java.util.List;

public class QuestionPostRender {

	private String question;

	private List<String> choices;

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
	 * @return the choices
	 */
	public List<String> getChoices() {
		return choices;
	}

	/**
	 * @param choices
	 *            the choices to set
	 */
	public void setChoices(List<String> choices) {
		this.choices = choices;
	}

}
