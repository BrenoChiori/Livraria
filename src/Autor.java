import java.util.Date;

public class Autor {
    private static int contadorId = 1;
    private long id;
    private String nome;
    private Date nascimentoAutor;

    public Autor(String nome, Date nascimentoAutor) {
        this.id = contadorId++;
        this.nome = nome;
        this.nascimentoAutor = nascimentoAutor;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNascimentoAutor() {
        return nascimentoAutor;
    }

    public void setNascimentoAutor(Date nascimentoAutor) {
        this.nascimentoAutor = nascimentoAutor;
    }
}
