package legoset;

import jaxb.JAXBHelper;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.net.URL;
import java.time.Year;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws Exception {

        LegoSet legoset = new LegoSet();
        legoset.setName("Imperial TIE Fighter");
        legoset.setTheme("Star War");
        legoset.setSubtheme("Solo");
        legoset.setYear(Year.of(2018));
        legoset.setPieces(519);
        legoset.setTags(Set.of("Starfighter", "Stormtrooper", "Star Wars", "Solo"));
        ArrayList<Minifig> minfigs = new ArrayList<>();
        minfigs.add(new Minifig("Imperial Mudtrooper", 2));
        minfigs.add(new Minifig("Imperial Pilot", 1));
        minfigs.add(new Minifig("Mimban Stormtrooper", 1));
        legoset.setMinifigs(minfigs);

        legoset.setWeight(new Weight("kg", 0.89));
        legoset.setUrl(new URL("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter"));


        JAXBHelper.toXML(legoset, System.out);


        //JAXBHelper.toXML(legoset, new FileOutputStream("legoset.xml"));
        //System.out.println(JAXBHelper.fromXML(LegoSet.class, new FileInputStream("legoset.xml")));

    }
}
