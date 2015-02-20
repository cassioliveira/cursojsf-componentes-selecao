package br.com.cassioliveira.cursojsf.componentesselecao.model;

import javax.persistence.Entity;

/**
 *
 * @author cassio
 */
public class Linguagem {
    
    private String linguagemFavorita;
    
    private boolean melhorLinguagem;

    public String getLinguagemFavorita() {
        return linguagemFavorita;
    }

    public void setLinguagemFavorita(String linguagemFavorita) {
        this.linguagemFavorita = linguagemFavorita;
    }

    public boolean isMelhorLinguagem() {
        return melhorLinguagem;
    }

    public void setMelhorLinguagem(boolean melhorLinguagem) {
        this.melhorLinguagem = melhorLinguagem;
    }
    
}
