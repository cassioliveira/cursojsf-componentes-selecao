package br.com.cassioliveira.cursojsf.componentesselecao.controller;

import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author cassio
 */
@ManagedBean
public class LinguagensBean {

    // Atributo usado para componentes de seleção com possibilidade de conter vários itens selecionados
    private List<String> linguagensFavoritas;

    public List<String> getLinguagensFavoritas() {
        return linguagensFavoritas;
    }

    public void setLinguagensFavoritas(List<String> linguagensFavoritas) {
        this.linguagensFavoritas = linguagensFavoritas;
    }

}
