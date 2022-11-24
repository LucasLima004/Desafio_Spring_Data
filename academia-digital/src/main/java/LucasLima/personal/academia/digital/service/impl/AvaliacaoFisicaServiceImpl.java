package LucasLima.personal.academia.digital.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import LucasLima.personal.academia.digital.entity.form.AvaliacaoFisicaForm;
import LucasLima.personal.academia.digital.entity.form.AvaliacaoFisicaUpdateForm;
import LucasLima.personal.academia.digital.model.Aluno;
import LucasLima.personal.academia.digital.model.AvaliacaoFisica;
import LucasLima.personal.academia.digital.repository.AlunoRepository;
import LucasLima.personal.academia.digital.repository.AvaliacaoFisicaRepository;
import LucasLima.personal.academia.digital.service.IAvaliacaoFisicaService;

import java.util.List;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService {

  @Autowired
  private AvaliacaoFisicaRepository avaliacaoFisicaRepository;

  @Autowired
  private AlunoRepository alunoRepository;

  @Override
  public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
    AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
    Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

    avaliacaoFisica.setAluno(aluno);
    avaliacaoFisica.setPeso(form.getPeso());
    avaliacaoFisica.setAltura(form.getAltura());

    return avaliacaoFisicaRepository.save(avaliacaoFisica);
  }

  @Override
  public AvaliacaoFisica get(Long id) {
    return null;
  }

  @Override
  public List<AvaliacaoFisica> getAll() {

    return avaliacaoFisicaRepository.findAll();
  }

  @Override
  public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate) {
    return null;
  }

  @Override
  public void delete(Long id) {

  }
}
