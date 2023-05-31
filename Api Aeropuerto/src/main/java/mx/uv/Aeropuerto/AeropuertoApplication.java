package mx.uv.Aeropuerto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@SpringBootApplication
public class AeropuertoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AeropuertoApplication.class, args);
	}
	//curl -X GET localhost:8080/
	@GetMapping("/")
	public String returnRoot(){
		return "Esta es la raiz";
	}

	@GetMapping(value="/aeropuerto")
	public String getMethodName(@RequestParam String param) {
		return "aeropuerto 1";
	}


}
