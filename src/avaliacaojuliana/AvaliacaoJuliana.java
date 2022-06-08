package avaliacaojuliana;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.*;

/**
 *
 * @author LAB_E3
 */
public class AvaliacaoJuliana {

    public static void main(String[] args) {
        ArrayList<String> senhatentativa = new ArrayList<String>();
        ArrayList<String> novasenha = new ArrayList<String>();
        String senha = "123";
        senhatentativa.add(JOptionPane.showInputDialog("Digite a senha: "));
        for (int i = 0; i < senhatentativa.size(); i++) {
            if (!senha.equals(senhatentativa.get(i)) && i < 2) {
                senhatentativa.add(JOptionPane.showInputDialog(null, "Senha incorreta!! Tente Novamente: "));
            } else if (!senha.equals(senhatentativa.get(i)) && i > 1) {
                novasenha.add(JOptionPane.showInputDialog(null, "Digite uma nova senha: "));
                if (novasenha.equals(senhatentativa.get(0)) || novasenha.equals(senha) || novasenha.equals(senhatentativa.get(1))) {
                    JOptionPane.showMessageDialog(null, "A senha não pode ser igual as 3 anterioes");
                } else {
                    String opcao = "0";
                    String textoMenu = "---- Menu ----- \n"
                            + "Digite o código da opção desejada:\n \n"
                            + "1 - Cadastrar País \n"
                            + "2 - Cadastrar Estado \n"
                            + "3 - Cadastrar Cidade \n"
                            + "4 - Cadastrar Endereço \n"
                            + "5 - Cadastrar Pessoa \n"
                            + "6 - Listar Pessoas \n"
                            + "0 - Sair";
                    Pessoa pessoa = new Pessoa();
                    Pais pais = new Pais();
                    Estado estado = new Estado();
                    Cidade cidade = new Cidade();
                    Endereco endereco = new Endereco();

                    do {
                        opcao = JOptionPane.showInputDialog(null, textoMenu);
                        switch (opcao) {
                            case "1":
                                pais.setNome(JOptionPane.showInputDialog(null, "Digite o nome do País"));
                                pais.setDdd(JOptionPane.showInputDialog(null, "Digite o DDI"));
                                break;
                            case "2":
                                estado.setNome(JOptionPane.showInputDialog(null, "Digite o nome do estado"));
                                estado.setCodIbge(JOptionPane.showInputDialog(null, "Código do IBGE do Estado"));
                                estado.setPais(pais);
                                break;
                            case "3":
                                cidade.setNome(JOptionPane.showInputDialog(null, "Nome da Cidade"));
                                cidade.setCodIbge(JOptionPane.showInputDialog(null, "Código IBGE de " + cidade.getNome()));
                                cidade.setEstado(estado);
                                break;
                            case "4":
                                endereco.setLogradouro(
                                        JOptionPane.showInputDialog(null, "Rua, Av., etc..."));
                                int numero = Integer.parseInt(
                                        JOptionPane.showInputDialog(null, "Número da residência"));
                                endereco.setNumero(numero);
                                endereco.setCep(JOptionPane.showInputDialog(null, "CEP do endereço"));
                                endereco.setComplemento(
                                        JOptionPane.showInputDialog(null, "Complemento do endereço"));
                                endereco.setCidade(cidade);
                                break;
                            case "5":
                                // Preencher dados de pessoa
                                pessoa.setNome(JOptionPane.showInputDialog(null, "Digite o nome: "));
                                pessoa.setCpf(JOptionPane.showInputDialog(null, "Digite o CPF: "));
                                pessoa.setRg(JOptionPane.showInputDialog(null, "Digite o RG: "));
                                pessoa.setEndereco(endereco);
                                break;

                            case "6":
                                JOptionPane.showMessageDialog(null, pessoa.toString());
                                break;
                            default:
                        }
                    } while (!opcao.equals("0"));
                    break;
                }
            } else {
                String opcao = "0";
                String textoMenu = "---- Menu ----- \n"
                        + "Digite o código da opção desejada:\n \n"
                        + "1 - Cadastrar País \n"
                        + "2 - Cadastrar Estado \n"
                        + "3 - Cadastrar Cidade \n"
                        + "4 - Cadastrar Endereço \n"
                        + "5 - Cadastrar Pessoa \n"
                        + "6 - Listar Pessoas \n"
                        + "0 - Sair";
                Pessoa pessoa = new Pessoa();
                Pais pais = new Pais();
                Estado estado = new Estado();
                Cidade cidade = new Cidade();
                Endereco endereco = new Endereco();

                do {
                    opcao = JOptionPane.showInputDialog(null, textoMenu);
                    switch (opcao) {
                        case "1":
                            pais.setNome(JOptionPane.showInputDialog(null, "Digite o nome do País"));
                            pais.setDdd(JOptionPane.showInputDialog(null, "Digite o DDI"));
                            break;
                        case "2":
                            estado.setNome(JOptionPane.showInputDialog(null, "Digite o nome do estado"));
                            estado.setCodIbge(JOptionPane.showInputDialog(null, "Código do IBGE do Estado"));
                            estado.setPais(pais);
                            break;
                        case "3":
                            cidade.setNome(JOptionPane.showInputDialog(null, "Nome da Cidade"));
                            cidade.setCodIbge(JOptionPane.showInputDialog(null, "Código IBGE de " + cidade.getNome()));
                            cidade.setEstado(estado);
                            break;
                        case "4":
                            endereco.setLogradouro(
                                    JOptionPane.showInputDialog(null, "Rua, Av., etc..."));
                            int numero = Integer.parseInt(
                                    JOptionPane.showInputDialog(null, "Número da residência"));
                            endereco.setNumero(numero);
                            endereco.setCep(JOptionPane.showInputDialog(null, "CEP do endereço"));
                            endereco.setComplemento(
                                    JOptionPane.showInputDialog(null, "Complemento do endereço"));
                            endereco.setCidade(cidade);
                            break;
                        case "5":
                            // Preencher dados de pessoa
                            pessoa.setNome(JOptionPane.showInputDialog(null, "Digite o nome: "));
                            pessoa.setCpf(JOptionPane.showInputDialog(null, "Digite o CPF: "));
                            pessoa.setRg(JOptionPane.showInputDialog(null, "Digite o RG: "));
                            pessoa.setEndereco(endereco);
                            break;

                        case "6":
                            JOptionPane.showMessageDialog(null, pessoa.toString());
                            break;
                        default:
                    }
                } while (!opcao.equals("0"));
                break;
            }
        }
    }
}
