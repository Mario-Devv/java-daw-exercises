package com.example.concesionario_oltra;

import com.example.concesionario_oltra.Regex.Validaciones;
import com.example.concesionario_oltra.modelo.*;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.text.Text;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ConcesionarioC {
    Alert alertasErr = new Alert(Alert.AlertType.ERROR);
    @FXML
    private TextField txtID;
    @FXML
    private DatePicker slcDate;
    @FXML
    private TextField txtPotenciaCombinada;
    @FXML
    private Button btnBorrar;
    @FXML
    private TextField txtModelo;
    @FXML
    private Button btnAdd;
    @FXML
    private ChoiceBox desplegableVol;
    @FXML
    private ToggleGroup gTipo;
    @FXML
    private TextField txtPotencia;
    @FXML
    private TextArea txtAreaResultado;
    @FXML
    private TextField txtMarca;
    @FXML
    private Button btnReset;
    @FXML
    private Text txtProvincia;
    @FXML
    private Text txtTitulo;

    @FXML
    protected void onHelloButtonClick() {

    }

    @FXML
    public void initialize(){
        VehiculoElectrificado nuevoVehiculo;
        /*--- Iniciamos app con concesionario ---*/
        //Instanciamos con unos valores fijos
        Concesionario miConcesionario = new Concesionario("Concesionario Oltra", "Beniel/Murcia",100);

        String nombreConcesionario = miConcesionario.getNombre();
        String provinciaConcesionario = miConcesionario.getLocalizacion();

        txtTitulo.setText(nombreConcesionario);
        txtProvincia.setText(provinciaConcesionario);

        /*--- Fin concesionario*/

        desplegableVol.getItems().addAll("12V", "48V");

        gTipo.selectedToggleProperty().addListener((observable, old, newTo) -> {
            if(newTo != null){
                RadioButton selected = (RadioButton) newTo;
                if(selected.getText().equals("EV")){
                    desplegableVol.setDisable(true);
                } else {
                    desplegableVol.setDisable(false);
                }
            }
        });

        txtID.setText(Integer.toString(VehiculoElectrificado.getIdPropio()+ 1));
    }


    @Deprecated
    public void onClick(ActionEvent actionEvent) {
    }

    @FXML
    public void onClickTest(ActionEvent actionEvent) {
        System.out.println("Epa que ha pasado rey?");
    }

    @FXML
    public void addVehículo(ActionEvent actionEvent) {
        /*----Control de errores----*/
        Alert alertasErr = new Alert(Alert.AlertType.ERROR);

        /*Creamos variable error en la cual vamos a añadir los valores
        * a ese objeto static validar() */
        String error = Validaciones.validar(
                txtMarca.getText(),
                txtModelo.getText(),
                slcDate.getValue(),
                gTipo.getSelectedToggle(),
                (String) desplegableVol.getValue(),
                txtPotencia.getText(),
                txtPotenciaCombinada.getText()
        );

        /*En caso de que sea diferente a null crearemos la alerta
        * Si est null es que no hay nada raro y el programa creará
        * el objeto*/
        if(error != null){
            alertasErr.setContentText(error);
            alertasErr.showAndWait();
        }

        /*---- Fin control de errores ----*/

        /*---- Creación de vehículos ----*/
        //Miramos primero que tipo de vehículo estamos creando
        RadioButton tipoSeleccionado = (RadioButton) gTipo.getSelectedToggle();
        String tipo = tipoSeleccionado.getText();

        /*--- Formateo de la fecha para la salida del dataPicker ---*/
        LocalDate localDate = slcDate.getValue();
        String patterDate = "dd/MM/YYYY";
        String datePattern = localDate.format(DateTimeFormatter.ofPattern(patterDate));
        /*--- FIN formateo de la fecha ---*/

        /*--- Formatear voltios ---*/
        String valueSelected = (String) desplegableVol.getValue();
        String replaceV = valueSelected.replace("V", "");

        int valueClear = Integer.parseInt(replaceV);


        VehiculoElectrificado nuevoVehiculo;
        if(tipo.equals("HEV")){
            nuevoVehiculo = new HEV(txtMarca.getText(), txtModelo.getText(), slcDate.getValue().getYear(), TipoEV.HEV, valueClear);
            txtID.setText(Integer.toString(VehiculoElectrificado.getIdPropio() + 1));
            txtAreaResultado.appendText( "Fecha matriculación="+datePattern+","+ String.valueOf(nuevoVehiculo)+ "\n");
        } else if (tipo.equals("EV")){
            nuevoVehiculo = new EV(txtMarca.getText(), txtModelo.getText(), slcDate.getValue().getYear(), TipoEV.HEV, Integer.parseInt(txtPotencia.getText()));
            txtID.setText(Integer.toString(VehiculoElectrificado.getIdPropio() + 1));
            txtAreaResultado.appendText( "Fecha matriculación="+datePattern+","+ String.valueOf(nuevoVehiculo)+ "\n");
        }


        /*---- Fin creación de vehículos ----*/
    }
}
