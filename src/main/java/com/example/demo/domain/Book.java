package com.example.demo.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
public class Book {
	private Integer idx;
	private String title;
	private LocalDateTime publishedAt;
	
	@Builder
	public Book(String title, LocalDateTime publishedAt) {
		this.title = title;
		this.publishedAt = publishedAt;
	}
}
