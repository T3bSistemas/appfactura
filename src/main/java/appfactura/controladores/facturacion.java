package appfactura.controladores;

import java.io.IOException;

import javax.mail.MessagingException;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping(path = "/t3b-facturacion")
public class facturacion {
	
	@GetMapping({"/",""})
	public String inicio() throws IOException, MessagingException{		 
		return "Facturacion T3B V1";
	}
	
}
