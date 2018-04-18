package com.example.JasperReportWithSpringBoot.controller;

import com.example.JasperReportWithSpringBoot.repository.StudentRepository;
import com.example.JasperReportWithSpringBoot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.jasperreports.JasperReportsPdfView;


import java.util.HashMap;
import java.util.Map;

@Controller
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private ApplicationContext applicationContext;
    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    private String index(Model model) {
        model.addAttribute("students",studentRepository.findAll());
        return "index";
    }

    @GetMapping("/report1")
    private ModelAndView report1() {
        JasperReportsPdfView view = new JasperReportsPdfView();
        view.setUrl("classpath:/reports/report1.jrxml");
        view.setApplicationContext(applicationContext);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("datasource", studentService.report());
        return new ModelAndView(view, params);
    }
}
