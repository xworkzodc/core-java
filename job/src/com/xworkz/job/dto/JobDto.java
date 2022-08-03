package com.xworkz.job.dto;

import com.xworkz.job.costants.Desigination;
import com.xworkz.job.costants.Qualification;
import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class JobDto {
 private Integer id;
 private Desigination desig;
 private double annualpackage;
 private Qualification qualifi;
 private double percentage;
 private boolean fresher;
}
