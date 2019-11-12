package dad.javafx.geofx.mvc;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class GeoModel {
	private StringProperty ip = new SimpleStringProperty();
	private StringProperty latitud = new SimpleStringProperty();
	private StringProperty longitud = new SimpleStringProperty();
	private StringProperty pais = new SimpleStringProperty();
	private StringProperty ciudad = new SimpleStringProperty();
	private StringProperty zip = new SimpleStringProperty();
	private StringProperty lenguaje = new SimpleStringProperty();
	private StringProperty timeZona = new SimpleStringProperty();
	private StringProperty calling = new SimpleStringProperty();
	private StringProperty currency = new SimpleStringProperty();
	private StringProperty ipAdress = new SimpleStringProperty();
	private StringProperty ips = new SimpleStringProperty();
	private StringProperty type = new SimpleStringProperty();
	private StringProperty asn = new SimpleStringProperty();
	private StringProperty host = new SimpleStringProperty();
	private StringProperty safe = new SimpleStringProperty();
	private StringProperty threat = new SimpleStringProperty();
	private StringProperty potential = new SimpleStringProperty();
	private BooleanProperty proxy = new SimpleBooleanProperty();
	private BooleanProperty crawler = new SimpleBooleanProperty();
	private BooleanProperty tor = new SimpleBooleanProperty();
	
	public final StringProperty ipProperty() {
		return this.ip;
	}
	
	public final String getIp() {
		return this.ipProperty().get();
	}
	
	public final void setIp(final String ip) {
		this.ipProperty().set(ip);
	}
	
	public final StringProperty latitudProperty() {
		return this.latitud;
	}
	
	public final String getLatitud() {
		return this.latitudProperty().get();
	}
	
	public final void setLatitud(final String latitud) {
		this.latitudProperty().set(latitud);
	}
	
	public final StringProperty longitudProperty() {
		return this.longitud;
	}
	
	public final String getLongitud() {
		return this.longitudProperty().get();
	}
	
	public final void setLongitud(final String longitud) {
		this.longitudProperty().set(longitud);
	}
	
	public final StringProperty paisProperty() {
		return this.pais;
	}
	
	public final String getPais() {
		return this.paisProperty().get();
	}
	
	public final void setPais(final String pais) {
		this.paisProperty().set(pais);
	}
	
	public final StringProperty ciudadProperty() {
		return this.ciudad;
	}
	
	public final String getCiudad() {
		return this.ciudadProperty().get();
	}
	
	public final void setCiudad(final String ciudad) {
		this.ciudadProperty().set(ciudad);
	}
	
	public final StringProperty zipProperty() {
		return this.zip;
	}
	
	public final String getZip() {
		return this.zipProperty().get();
	}
	
	public final void setZip(final String zip) {
		this.zipProperty().set(zip);
	}
	
	public final StringProperty lenguajeProperty() {
		return this.lenguaje;
	}
	
	public final String getLenguaje() {
		return this.lenguajeProperty().get();
	}
	
	public final void setLenguaje(final String lenguaje) {
		this.lenguajeProperty().set(lenguaje);
	}
	
	public final StringProperty timeZonaProperty() {
		return this.timeZona;
	}
	
	public final String getTimeZona() {
		return this.timeZonaProperty().get();
	}
	
	public final void setTimeZona(final String timeZona) {
		this.timeZonaProperty().set(timeZona);
	}
	
	public final StringProperty callingProperty() {
		return this.calling;
	}
	
	public final String getCalling() {
		return this.callingProperty().get();
	}
	
	public final void setCalling(final String calling) {
		this.callingProperty().set(calling);
	}
	
	public final StringProperty currencyProperty() {
		return this.currency;
	}
	
	public final String getCurrency() {
		return this.currencyProperty().get();
	}
	
	public final void setCurrency(final String currency) {
		this.currencyProperty().set(currency);
	}
	
	public final StringProperty ipAdressProperty() {
		return this.ipAdress;
	}
	
	public final String getIpAdress() {
		return this.ipAdressProperty().get();
	}
	
	public final void setIpAdress(final String ipAdress) {
		this.ipAdressProperty().set(ipAdress);
	}
	
	public final StringProperty ipsProperty() {
		return this.ips;
	}
	
	public final String getIps() {
		return this.ipsProperty().get();
	}
	
	public final void setIps(final String ips) {
		this.ipsProperty().set(ips);
	}
	
	public final StringProperty typeProperty() {
		return this.type;
	}
	
	public final String getType() {
		return this.typeProperty().get();
	}
	
	public final void setType(final String type) {
		this.typeProperty().set(type);
	}
	
	public final StringProperty asnProperty() {
		return this.asn;
	}
	
	public final String getAsn() {
		return this.asnProperty().get();
	}
	
	public final void setAsn(final String asn) {
		this.asnProperty().set(asn);
	}
	
	public final StringProperty hostProperty() {
		return this.host;
	}
	
	public final String getHost() {
		return this.hostProperty().get();
	}
	
	public final void setHost(final String host) {
		this.hostProperty().set(host);
	}
	
	public final StringProperty safeProperty() {
		return this.safe;
	}
	
	public final String getSafe() {
		return this.safeProperty().get();
	}
	
	public final void setSafe(final String safe) {
		this.safeProperty().set(safe);
	}
	
	public final StringProperty threatProperty() {
		return this.threat;
	}
	
	public final String getThreat() {
		return this.threatProperty().get();
	}
	
	public final void setThreat(final String threat) {
		this.threatProperty().set(threat);
	}
	
	public final StringProperty potentialProperty() {
		return this.potential;
	}
	
	public final String getPotential() {
		return this.potentialProperty().get();
	}
	
	public final void setPotential(final String potential) {
		this.potentialProperty().set(potential);
	}
	
	public final BooleanProperty proxyProperty() {
		return this.proxy;
	}
	
	public final boolean isProxy() {
		return this.proxyProperty().get();
	}
	
	public final void setProxy(final boolean proxy) {
		this.proxyProperty().set(proxy);
	}
	
	public final BooleanProperty crawlerProperty() {
		return this.crawler;
	}
	
	public final boolean isCrawler() {
		return this.crawlerProperty().get();
	}
	
	public final void setCrawler(final boolean crawler) {
		this.crawlerProperty().set(crawler);
	}
	
	public final BooleanProperty torProperty() {
		return this.tor;
	}
	
	public final boolean isTor() {
		return this.torProperty().get();
	}
	
	public final void setTor(final boolean tor) {
		this.torProperty().set(tor);
	}
	
	
}
