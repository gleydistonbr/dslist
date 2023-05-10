package com.gleydistonbr.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_game")
public class Game {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	
	@Column(name = "game_year")
	private Integer year;
	private String genre;
	private String platforms;
	private Double score;
	private String img_Url;
	
	@Column(columnDefinition = "TEXT")
	private String short_Description;
	
	@Column(columnDefinition = "TEXT")
	private String long_Description;

	public Game() {
		
	}

	public Game(Long id, String title, Integer year, String genre, String platforms, Double score, String img_url,
			String short_Description, String long_Description) {
		this.id = id;
		this.title = title;
		this.year = year;
		this.genre = genre;
		this.platforms = platforms;
		this.score = score;
		this.img_Url = img_Url;
		this.short_Description = short_Description;
		this.long_Description = long_Description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPlatforms() {
		return platforms;
	}

	public void setPlatforms(String platforms) {
		this.platforms = platforms;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getImgUri() {
		return img_Url;
	}

	public void setImgUri(String imgUri) {
		this.img_Url = img_Url;
	}

	public String getShortDescription() {
		return short_Description;
	}

	public void setShortDescription(String short_Description) {
		this.short_Description = short_Description;
	}

	public String getLongDescription() {
		return long_Description;
	}

	public void setLongDescription(String longDescription) {
		this.long_Description = long_Description;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
