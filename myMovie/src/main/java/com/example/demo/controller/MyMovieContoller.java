package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mapper.MyMovieMapper;
import com.example.demo.model.MyMovie;

@RestController
public class MyMovieContoller {

	private MyMovieMapper mapper;
	
	public MyMovieContoller(MyMovieMapper mapper) {
		this.mapper = mapper;
	}
	
	@GetMapping("/mymovie/{id}")
	public MyMovie getMyMovie(@PathVariable("id") String id) {
		return mapper.getMyMovie(id);
		
	}
	
	@GetMapping("/mymovie/all")
	public List<MyMovie> getMyMovieList(){
		return mapper.getMyMovieList();
	}
	
	 
	@PostMapping("/mymovie/{id}")
	public void postMyMovie(@PathVariable("id") String id, @RequestParam("title") String title, @RequestParam("imgUrl") String imgUrl, @RequestParam("genre") String genre,@RequestParam("time") String time,@RequestParam(value = "rate",required =false) String rate,@RequestParam("date") String date,@RequestParam("content") String content) {
		mapper.insertMyMovie(id, title, imgUrl, genre,time,rate,date,content);
	}
	
	
	@PutMapping("/mymovie/{id}")
	public void putMyMovie(@PathVariable("id") String id, @RequestParam("title") String title, @RequestParam("imgUrl") String imgUrl, @RequestParam("genre") String genre,@RequestParam("time") String time,@RequestParam(value = "rate",required =false) String rate,@RequestParam("date") String date,@RequestParam("content") String content) {
		mapper.updateMyMovie(id, title, imgUrl, genre,time,rate,date,content);
	}
	
	@DeleteMapping("/mymovie/{id}")
	public void deleteMyMovie(@PathVariable("id") String id) {
		mapper.deleteMyMovie(id);
	}
}
