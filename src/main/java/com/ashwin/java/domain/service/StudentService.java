package com.ashwin.java.domain.service;

import com.ashwin.java.domain.model.Student;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Student> students;

    @Inject
    public StudentService() {
        students = new ArrayList<Student>();
        students.add(new Student(1L, "Alice"));
        students.add(new Student(2L, "Bob"));
        students.add(new Student(3L, "Clara"));
        students.add(new Student(4L, "Daniel"));
    }

    public Student getById(Long id) {
        if (id == null) return null;
        return students.stream()
                .filter(s -> s.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
