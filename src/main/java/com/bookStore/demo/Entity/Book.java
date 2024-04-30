package com.bookStore.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="tbl_book")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "book_id")
	private int id;
	
	@Column(length=30, nullable=false)
	private String title; 
	
	@Column(length=30, nullable=false)
	private String author;
	
	@Column(length=30,nullable=false ,unique=true)
	private String isbn;
	
	
	@Column(length=30, nullable=false)
	private String publicationYear;
	
	@Column(nullable=false, columnDefinition ="int dafault 1")
	private int bookStatus;

}
