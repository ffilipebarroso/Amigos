public class Amigo {
    public String nome;
    public String apelido;
    public String idade;
    
    public Amigo (String nome, String apelido, String idade){
        this.nome = nome;
        this.apelido = apelido;
        this.idade = idade;
    }
    @Override
        public String toString () {
            return "\nnome : " + nome +
                    "\napelido : " + apelido +
                    "\nidade : " + idade + "\n";
 }}