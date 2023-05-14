package com.gleydistonbr.dslist.dto;

import com.gleydistonbr.dslist.entities.Game;

public class GameMinDTO {


	private Long id;
	private String title;	
	private Integer year;
	private String img_Url;
	private String short_Description;
	
	public GameMinDTO() {
		
	}
	
	public GameMinDTO(Game entity) {

		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		img_Url = entity.getImgUri();
		short_Description = entity.getShortDescription();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImg_Url() {
		return img_Url;
	}

	public String getShort_Description() {
		return short_Description;
	}
	
	
	
	
	
	
	
	
	
}
