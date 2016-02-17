package cl.citymovil.route_pro.message_listener.controllers;

import java.util.Scanner;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/test.htm")
public class TestGoogle {
	
	 public void onSubmit()
	    {
		   System.out.println ("Empezamos el programa");
	        System.out.println ("Por favor introduzca una cadena por teclado:");
	        String entradaTeclado = "";
	        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
	        entradaTeclado = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner
	        System.out.println ("Entrada recibida por teclado es: \"" + entradaTeclado +"\"");
	    }

}
