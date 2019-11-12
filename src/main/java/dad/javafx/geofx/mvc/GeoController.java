package dad.javafx.geofx.mvc;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.javafx.geofx.client.IpApiService;
import dad.javafx.geofx.client.IpApiServiceException;
import dad.javafx.geofx.cliente.json.Raiz;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public class GeoController implements Initializable {
	
	private GeoModel model = new GeoModel();
	
    @FXML
    private BorderPane view;

    @FXML
    private TextField ipText;

    @FXML
    private Button checkButton;

    @FXML
    private Label latitudLabel;

    @FXML
    private Label longitudLabel;

    @FXML
    private Label paisLabel;

    @FXML
    private ImageView paisImg;

    @FXML
    private Label ciudadLabel;

    @FXML
    private Label zipLabel;

    @FXML
    private Label lenguajeLabel;

    @FXML
    private Label timeZonaLabel;

    @FXML
    private Label callingLabel;

    @FXML
    private Label currencyLabel;

    @FXML
    private Label ipAddressLabel;

    @FXML
    private Label ipsLabel;

    @FXML
    private Label typeLabel;

    @FXML
    private Label asnLabel;

    @FXML
    private Label hostLabel;

    @FXML
    private CheckBox proxyCheck;

    @FXML
    private Label safeLabel;

    @FXML
    private CheckBox crawlerLabel;

    @FXML
    private Label threatLabel;

    @FXML
    private Label potentialLabel;

    @FXML
    private CheckBox torLabel;


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ipText.textProperty().bindBidirectional(model.ipProperty());
		latitudLabel.textProperty().bind(model.latitudProperty());
		longitudLabel.textProperty().bind(model.longitudProperty());
		paisLabel.textProperty().bind(model.paisProperty());
		ciudadLabel.textProperty().bind(model.ciudadProperty());
		zipLabel.textProperty().bind(model.zipProperty());
		lenguajeLabel.textProperty().bind(model.lenguajeProperty());;
		timeZonaLabel.textProperty().bind(model.timeZonaProperty());;
		callingLabel.textProperty().bind(model.callingProperty());
		currencyLabel.textProperty().bind(model.currencyProperty());
		ipAddressLabel.textProperty().bind(model.ipAdressProperty());
		ipsLabel.textProperty().bind(model.ipsProperty());
		typeLabel.textProperty().bind(model.typeProperty());
		asnLabel.textProperty().bind(model.asnProperty());
		hostLabel.textProperty().bind(model.hostProperty());
		proxyCheck.selectedProperty().bind(model.proxyProperty());
		safeLabel.textProperty().bind(model.safeProperty());
		crawlerLabel.selectedProperty().bind(model.crawlerProperty());
		threatLabel.textProperty().bind(model.threatProperty());
		potentialLabel.textProperty().bind(model.potentialProperty());
		torLabel.selectedProperty().bind(model.torProperty());
		actualizar("check");
	}
	
	
	public GeoController() throws IOException, IpApiServiceException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/GeoView.fxml"));
		loader.setController(this);
		loader.load();
	}
	
	private void actualizar(String ip) {
		IpApiService servicio = new IpApiService();
		try {
			Raiz raiz = servicio.listRaizIp(ip);
			model.setIp(raiz.getIp());
			model.setLongitud("" + raiz.getLongitude());
			model.setLatitud("" + raiz.getLatitude());
			model.setPais(raiz.getCountryName() + " (" + raiz.getCountryCode() + ")");
			Image img = new Image("https://raw.githubusercontent.com/dam-dad/Flags/master/64/"+raiz.getCountryCode()+".png");
			paisImg.setImage(img);
			model.setCiudad(raiz.getCity()+ " (" +raiz.getRegionName()+ ")");
			model.setZip(raiz.getZip());
			model.setLenguaje("" + raiz.getLocation().getLanguages().get(0).getName());
			model.setTimeZona("" + raiz.getTimeZone());
			model.setCalling(raiz.getLocation().getCallingCode());
			model.setCurrency("" + raiz.getCurrency());
			model.setIpAdress(raiz.getIp());
			//model.setIps(raiz.getConnection().getIsp());
			model.setType(raiz.getType());
			//model.setAsn("" + raiz.getConnection().getAsn());
			model.setHost(raiz.getHostname());
			//model.setProxy(raiz.getSecurity().getIsProxy());
		} catch (IpApiServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
    @FXML
    void onCheckAction(ActionEvent event) throws IpApiServiceException {
    	actualizar(model.getIp());
    }
	
    public BorderPane getView() {
		return view;
	}

}
