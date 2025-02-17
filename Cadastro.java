import java.util.Scanner;

class Pessoa {
    private String nome;
    private int idade;
    
    //Adiciona um novo atributo a classe Email.
    //Adiciona um novo atributo a classe Endereço.

    private String email;       
    private String endereco;   
    public Pessoa(String nome, int idade, String email, String endereco) {
    
    
    this.nome = nome;
    this.idade = idade;
    
    //Atribui os valores aos atributos correspondentes.
    
    this.email = email;        
    this.endereco = endereco;   
    }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    //Adiciona um novo getter e setter para o atributo Email e Endereço.

    public String getEmail() { return email; }                      
    public void setEmail(String email) { this.email = email; }

    public String getEndereço() { return endereco; }
    public void setEndereço(String endereco) { this.endereco = endereco; }


    public void exibirInformacoes() {
    
    //
    System.out.println("Informações da Pessoa:");
    System.out.println("Nome: " + getNome());
    System.out.println("Idade: " + getIdade());
    System.out.println("Email: " + getEmail());
    System.out.println("Endereço: " + getEndereço());

    }	


}
    public class Cadastro {
    public static void main(String[] args) {

        //Usa o Scanner para ler as informaçoes das pessoas do cadastro
        
        Scanner scanner = new Scanner(System.in);


            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine();
        
            System.out.print("Digite o email: ");
            String email = scanner.nextLine();
        
            System.out.print("Digite o endereço: ");
            String endereço = scanner.nextLine();

            System.out.println();


            //Cria uma nova pessoa com os dados lidos

            Pessoa pessoa = new Pessoa(nome, idade, email, endereço);
            
            //Exibe as informacoes da pessoa
            pessoa.exibirInformacoes();

        //Fecha o Scanner
        scanner.close();
    
        


    }
    }