

package com.ggwlot.scnd;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 *
 * @author T107
 */

    
   @Controller
@RequestMapping(value="/resultados")
public class ControladorExamen {
       @Autowired ServicioCalif evaluacion;
    
    
    @RequestMapping(value="/final")
    public String Examensito(Model model){model.addAttribute("gatonejo", evaluacion.obtenerCalif());
        return "presentacion";
        
        }
    
     @RequestMapping(value="/servicio-calificaciones", method=RequestMethod.GET,headers={"Accept=application/jason"})
    public @ResponseBody String buscaAlumno()throws Exception{
        Map<String, ArrayList<Evaluacion>> singletonMap=Collections.singletonMap("alumnos", GenerarCalificaciones.generarCalificaciones());
    ObjectMapper mapper=new ObjectMapper();
    return mapper.writeValueAsString(singletonMap);
    }
    }
    
