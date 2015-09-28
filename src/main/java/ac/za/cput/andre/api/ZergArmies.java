package ac.za.cput.andre.api;

import ac.za.cput.andre.domain.ArmyService;
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
public class ZergArmies {

    @Autowired
    private ZergService serviceZ;


    @RequestMapping(value = "/zerg/{user}", method = RequestMethod.GET)
    public ResponseEntity<List<Zerg>> getSingleZerg(@PathVariable String email) {

        List<Zerg> zerg = serviceZ.getSingleZerg(email);
        if(zerg == null) {
            System.out.println("Zerg Army/s from user with email " + email + " not found");
            return new ResponseEntity<List<Zerg>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Zerg>>(zerg,HttpStatus.OK);

    }

    @RequestMapping(value = "/zerg", method = RequestMethod.GET)
    public ResponseEntity<List<Zerg>> getZerg() {
        List<Zerg> zer = serviceZ.getZerg();

        if(zer.isEmpty())
        {
            return new ResponseEntity<List<Zerg>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Zerg>>(zer, HttpStatus.OK);
    }

    @RequestMapping(value = "/zerg/create", method = RequestMethod.POST)
    public ResponseEntity<Void> createArmy(@RequestBody ArmyService armyService,UriComponentsBuilder ucBuilder){
        List<String> army = armyService.getArmy();
        String raceSel = armyService.getRace();
        String armyname = armyService.getArmyname();
        String email = armyService.getEmail();
        String pop = armyService.getPop();
        serviceZ.createArmy(army,raceSel,armyname,email,pop);

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/zerg/{email}").buildAndExpand(email).toUri());

        return new ResponseEntity<Void>(headers,HttpStatus.CREATED);
    }

}
