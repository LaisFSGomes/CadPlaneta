package cadplaneta;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 *
 * @author Lais Gomes
 */


public class FXMLcadplanetaController {

    int i = 0;

    @FXML
    private TextArea txtSaida;

    @FXML
    private Label lbControle;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtRegiao;

    @FXML
    private TextField txtGalaxia;

    @FXML
    private TextField txtSetor;

    @FXML
    private TextField txtLuas;

    @FXML
    private TextField txtOrbita;

    @FXML
    private TextField txtSistema;

    @FXML
    private TextField txtDiametro;

    @FXML
    private TextField txtTerreno;

    @FXML
    private TextField txtCor;
    
     @FXML
    private TextField txtDist;
     
    @FXML
    private TextField txtPopulacao;

    @FXML
    private TextField txtForca;

    @FXML
    private TextField txtEspecies;

    @FXML
    private TextField txtFiliacao;

    @FXML
    private TextArea txtInformacoesAdd;
    
    //ArrayList do planetas
    ArrayList<Planeta> lista = new ArrayList();

    @FXML
    void clickCadastrar(ActionEvent event) {

        //vendo se algum campo está vazio
        if ("".equals(txtNome.getText()) || "".equals(txtRegiao.getText()) || "".equals(txtGalaxia.getText())
                || "".equals(txtSetor.getText()) || "".equals(txtLuas.getText()) || "".equals(txtOrbita.getText())
                || "".equals(txtSistema.getText()) || "".equals(txtDiametro.getText()) || "".equals(txtTerreno.getText())
                || "".equals(txtCor.getText()) || "".equals(txtDist.getText()) ||  "".equals(txtPopulacao.getText())
                || "".equals(txtForca.getText()) || "".equals(txtEspecies.getText()) || "".equals(txtFiliacao.getText())) {
            JOptionPane.showMessageDialog(null, "Por favor, Preencha todos os campos!");

        } else {
            //instanciando
            Planeta p = new Planeta(txtNome.getText(), txtRegiao.getText(), txtSetor.getText(), txtOrbita.getText(), txtSistema.getText(),
                    txtTerreno.getText(), txtCor.getText(), txtDist.getText() , txtForca.getText(), txtEspecies.getText(), txtFiliacao.getText(),
                    txtGalaxia.getText(), txtInformacoesAdd.getText(), txtLuas.getText(), txtPopulacao.getText(), txtDiametro.getText());
            
            lista.add(p);   //adicionando na lista
            txtSaida.setText(p.toString());     //exibindo na tela
            lbControle.setText(Integer.toString(lista.size()));  //"" foi colocado para ser visto como String
            i = lista.size() - 1;   //posição do ultimo elemento
        }

    }

    @FXML
    void clickAnterior(ActionEvent event) {
        i = i - 1;
        if (i < 0) { //chegou no primeiro elemento e está tentando retroceder mais
            JOptionPane.showMessageDialog(null, "Inicio da lista");
            i = 0;
        }else {
            //escrevendo na tela as informações da lissta
            txtSaida.setText(lista.get(i) + "");
            txtNome.setText(lista.get(i).getNome());
            txtRegiao.setText(lista.get(i).getRegiao());
            txtGalaxia.setText(lista.get(i).getGalaxia());
            txtOrbita.setText(lista.get(i).getOrbita());
            txtSistema.setText(lista.get(i).getSistema());
            txtLuas.setText(lista.get(i).getLuas());
            txtSetor.setText(lista.get(i).getSetor());
            txtDiametro.setText(lista.get(i).getDiamentro());
            txtTerreno.setText(lista.get(i).getTerreno());
            txtCor.setText(lista.get(i).getCorPredominante());
            txtDist.setText(lista.get(i).getDistancia());
            txtPopulacao.setText(lista.get(i).getPopulacao());
            txtForca.setText(lista.get(i).getForca());
            txtEspecies.setText(lista.get(i).getEspecies());
            txtFiliacao.setText(lista.get(i).getFiliacao());
            txtInformacoesAdd.setText(lista.get(i).getInfoAdd());

        }

    }

