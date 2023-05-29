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
import com.vuelos.api.Repositorio;
import com.vuelos.api.Vuelo;

@Endpoint
public class VueloEndpoint {
private final String URI="http://airopuerto.com/vuelos";

@Autowired
private Repositorio repositorio;
@PayloadRoot(namespace = URI, localPart = "EstadoRequest")
@ResponsePayload
 public EstadoResponse estadoResponse(@RequestPayload EstadoRequest requesta){
    EstadoResponse estadoResponse = new EstadoResponse();
    List<Vuelo> saludos = new ArrayList<>();
    repositorio.findAll().forEach(saludos::add);

    for ( Vuelo saludador : saludos) {
        if(saludador.getNumero()== requesta.getNumeroDeVuelo()){
            estadoResponse.setEstado(saludador.toString());
            return estadoResponse;
        }
    }
    estadoResponse.setEstado("no se encontro");
    /*
    if(!estaVacia(myArray,posicion.getPosicion())){
        respuesta.setRespuesta("Hola " + myArray[posicion.getPosicion()].toString() + ", mucho gusto");
    }else{
        respuesta.setRespuesta("No se encontro");    
    }*/
    return estadoResponse;
 }

 @PayloadRoot(namespace = URI, localPart = "ReservaRequest")
@ResponsePayload
private ReservaResponse reservaResponse(@RequestPayload ReservaRequest reservaRequest){
    ReservaResponse reservaResponse = new ReservaResponse();
    Vuelo vuelo = new Vuelo(reservaRequest.getCompaniaDeVuelo(),reservaRequest.getNombrePasajero());
    reservaResponse.setConfirmacionNumero("gracias, su id de vurlo es: "+vuelo.getNumero());
    return reservaResponse;
}
}
