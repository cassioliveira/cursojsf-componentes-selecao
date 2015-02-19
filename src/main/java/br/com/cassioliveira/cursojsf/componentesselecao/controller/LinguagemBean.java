package br.com.cassioliveira.cursojsf.componentesselecao.controller;

import br.com.cassioliveira.cursojsf.componentesselecao.model.Linguagem;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author cassio
 */
@ManagedBean
public class LinguagemBean {

    private Linguagem linguagem;

    private List<String> linguagensFavoritas;

    public LinguagemBean() {
        this.linguagem = new Linguagem();
    }

    public List<String> getLinguagensFavoritas() {
        return linguagensFavoritas;
    }

    public void setLinguagensFavoritas(List<String> linguagensFavoritas) {
        this.linguagensFavoritas = linguagensFavoritas;
    }

    public Linguagem getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(Linguagem linguagem) {
        this.linguagem = linguagem;
    }

}
