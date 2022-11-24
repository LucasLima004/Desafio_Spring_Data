package LucasLima.personal.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {
	//Diz que o campo não pode estar vazio.
  @NotEmpty(message = "Preencha o campo corretamente.")
  //Define o tamanho permitido.
  @Size(min = 3, max =50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
  private String nome;

  @NotEmpty(message = "Preencha o campo corretamente.")
  //Valida o CPF se é válido.
  //@CPF(message = "'${validatedValue}' é inválido!")
  private String cpf;

  @NotEmpty(message = "Preencha o campo corretamente.")
  @Size(min = 3, max =50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
  private String bairro;
  
  //Não permite o campo nulo.
  @NotNull(message = "Prencha o campo corretamente.")
  //Define que a data precisa ser no passado.
  @Past(message = "Data '${validatedValue}' é inválida.")
  private LocalDate dataDeNascimento;
}
