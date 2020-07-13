public class Horista extends Funcionario{
    double salHora;
    int numHoras;
    
    Horista(String nome, String sobrenome, int numFuncionario, double salHora, int numHoras){
        super(nome, sobrenome, numFuncionario);
        this.salHora = salHora;
        this.numHoras = numHoras;
    }
    
    void calcSalario(){
        salario = salHora*numHoras;
    }
    
    void exibeDados(){
        System.out.println("Dados do funcionario horista");
        System.out.println("Nome: " + nome + " " + sobrenome);
        System.out.println("Numero: " + numFunc);
        System.out.println("Salario: "+ salario);
        
    }
    
}
