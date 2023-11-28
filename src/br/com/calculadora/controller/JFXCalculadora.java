package br.com.calculadora.controller;
import br.com.calculadora.model.Calculos;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class JFXCalculadora {
    public TextField tfNum1;
    public Button btnCalcular;
    public TextField tfNum2;
    public TextField tfResultado;

    Calculos calculos = new Calculos();

// Função responsavel por executar a soma

    public void calcular(ActionEvent actionEvent) {
        double n1 = Double.parseDouble(tfNum1.getText());
        double n2 = Double.parseDouble(tfNum2.getText());
        tfResultado.setText(String.valueOf(calculos.somar(n1, n2)));
    }
}
