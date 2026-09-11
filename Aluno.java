public class Aluno {

    public String nome;
    public String matricula;
    public int idade;
    public String nomePais;
    public boolean formando;
    public String sexo;

    // Construtor
    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.formando = false;
    }

    // Get e Set - Nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Get e Set - Matrícula
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Get e Set - Idade
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Get e Set - Nome dos pais
    public String getNomePais() {
        return nomePais;
    }

    public void setNomePais(String nomePais) {
        this.nomePais = nomePais;
    }

    // Get e Set - Formando
    public boolean isFormando() {
        return formando;
    }

    public void setFormando(boolean formando) {
        this.formando = formando;
    }

    // Get e Set - Sexo
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}