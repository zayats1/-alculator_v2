package sample;

import static java.lang.Math.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField FN;
    @FXML
    private TextField SN;
    @FXML
    private TextField EQUALS;
    @FXML
    public TextField SINGLE;
    @FXML
    private TextField SIN;
    @FXML
    private TextField COS;
    @FXML
    private TextField TG;
    @FXML
    private TextField CTG;
      @FXML
      private Button SQRT;
      @FXML
      private Button DIV;
      @FXML
      private Button POW;
      @FXML
      private Button MID;
      @FXML
      private Button CLEAR;
      @FXML
      private Button PROD;
      @FXML
      private Button PERCENT;
      @FXML
      private Button TRIG;
      @FXML
      private Button SUM;
      @FXML
      private Button SUBS;

//I didn't use var, because i want that Calculator works with java8

    public void SQRT(ActionEvent actionEvent) {
        try{
            String read = SINGLE.getText();
            double a = Double.parseDouble(read);
            String sq = String.valueOf(sqrt(a));
            SIN.setText(sq);
            COS.setText("");
            TG.setText("");
            CTG.setText("");
          } catch(NumberFormatException e){        // if field hasn't number
            SIN.setText("Enter the number");
            COS.setText("");
            TG.setText("");
            CTG.setText("");
        }
    }

    public void DIV(ActionEvent actionEvent) {
        try{
            String readF = FN.getText();
            double g = Double.parseDouble(readF);
            String readS = SN.getText();
            double d = Double.parseDouble(readS);
            String diversant = String.valueOf(g/d);    //"feature"
            EQUALS.setText(diversant);

          } catch(NumberFormatException e){
            EQUALS.setText("Enter the numbers");
        }
    }

    public void POW(ActionEvent actionEvent) {
        try{
            String readF = FN.getText();
            String readS = SN.getText();
            double a = Double.parseDouble(readF);
            double b = Double.parseDouble(readS);
            String pow = String.valueOf(pow(a,b));
            EQUALS.setText(pow);
          } catch(NumberFormatException e){
            EQUALS.setText("Enter the number");
        }
    }

    public void MID(ActionEvent actionEvent) {
        try{
            String readF = FN.getText();
            double g = Double.parseDouble(readF);
            String readS = SN.getText();
            double d = Double.parseDouble(readS);
            String tmp = String.valueOf((g+d)/2);
            EQUALS.setText(tmp);

        } catch(NumberFormatException e){
            EQUALS.setText("Enter the numbers");
        }
    }

    public void CLEAR(ActionEvent actionEvent) {
        FN.setText("");
        SN.setText("");
        EQUALS.setText("");
        SINGLE.setText("");
        SIN.setText("");
        COS.setText("");
        TG.setText("");
        CTG.setText("");
    }

    public void PROD(ActionEvent actionEvent) {
        try{
            String readF = FN.getText();
            double g = Double.parseDouble(readF);
            String readS = SN.getText();
            double d = Double.parseDouble(readS);
            String tmp = String.valueOf(g*d);
            EQUALS.setText(tmp);

        } catch(NumberFormatException e){
            EQUALS.setText("Enter the numbers");
        }
    }

    public void PERCENT(ActionEvent actionEvent) {
        try{
            String readF = FN.getText();
            double g = Double.parseDouble(readF);
            String readS = SN.getText();
            double d = Double.parseDouble(readS);
            String tmp = String.valueOf((g/d)*100);
            EQUALS.setText(tmp + "%");

        } catch(NumberFormatException e){
            EQUALS.setText("Enter the numbers");
        }
    }

    public void TRIG(ActionEvent actionEvent) {
        try{
            String read = SINGLE.getText();
            double a = Double.parseDouble(read);
            double j = Math.toRadians(a);
            double sin = sin(j);
            double cos = cos(j);
            double tg  = tan(j);
        //  double ctg = 1/tg;
            String ss   = String.valueOf(sin);
            String sc   = String.valueOf(cos);
            String st   = String.valueOf(tg);
            String sct  = String.valueOf(1/tg); //ctg
            SIN.setText("sin="+ss);
            COS.setText("cos="+sc);
            TG.setText("tg="+st);
            CTG.setText("ctg="+sct);
        } catch(NumberFormatException e){
            SIN.setText("Enter the number");
            COS.setText("");
            TG.setText("");
            CTG.setText("");
        }
    }

    public void SUM(ActionEvent actionEvent) {
        try{
            String readF = FN.getText();
            double g = Double.parseDouble(readF);
            String readS = SN.getText();
            double d = Double.parseDouble(readS);
            String tmp = String.valueOf(g+d);
            EQUALS.setText(tmp);

        } catch(NumberFormatException e){
            EQUALS.setText("Enter the numbers");
        }
    }

    public void SUBS(ActionEvent actionEvent) {
        try{
            String readF = FN.getText();
            double g = Double.parseDouble(readF);
            String readS = SN.getText();
            double d = Double.parseDouble(readS);
            String tmp = String.valueOf(g-d);
            EQUALS.setText(tmp);

        } catch(NumberFormatException e){
            EQUALS.setText("Enter the numbers");
        }
    }
}
