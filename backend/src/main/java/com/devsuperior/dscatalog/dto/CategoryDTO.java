package com.devsuperior.dscatalog.dto;

import java.io.Serializable;

import com.devsuperior.dscatalog.entities.Category;

public class CategoryDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private long id;
	private String name;
	
	public CategoryDTO() {
		
	}

	public CategoryDTO(long id, String name) {
		this.id = id;
		this.name = name;
	}
	public CategoryDTO(Category entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
