package ac.za.cput.andre.services.impl;

import ac.za.cput.andre.domain.Protoss;
import ac.za.cput.andre.domain.Race;
import ac.za.cput.andre.domain.Unit;
import ac.za.cput.andre.factory.RaceSelector;
import ac.za.cput.andre.repository.ProtossRepository;
import ac.za.cput.andre.services.ProtossService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/05/21.
 */
@Service
public class ProtossServiceImpl implements ProtossService {
    @Autowired
    ProtossRepository repository;
    public List<Protoss> getProtoss()
    {
        List<Protoss> allProtossArmies = new ArrayList<>();
        Iterable<Protoss> values = repository.findAll();

        for (Protoss protoss : values)
            allProtossArmies.add(protoss);

        return allProtossArmies;
    }

    public List<Protoss> getSingleProtoss(String email)
    {
        List<Protoss> allProtossArmies = new ArrayList<>();
        Iterable<Protoss> values = repository.findAll();

        for (Protoss protoss : values) {
            String user = protoss.getUser();
            if(user.equals(email)) {
                allProtossArmies.add(protoss);
            }
        }
        return allProtossArmies;
    }

    public void createArmy(List<String> army,String raceSel,String armyname,String email)
    {
        RaceSelector race = new RaceSelector();
        Race protoss = race.getRace(raceSel);
        for(int i = 0; i < army.size();i++)
        {
            Unit unit = protoss.addUnit(army.get(i));
        }

        protoss.setArmyName(armyname);
        protoss.setUser(email);
        repository.save((Protoss)protoss);
    }
}
