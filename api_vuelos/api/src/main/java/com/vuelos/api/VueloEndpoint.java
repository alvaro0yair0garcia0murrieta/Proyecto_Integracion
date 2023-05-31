package com.vuelos.api;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.airopuerto.vuelos.EstadoRequest;
import com.airopuerto.vuelos.EstadoResponse;
import com.airopuerto.vuelos.ReservaRequest;
import com.airopuerto.vuelos.ReservaResponse;

@Endpoint
public class VueloEndpoint {
private final String URI="http://airopuerto.com/vuelos";
protected String[] myArray = new String[10];


@Autowired
private Repositorio repositorio;

@PayloadRoot (localPart="EstadoRequest", namespace=URI)
@ResponsePayload
    public  EstadoResponse Buscar(@RequestPayload EstadoRequest estado){
        EstadoResponse respuesta = new  EstadoResponse();

        List<Vuelo> saludos = new ArrayList<>();
        repositorio.findAll().forEach(saludos::add);
        
        for ( Vuelo saludador : saludos) {
            if(saludador.getNumero()== Integer.parseInt(estado.getNumeroDeVuelo())){
                respuesta.setEstado("hola "+saludador.getPasagero()+" actualmente tiene esta con la compañia  " +saludador.getCompania());
                return respuesta;
            }
        }
        respuesta.setEstado("error numero no registrado");
        return respuesta;
    }

 @PayloadRoot(namespace = URI, localPart = "ReservaRequest")
@ResponsePayload
private ReservaResponse reservaResponse(@RequestPayload ReservaRequest reservaRequest){
    ReservaResponse reservaResponse = new ReservaResponse();
    Vuelo vuelo = new Vuelo(reservaRequest.getCompaniaDeVuelo(),reservaRequest.getNombrePasajero());
    repositorio.save(vuelo);
    reservaResponse.setConfirmacionNumero("gracias, su id de vuelo es: "+vuelo.getNumero());
    return reservaResponse;
}

public boolean estaVacia(String[] array, int posicion){
    return array[posicion] == null;
}


}
