
public class folhaPagto {
    public static void main(String[] args) {
        Horista funcionario1 = new Horista("João", "da Silva", 111, 80, 40);
        funcionario1.calcSalario();
        funcionario1.exibeDados();
        
        Mensalista funcionario2 = new Mensalista("Maria", "de Souza", 222, 1000);
        funcionario2.calcSalario(0);
        funcionario2.exibeDados();
        
        Mensalista funcionario3 = new Mensalista("Carlos", "Lima", 333, 1000);
        funcionario3.calcSalario(3);
        funcionario3.exibeDados();
    }
    
}
