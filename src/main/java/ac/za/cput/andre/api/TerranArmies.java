package ac.za.cput.andre.api;

import ac.za.cput.andre.domain.ArmyService;
import ac.za.cput.andre.domain.Terran;
import ac.za.cput.andre.model.TerranResource;
import ac.za.cput.andre.services.TerranService;
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
public class TerranArmies {

    @Autowired
    private TerranService serviceT;

    @RequestMapping(value="/terran/{user}", method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Terran>> getSingleTerran(@PathVariable String email) {

        List<Terran> terran = serviceT.getSingleTerran(email);
        if(terran == null)
        {
            System.out.println("Terran Army/s from user with email " + email + " not found");
            return new ResponseEntity<List<Terran>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Terran>>(terran,HttpStatus.OK);
    }

    @RequestMapping(value = "/terran", method = RequestMethod.GET)
    public ResponseEntity<List<Terran>> getTerran(){
        List<Terran> ter = serviceT.getTerran();

        if(ter.isEmpty())
        {
            return new ResponseEntity<List<Terran>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Terran>>(ter, HttpStatus.OK);
    }

    @RequestMapping(value = "/terran/create", method = RequestMethod.POST)
    public ResponseEntity<Void> createArmy(@RequestBody ArmyService armyService,UriComponentsBuilder ucBuilder){
        List<String> army = armyService.getArmy();
        String raceSel = armyService.getRace();
        String armyname = armyService.getArmyname();
        String email = armyService.getEmail();
        String pop = armyService.getPop();
        serviceT.createArmy(army,raceSel,armyname,email,pop);

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/terran/{email}").buildAndExpand(email).toUri());

        return new ResponseEntity<Void>(headers,HttpStatus.CREATED);
    }

    @RequestMapping(value = "/terran/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Terran> deleteArmy(@PathVariable("id")Integer id){
        Terran terran = serviceT.findById(id);
        if(terran == null)
        {
            return new ResponseEntity<Terran>(HttpStatus.NOT_FOUND);
        }
        serviceT.delete(terran);
        return new ResponseEntity<Terran>(HttpStatus.NO_CONTENT);
    }
}
