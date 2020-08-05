package Calc.Controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import Calc.Model.Numbers;
import java.util.ArrayList;

public class Controller {

    private ArrayList<String> integer = new ArrayList<>();
    private ArrayList<String> operands = new ArrayList<>();

    private boolean lastOperand = false;
    private boolean oneDecimal = false;


    private String currentString = "";


    @FXML
    private JFXButton one, two, three, four, five, six, seven, eight, nine, zero;

    @FXML
    private JFXButton decimal;

    @FXML
    private JFXButton equal;

    @FXML
    private JFXButton clear;

    @FXML
    private JFXButton negate;

    @FXML
    private JFXButton modulus;

    @FXML
    private JFXButton division;

    @FXML
    private JFXButton multiply;

    @FXML
    private JFXButton subtract;

    @FXML
    private JFXButton add;

    @FXML
    private JFXTextField output;

    @FXML
    void handleAdd(ActionEvent event) {

        if(event.getSource().equals(add)){
            integer.add(currentString);
            operands.add("+");
            currentString = "";
            lastOperand = true;

        }
    }

    @FXML
    void handleClear(ActionEvent event) {
        integer.clear();
        operands.clear();
        lastOperand = false;
        oneDecimal = false;
        currentString = "";
        output.setText("");

    }

    @FXML
    void handleDivision(ActionEvent event) {

    }

    @FXML
    void handleEqual(ActionEvent event) {

    }

    @FXML
    void handleModulus(ActionEvent event) {

    }

    @FXML
    void handleMultiplication(ActionEvent event) {

    }

    @FXML
    void handleNegate(ActionEvent event) {

    }

    @FXML
    void handleNumbers(ActionEvent event) {

        if(event.getSource().equals(one)){ currentString = currentString + Numbers.ONE; }
        if(event.getSource().equals(two)){ currentString = currentString + Numbers.TWO;}
        if(event.getSource().equals(three)){ currentString = currentString + (Numbers.THREE);}
        if(event.getSource().equals(four)){currentString = currentString + (Numbers.FOUR);}
        if(event.getSource().equals(five)){ currentString = currentString + (Numbers.FIVE);}
        if(event.getSource().equals(six)){ currentString = currentString + (Numbers.SIX);}
        if(event.getSource().equals(seven)){ currentString = currentString + (Numbers.SEVEN);}
        if(event.getSource().equals(eight)){ currentString = currentString + (Numbers.EIGHT);}
        if(event.getSource().equals(nine)){ currentString = currentString + (Numbers.NINE);}
        if(event.getSource().equals(zero)){ currentString = currentString + (Numbers.ZERO);}

        output.setText(currentString);

    }

    @FXML
    void handlePoint(ActionEvent event) {
        if(event.getSource().equals(decimal)){
            output.setText(currentString);

        }

    }

    @FXML
    void handleSubtract(ActionEvent event) {

    }

}
