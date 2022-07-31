
package com.portfolio.aehwnd.Controller;

import com.portfolio.aehwnd.Dto.dtoHabilidad;
import com.portfolio.aehwnd.Entity.Habilidad;
import com.portfolio.aehwnd.Security.Controller.Mensaje;
import com.portfolio.aehwnd.Service.ImpHabService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habilidades")
@CrossOrigin(origins = "http://localhost:4200")

public class HabilidadController {
    @Autowired
    ImpHabService habService;

    @GetMapping("/lista")
    public ResponseEntity<List<Habilidad>> list() {
        List<Habilidad> list = habService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Habilidad> getById(@PathVariable("id") int id) {
        if (!habService.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Habilidad habilidad = habService.getOne(id).get();
        return new ResponseEntity(habilidad, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!habService.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        habService.delete(id);
        return new ResponseEntity(new Mensaje("Elemento eliminado"), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoHabilidad dtohab) {
        if (StringUtils.isBlank(dtohab.getNombreH())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (habService.existsByNombreH(dtohab.getNombreH())) {
            return new ResponseEntity(new Mensaje("Esa habilidad existe"), HttpStatus.BAD_REQUEST);
        }

        Habilidad habilidad = new Habilidad(dtohab.getNombreH(), dtohab.getPorcentaje(),dtohab.isHard());
        habService.save(habilidad);

        return new ResponseEntity(new Mensaje("Habilidad agregada"), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoHabilidad dtohab) {
        //Valida si existe la ID
        if (!habService.existsById(id)) {
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        }
        //Compara nombres de experiencias
        if (habService.existsByNombreH(dtohab.getNombreH()) && habService.getByNombreH(dtohab.getNombreH()).get().getId() != id) {
            return new ResponseEntity(new Mensaje("Esa habilidad ya existe"), HttpStatus.BAD_REQUEST);
        }
        //No puede estar vacio
        if (StringUtils.isBlank(dtohab.getNombreH())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }

        Habilidad habilidad = habService.getOne(id).get();
        habilidad.setNombreH(dtohab.getNombreH());
        habilidad.setPorcentaje((dtohab.getPorcentaje()));
        habilidad.setHard(dtohab.isHard());

        habService.save(habilidad);
        return new ResponseEntity(new Mensaje("Experiencia laboral actualizada"), HttpStatus.OK);

    }
}
