package dad.javafx.geofx.client;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import dad.javafx.geofx.cliente.json.Raiz;


public class IpApiService {
	
	public IpApiService() {
		Unirest.setObjectMapper(new UniresObjectMapper());
	}
	
	public Raiz listRaiz() throws IpApiServiceException {
		try {
		
			Raiz raiz = 
				Unirest
					.get("http://api.ipapi.com/check?access_key=4478862b0eb362c6a3bd0609d199da3b")
					.asObject(Raiz.class)
					.getBody();
			
			/*if (!raiz.isSuccess()) {
				throw new IpApiServiceException("Error retrieving breeds list");
			}*/
			return raiz;

		} catch (UnirestException e) {
			throw new IpApiServiceException(e);
		}
	}
	
	public Raiz listRaizIp(String ip) throws IpApiServiceException {
		try {
		
			Raiz raiz = 
				Unirest
					.get("http://api.ipapi.com/"+ip+"?access_key=4478862b0eb362c6a3bd0609d199da3b")
					.asObject(Raiz.class)
					.getBody();
			
			/*if (!raiz.isSuccess()) {
				throw new IpApiServiceException("Error retrieving breeds list");
			}*/
			return raiz;

		} catch (UnirestException e) {
			throw new IpApiServiceException(e);
		}
	}

}
