package com.api.crud.model;

public class Topic {
	private Integer id;
	private String name;
	private String course;
	private String lesson;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getLesson() {
		return lesson;
	}

	public void setLesson(String lesson) {
		this.lesson = lesson;
	}

	public Topic(Integer id, String name, String course, String lesson) {
		this.id = id;
		this.name = name;
		this.course = course;
		this.lesson = lesson;
	}
}
