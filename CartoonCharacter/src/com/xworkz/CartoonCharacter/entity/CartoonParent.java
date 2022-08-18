package com.xworkz.CartoonCharacter.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
@ToString


public class CartoonParent {
private String createdBy;
private LocalDate createdDate;
private String updatedBy;
private LocalDate updatedDate;


}
