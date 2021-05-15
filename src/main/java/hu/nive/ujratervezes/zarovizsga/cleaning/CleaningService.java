package hu.nive.ujratervezes.zarovizsga.cleaning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class CleaningService {
    List<Cleanable> cleanables = new ArrayList<>();

    public void add(Cleanable c){
        cleanables.add(c);
    }

    public List<Cleanable> getCleanables() {
        return new ArrayList<>(cleanables);
    }

    public int cleanAll(){
        int total = 0;
        for (Iterator<Cleanable> ic = cleanables.iterator(); ic.hasNext(); ){
            Cleanable c = ic.next();
            total += c.clean();
            ic.remove();
        }
        return total;
    }

    public int cleanOnlyOffices(){
        int total = 0;
        for (Iterator<Cleanable> ic = cleanables.iterator(); ic.hasNext(); ){
            Cleanable c = ic.next();
            if(c.isOffice()){
                total += c.clean();
                ic.remove();
            }
        }
        return total;
    }

    public List<Cleanable> findByAddressPart(String part){
        List<Cleanable> result = new ArrayList<>();
        for(Cleanable c : cleanables){
            if(c.getAddress().contains(part)){
                result.add(c);
            }
        }
        return result;
    }

//még jobb, ha kézzel hozzáadom az elsőt, aztán ciklus!
//ürességet muszáj vizsgálni, mert különben IndexOutOfBoundEx-et fogok kapni valahol

    public String getAddresses(){
        StringBuilder result = new StringBuilder();
        boolean first = true;
        for(Cleanable c : cleanables){
            if(!first){
                result.append(", ");
            }
            first = false;
            result.append(c.getAddress());
        }
        return result.toString();
    }

//vagy:
    public String getAddresses2(){
        return cleanables //cleanAll()
        .stream()
        .map(Cleanable::getAddress)
        .collect(Collectors.joining(", "));
    }

}
