
package com.example.consumingwebservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.example.consumingwebservice.wsdl.EstadoRequest;
import com.example.consumingwebservice.wsdl.EstadoResponse;

public class CountryClient extends WebServiceGatewaySupport {

	private static final Logger log = LoggerFactory.getLogger(CountryClient.class);

	public EstadoResponse getEstado(String estado) {

		EstadoRequest request = new EstadoRequest();
		request.setNumeroDeVuelo(estado);

		log.info("Requesting location for " + estado);

		EstadoResponse response = (EstadoResponse) getWebServiceTemplate()
				.marshalSendAndReceive("http://localhost:8080/ws/vuelos", request,
						new SoapActionCallback(
								"http://airopuerto.com/vuelos/EstadoRequest"));

		return response;
	}

}
