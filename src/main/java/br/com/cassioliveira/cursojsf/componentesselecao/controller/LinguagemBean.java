package br.com.cassioliveira.cursojsf.componentesselecao.controller;

import br.com.cassioliveira.cursojsf.componentesselecao.model.Linguagem;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author cassio
 */
@ManagedBean
public class LinguagemBean {

    private Linguagem linguagem;

    /**
     * Lista usada para passar valores para os componentes que podem selecionar.
     * Esta lista é uma alternativa à inserção de itens diretamente na página.
     */
    private List<String> listaDinamica;

    public LinguagemBean() {
        this.linguagem = new Linguagem();
        this.listaDinamica = new ArrayList<>();//Instância da listaDinamica
    }

    /**
     * Método que adiciona valores na listaDinamica para ser recuperada pelo
     * componente da página. A anotação '@PostConstruct' faz com que a lista
     * seja populada antes do construtor da classe ser executado.
     */
    @PostConstruct
    public void inicializacao() {
        listaDinamica.add("Java");
        listaDinamica.add("PHP");
        listaDinamica.add("C#");
        listaDinamica.add("Fortran");
        listaDinamica.add("Cobol");
    }

    public Linguagem getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(Linguagem linguagem) {
        this.linguagem = linguagem;
    }

    public List<String> getListaDinamica() {
        return listaDinamica;
    }

}