    @FXML
    void clickProximo(ActionEvent event) {
        i = i + 1;
        if (i == lista.size()) {
            i = lista.size() - 1;
            JOptionPane.showMessageDialog(null, "Final da Lista");
        }
 
        if (i >= 0) {

            txtSaida.setText(lista.get(i) + "");
            txtNome.setText(lista.get(i).getNome());
            txtRegiao.setText(lista.get(i).getRegiao());
            txtGalaxia.setText(lista.get(i).getGalaxia());
            txtOrbita.setText(lista.get(i).getOrbita());
            txtSistema.setText(lista.get(i).getSistema());
            txtLuas.setText(lista.get(i).getLuas());
            txtSetor.setText(lista.get(i).getSetor());
            txtDiametro.setText(lista.get(i).getDiamentro());
            txtTerreno.setText(lista.get(i).getTerreno());
            txtCor.setText(lista.get(i).getCorPredominante());
            txtDist.setText(lista.get(i).getDistancia());
            txtPopulacao.setText(lista.get(i).getPopulacao());
            txtForca.setText(lista.get(i).getForca());
            txtEspecies.setText(lista.get(i).getEspecies());
            txtFiliacao.setText(lista.get(i).getFiliacao());
            txtInformacoesAdd.setText(lista.get(i).getInfoAdd());
        }
    }

    @FXML
    void clickEditar(ActionEvent event) {
        //verificando se tem algum campo vazio
        if ("".equals(txtNome.getText()) || "".equals(txtRegiao.getText()) || "".equals(txtGalaxia.getText())
                || "".equals(txtSetor.getText()) || "".equals(txtLuas.getText()) || "".equals(txtOrbita.getText())
                || "".equals(txtSistema.getText()) || "".equals(txtDiametro.getText()) || "".equals(txtTerreno.getText())
                || "".equals(txtCor.getText()) || "".equals(txtDist.getText()) ||  "".equals(txtPopulacao.getText())
                || "".equals(txtForca.getText()) || "".equals(txtEspecies.getText()) || "".equals(txtFiliacao.getText())) {
            
            JOptionPane.showMessageDialog(null, "Por favor, Preencha todos os campos!");

        } else {
            //colocando todas as informações da tela na posição i da lista
            Planeta p = new Planeta(txtNome.getText(), txtRegiao.getText(), txtSetor.getText(), txtOrbita.getText(), txtSistema.getText(),
                    txtTerreno.getText(), txtCor.getText(), txtDist.getText() , txtForca.getText(), txtEspecies.getText(), txtFiliacao.getText(),
                    txtGalaxia.getText(), txtInformacoesAdd.getText(), txtLuas.getText(), txtPopulacao.getText(), txtDiametro.getText());
            lista.set(i, p);
            txtSaida.setText(p.toString());

        }
    }

    @FXML
    void clickExcluir(ActionEvent event) {
        if (i >= 0 && i < lista.size()) {
            lista.remove(i);
            txtNome.clear();
            txtRegiao.clear();
            txtSetor.clear();
            txtOrbita.clear();
            txtSistema.clear();
            txtTerreno.clear();
            txtCor.clear();
            txtDist.clear();
            txtForca.clear();
            txtEspecies.clear();
            txtFiliacao.clear();
            txtGalaxia.clear();
            txtInformacoesAdd.clear();
            txtLuas.clear();
            txtPopulacao.clear();
            txtDiametro.clear();
            txtSaida.clear();
        }
        if(lista.isEmpty()){
            JOptionPane.showMessageDialog(null, "Lista vazia!");
        }
        lbControle.setText(Integer.toString(lista.size()));
    }

    @FXML
    void clickGerarPDF(ActionEvent event) {
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Você ainda nao cadastrou nenhum planeta!");
        } else {
            int aux;
            String info;
            Document documento = new Document();
            try {
                PdfWriter.getInstance(documento, new FileOutputStream("C:\\Users\\Lais Gomes\\Downloads\\ListaPlanetas.pdf"));

                documento.open();
                Paragraph parag = new Paragraph("Lista de Planetas");
                parag.add("");
                parag.add("");
                parag.setAlignment(1); //ficar centralizado
                documento.add(parag);
                parag = new Paragraph("");
                documento.add(parag);

                for (aux = 0; aux < lista.size(); aux++) {
                    info = lista.get(aux) + "\n---------------------------------\n";
                    parag.add(info);
                    parag.add("");
                }
                documento.add(parag);
                JOptionPane.showMessageDialog(null, "PDF gerado!");

            } catch (FileNotFoundException | DocumentException ex) {    //excesão para arquivo ou caminho nao encontrado
                JOptionPane.showMessageDialog(null, "Desculpe, mas algo deu errado.\n"
                        + "Erro: " + ex);
            } finally {
                documento.close();
            }
        }
    }
}