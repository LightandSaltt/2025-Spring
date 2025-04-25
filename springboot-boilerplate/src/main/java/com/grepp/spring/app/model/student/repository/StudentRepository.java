package com.grepp.spring.app.model.student.repository;

import com.grepp.spring.app.model.student.code.MBTI;
import com.grepp.spring.app.model.student.document.StudentEmbedding;
import com.grepp.spring.app.model.student.entity.Student;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, String> {


}
