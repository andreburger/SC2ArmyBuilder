package ac.za.cput.andre.api;

import ac.za.cput.andre.domain.User;
import ac.za.cput.andre.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * Created by student on 2015/09/24.
 */
@RestController
@RequestMapping("api/services/**")
public class login {

    @Autowired
    private UserService service;

    @RequestMapping(value = "/login/create", method = RequestMethod.POST)
    public ResponseEntity<Void> createUser(@RequestBody User user){
        if(service.checkUserExist(user))
        {
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
        service.save(user);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }

    @RequestMapping(value = "/login/login", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> login(@RequestBody User user) {
        String email = user.getEmail();
        String pw = user.getUserpassword();
        if(service.login(email,pw))
        {
            return new ResponseEntity<Void>(HttpStatus.FOUND);
        }
        return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
    }

}
