package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.model.MyMovie;


@Mapper
public interface MyMovieMapper {
	
	@Select("SELECT * FROM mymovie WHERE id=#{id}")
	MyMovie getMyMovie(@Param("id") String id);
	
	@Select("SELECT * FROM mymovie")
	List<MyMovie> getMyMovieList();
	
	//변경된 레코드의 개수가 반환됨 

	@Insert("INSERT INTO mymovie VALUES(#{id}, #{title}, #{imgUrl}, #{genre}, #{time}, #{rate}, #{date}, #{content})")
	int insertMyMovie(@Param("id") String id, @Param("title") String title, @Param("imgUrl") String imgUrl, @Param("genre") String genre, @Param("time") String time,@Param("rate") String rate, @Param("date") String date,@Param("content") String content );

	@Update("UPDATE mymovie SET title=#{title}, imgUrl=#{imgUrl}, genre=#{genre}, time=#{time}, genre=#{genre}, time=#{time}, rate=#{rate}, date=#{date}, content=#{content} WHERE id=#{id}")
	int updateMyMovie(@Param("id") String id, @Param("title") String title, @Param("imgUrl") String imgUrl, @Param("genre") String genre, @Param("time") String time,@Param("rate") String rate, @Param("date") String date,@Param("content") String content );

	@Delete("DELETE FROM mymovie WHERE id=#{id}")
	int deleteMyMovie(@Param("id")String id);
	
}
