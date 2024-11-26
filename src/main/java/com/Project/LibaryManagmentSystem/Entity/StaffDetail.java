package com.Project.LibaryManagmentSystem.Entity;

import java.util.List;

import jakarta.persistence.*;
import lombok.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class StaffDetail {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private int age;
	private String gender;
	private long contact;
	private String address;
	
	
	
	
	
}

