package ac.za.cput.andre.api;

import ac.za.cput.andre.domain.Protoss;
import ac.za.cput.andre.domain.Terran;
import ac.za.cput.andre.domain.Zerg;
import ac.za.cput.andre.model.ProtossResource;
import ac.za.cput.andre.model.TerranResource;
import ac.za.cput.andre.model.ZergResource;
import ac.za.cput.andre.services.ProtossService;
import ac.za.cput.andre.services.TerranService;
import ac.za.cput.andre.services.ZergService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.hateoas.Link;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/05/24.
 */
@RestController
@RequestMapping("api/services/**")
public class ProtossArmies {

    @Autowired
    private ProtossService serviceP;

    @RequestMapping(value="/protoss/{user}", method= RequestMethod.GET)
    public ResponseEntity<List<Protoss>> getSingleProtoss(@PathVariable String email) {

        List<Protoss> protoss = serviceP.getSingleProtoss(email);
        if(protoss == null)
        {
            System.out.println("Protoss Army/s from user with email " + email + " not found");
            return new ResponseEntity<List<Protoss>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Protoss>>(protoss, HttpStatus.OK);
    }

    @RequestMapping(value = "/protoss", method = RequestMethod.GET)
    public ResponseEntity<List<Protoss>> getProtoss(){
        List<Protoss> pro = serviceP.getProtoss();

        if(pro.isEmpty())
        {
            return new ResponseEntity<List<Protoss>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Protoss>>(pro, HttpStatus.OK);
    }

    @RequestMapping(value = "/protoss/create", method = RequestMethod.POST)
    public ResponseEntity<Void> createArmy(@RequestBody List<String> army,@RequestBody String raceSel, @RequestBody String armyname, @RequestBody String email,UriComponentsBuilder ucBuilder){
        serviceP.createArmy(army,raceSel,armyname,email);

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/protoss/{email}").buildAndExpand(email).toUri());

        return new ResponseEntity<Void>(headers,HttpStatus.CREATED);
    }
}
