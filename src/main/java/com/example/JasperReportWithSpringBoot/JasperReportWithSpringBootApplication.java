package com.example.JasperReportWithSpringBoot;

import com.example.JasperReportWithSpringBoot.model.Student;
import com.example.JasperReportWithSpringBoot.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

@SpringBootApplication
public class JasperReportWithSpringBootApplication {

	@Bean
	public CommandLineRunner runner(StudentRepository studentRepository){return (String... args) -> {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = fmt.parse("2013-05-06");

//		studentRepository.save(new Student("Student01","student01@mail.com",10,date1));
//		studentRepository.save(new Student("Student02","student02@mail.com",11,date1));
//		studentRepository.save(new Student("Student03","student03@mail.com",11,date1));
//		studentRepository.save(new Student("Student04","student04@mail.com",11,date1));
//		studentRepository.save(new Student("Student05","student05@mail.com",11,date1));
//		studentRepository.save(new Student("Student06","student06@mail.com",11,date1));
//		studentRepository.save(new Student("Student07","student07@mail.com",11,date1));
//		studentRepository.save(new Student("Student08","student08@mail.com",12,date1));
//		studentRepository.save(new Student("Student09","student09@mail.com",12,date1));
//		studentRepository.save(new Student("Student010","student010@mail.com",18,date1));
//		studentRepository.save(new Student("Student011","student011@mail.com",18,date1));
//		studentRepository.save(new Student("Student012","student012@mail.com",18,date1));
//		studentRepository.save(new Student("Student013","student013@mail.com",18,date1));
//		studentRepository.save(new Student("Student014","student014@mail.com",18,date1));
//		studentRepository.save(new Student("Student015","student015@mail.com",18,date1));
	};}
	public static void main(String[] args) {
		SpringApplication.run(JasperReportWithSpringBootApplication.class, args);
	}
}
