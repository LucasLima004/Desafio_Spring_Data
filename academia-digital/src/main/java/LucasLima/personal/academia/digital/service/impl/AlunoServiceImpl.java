package LucasLima.personal.academia.digital.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import LucasLima.personal.academia.digital.entity.form.AlunoForm;
import LucasLima.personal.academia.digital.entity.form.AlunoUpdateForm;
import LucasLima.personal.academia.digital.infra.utils.JavaTimeUtils;
import LucasLima.personal.academia.digital.model.Aluno;
import LucasLima.personal.academia.digital.model.AvaliacaoFisica;
import LucasLima.personal.academia.digital.repository.AlunoRepository;
import LucasLima.personal.academia.digital.service.IAlunoService;

import java.time.LocalDate;
import java.util.List;
//Classe de serviço
@Service
public class AlunoServiceImpl implements IAlunoService {

  @Autowired
  private AlunoRepository repository;

  @Override
  public Aluno create(AlunoForm form) {
    Aluno aluno = new Aluno();
    aluno.setNome(form.getNome());
    aluno.setCpf(form.getCpf());
    aluno.setBairro(form.getBairro());
    aluno.setDataDeNascimento(form.getDataDeNascimento());

    return repository.save(aluno);
  }

  @Override
  public Aluno get(Long id) {
    return null;
  }

  @Override
  public List<Aluno> getAll(String dataDeNascimento) {

    if(dataDeNascimento == null) {
      return repository.findAll();
    } else {
      LocalDate localDate = LocalDate.parse(dataDeNascimento, JavaTimeUtils.LOCAL_DATE_FORMATTER);
      return repository.findByDataDeNascimento(localDate);
    }

  }

  @Override
  public Aluno update(Long id, AlunoUpdateForm formUpdate) {
    return null;
  }

  @Override
  public void delete(Long id) {
  }

  @Override
  public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {

    Aluno aluno = repository.findById(id).get();

    return aluno.getAvaliacoes();

  }

}
