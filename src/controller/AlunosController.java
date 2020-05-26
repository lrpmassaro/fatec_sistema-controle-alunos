/*
 * Classe que implementa um controlador de objetos de classe Aluno
 */
package controller;

import java.util.ArrayList;
import model.Aluno;

public class AlunosController {

    // declaração de variáveis de instância
    private ArrayList<Aluno> alunos = new ArrayList();

    // método para salvar os dados de objetos Aluno
    public boolean salvar(Aluno aluno) {
        if (aluno != null) {
            alunos.add(aluno);
            return true;
        } else {
            return false;
        }
    }

    // método para pesquisar os dados de um objeto Aluno pelo RA
    public Aluno pesquisarPeloRa(String ra) {
        boolean encontrou = false;
        int i = 0;
        while (i < alunos.size() && !encontrou) {
            if (alunos.get(i).getRa().equals(ra)) {
                encontrou = true;
            } else {
                i++;
            }
        }
        if (encontrou) {
            return alunos.get(i);
        } else {
            return null;
        }
    }

    // método para pesquisar os dados de um objeto Aluno pelo nome
    public Aluno pesquisarpeloNome(String nome) {
        boolean encontrou = false;
        int i = 0;
        while (i < alunos.size() && !encontrou) {
            if (alunos.get(i).getNome().equalsIgnoreCase(nome)) {
                encontrou = true;
            } else {
                i++;
            }
        }
        if (encontrou) {
            return alunos.get(i);
        } else {
            return null;
        }
    }

    // método para retornar o índice de um objeto Aluno na Arraylist
    public int pesquisarIndice(Aluno aluno) {
        boolean encontrou = false;
        int i = 0;
        while (i < alunos.size() && !encontrou) {
            if (alunos.get(i).getRa().equals(aluno.getRa())) {
                encontrou = true;
            } else {
                i++;
            }
        }
        if (encontrou) {
            return i;
        } else {
            return -1;
        }
    }

    // método para alterar os dados do Aluno
    public boolean aletar(Aluno alunoAlterado) {
        int indice = pesquisarIndice(alunoAlterado);
        if (indice != -1) {
            alunos.set(indice, alunoAlterado);
            return true;
        } else {
            return false;
        }
    }

    // método para remover ou excluir os dados do Aluno
    public boolean excluir(Aluno alunoExcluido) {
        int indice = pesquisarIndice(alunoExcluido);
        if (indice != -1) {
            alunos.remove(indice);
            return true;
        } else {
            return false;
        }
    }
}
