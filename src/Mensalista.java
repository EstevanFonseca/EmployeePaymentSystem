public class Mensalista extends Funcionario{
    double salMensal;

    Mensalista(String nome, String sobrenome, int numFuncionario, double salMensal){
        super(nome, sobrenome, numFuncionario);
        this.salMensal = salMensal;
    }
    
    void calcSalario(int falta){
        if(falta == 0)
            salario = salMensal;
        else
            salario = salMensal - ((salMensal*0.02)*falta);
    }
    
     void exibeDados(){
        System.out.println("Dados do funcionario horista");
        System.out.println("Nome: " + nome + " " + sobrenome);
        System.out.println("Numero: " + numFunc);
        System.out.println("Salario: "+ salario);
        
    }
}
