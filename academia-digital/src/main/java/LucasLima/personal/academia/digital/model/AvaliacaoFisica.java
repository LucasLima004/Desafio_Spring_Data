package LucasLima.personal.academia.digital.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_avaliacoes")
public class AvaliacaoFisica {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  //Define o outro lado da relação com a tabela de alunos, pegando a coluna determinada.
  @ManyToOne
  //Define que as fk estará na coluna determinada.
  @JoinColumn(name = "aluno_id")
  private Aluno aluno;

  private LocalDateTime dataDaAvaliacao = LocalDateTime.now();

  @Column(name="peso_atual")
  private double peso;

  @Column(name="altura_atual")
  private double altura;

}
