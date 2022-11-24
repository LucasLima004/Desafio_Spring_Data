package LucasLima.personal.academia.digital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import LucasLima.personal.academia.digital.entity.form.AlunoForm;
import LucasLima.personal.academia.digital.model.Aluno;
import LucasLima.personal.academia.digital.model.AvaliacaoFisica;
import LucasLima.personal.academia.digital.service.impl.AlunoServiceImpl;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

  @Autowired
  private AlunoServiceImpl service;

  @PostMapping
  //Chama a validação definida nas classes de form.
  public Aluno create(@Valid @RequestBody AlunoForm form) {
    return service.create(form);
  }

  @GetMapping("/avaliacoes/{id}")
  public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(@PathVariable Long id) {
    return service.getAllAvaliacaoFisicaId(id);
  }

  @GetMapping
  public List<Aluno> getAll(@RequestParam(value = "dataDeNascimento", required = false)
                                  String dataDeNacimento){
    return service.getAll(dataDeNacimento);
  }


}
