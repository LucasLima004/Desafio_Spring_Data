package LucasLima.personal.academia.digital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import LucasLima.personal.academia.digital.entity.form.AvaliacaoFisicaForm;
import LucasLima.personal.academia.digital.model.AvaliacaoFisica;
import LucasLima.personal.academia.digital.service.impl.AvaliacaoFisicaServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

  @Autowired
  private AvaliacaoFisicaServiceImpl service;

  @PostMapping
  public AvaliacaoFisica create(@RequestBody AvaliacaoFisicaForm form) {
    return service.create(form);
  }

  @GetMapping
  public List<AvaliacaoFisica> getAll(){
    return service.getAll();
  }

}
