package LucasLima.personal.academia.digital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import LucasLima.personal.academia.digital.entity.form.MatriculaForm;
import LucasLima.personal.academia.digital.model.Matricula;
import LucasLima.personal.academia.digital.service.impl.MatriculaServiceImpl;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

  @Autowired
  private MatriculaServiceImpl service;

  @PostMapping
  public Matricula create(@Valid @RequestBody MatriculaForm form) {
    return service.create(form);
  }

  @GetMapping
  public List<Matricula> getAll(@RequestParam(value = "bairro", required = false) String bairro) {
    return service.getAll(bairro);
  }

}

