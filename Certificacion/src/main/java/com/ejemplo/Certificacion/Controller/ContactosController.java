package com.ejemplo.Certificacion.Controller;

import com.ejemplo.Certificacion.Model.ContactosModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ContactosController {
    private static List<ContactosModel> contactos = new ArrayList<>();

    @GetMapping("/Contactos")
    public String listarContactos(Model model) {
        model.addAttribute("contactos", contactos);
        return "Contactos";
    }

    @PostMapping("/guardarContacto")
    public String guardarContacto(@RequestParam String nombre_Contacto,
                                  @RequestParam String apellido_Contacto,
                                  @RequestParam String Apodo_Contacto,
                                  @RequestParam String telefono_Contacto,
                                  @RequestParam String email_Contacto,
                                  @RequestParam String direccion_Contacto) {
        ContactosModel contacto = new ContactosModel(nombre_Contacto, apellido_Contacto, Apodo_Contacto, telefono_Contacto, email_Contacto, direccion_Contacto);
        contactos.add(contacto);
        return "redirect:/Contactos"; // Redirigir de nuevo al formulario
    }

    @PostMapping("/eliminarContacto")
    public String eliminarContacto(@RequestParam int index) {
        if (index >= 0 && index < contactos.size()) {
            contactos.remove(index);
        }
        return "redirect:/Contactos"; // Redirigir de nuevo al listado de contactos
    }

    @PostMapping("/actualizarContacto")
    public String actualizarContacto(@RequestParam int index,
                                     @RequestParam String nombre_Contacto,
                                     @RequestParam String apellido_Contacto,
                                     @RequestParam String Apodo_Contacto,
                                     @RequestParam String telefono_Contacto,
                                     @RequestParam String email_Contacto,
                                     @RequestParam String direccion_Contacto) {
        if (index >= 0 && index < contactos.size()) {
            ContactosModel contacto = contactos.get(index);
            contacto.setNombre_Contacto(nombre_Contacto);
            contacto.setApellido_Contacto(apellido_Contacto);
            contacto.setApodo_Contacto(Apodo_Contacto);
            contacto.setTelefono_Contacto(telefono_Contacto);
            contacto.setEmail_Contacto(email_Contacto);
            contacto.setDireccion_Contacto(direccion_Contacto);
        }
        return "redirect:/Contactos"; // Redirigir de nuevo al listado de contactos
    }
}
