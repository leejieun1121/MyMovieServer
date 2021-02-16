package com.example.demo.model;

public class MyMovie {
	
	private String id;
	private String title;
	private String imgUrl;
	private String genre;
	private String time;
	private String rate;
	private String date;
	private String content;
	
	
	
	public MyMovie(String id, String title, String imgUrl, String genre, String time, String rate, String date,
			String content) {
		super();
		this.id = id;
		this.title = title;
		this.imgUrl = imgUrl;
		this.genre = genre;
		this.time = time;
		this.rate = rate;
		this.date = date;
		this.content = content;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	
	

}
