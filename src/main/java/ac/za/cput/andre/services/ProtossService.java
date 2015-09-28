package ac.za.cput.andre.services;

import ac.za.cput.andre.domain.Protoss;

import java.util.List;

/**
 * Created by student on 2015/05/21.
 */
public interface ProtossService {
    List<Protoss> getProtoss();
    List<Protoss> getSingleProtoss(String email);
    void createArmy(List<String> units,String race, String armyname, String email,String pop);
    void delete(Protoss protoss);
    Protoss findById(long id);
}
