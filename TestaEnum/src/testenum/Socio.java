package testenum;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Socio extends Pessoa {
private Integer matricula;
private List<Dependente> dependentes = new ArrayList<>();
public Socio( String nome, LocalDate dataNascimento, Integer matricula) {
super( nome, dataNascimento);
this.matricula = matricula;
}
public Integer getMatricula() {
return matricula;
}
public void acrescentarDependente( Dependente dependente) {
dependentes.add( dependente);
}
}