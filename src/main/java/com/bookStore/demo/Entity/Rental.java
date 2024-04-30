package com.bookStore.demo.Entity;

import java.util.Date;

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


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tbl_Rental")
public class Rental {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Rental_id")
	private int id;
	
	@Column(name="book_id")
	private Book bookId;
	
	@Column(length = 100, nullable = false)
	private String  renterName;
	
	@Column(nullable = false)
	private Date rentalDate;
	
	@Column(name = "rented_days", nullable = false)
	private Date returnDate;

}
