package com.amsdams.sneakers.entity;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Brand {
	@Id
	private String id;
	private String name;
	
	public Brand(String name) {
		super();
		this.name = name;
	}
}
