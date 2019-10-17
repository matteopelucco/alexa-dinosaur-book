package com.pelucco.alexa.dinosaur.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DinosaurUtil {

    private static final String MOSASAURO = "Mosasauro";
	private static final String SPINOSAURO = "Spinosauro";
	private static final String VELOCIRAPTOR = "Velociraptor";
	private static final String ALLOSAURO = "Allosauro";
	private static final String T_REX = "T-Rex";
	private static final String PARASAUROLOPHUS = "Parasaurolophus";
	

	public static Map getDinosaursMap() {
        Map<String, String> map = new HashMap<>();
        map.put(T_REX, "Come gli altri tirannosauridi, il T-Rex era un carnivoro bipede con un cranio largo e massiccio, bilanciato da una coda lunga e pesante. In confronto alle sue gambe robuste, gli arti anteriori di Tyrannosaurus erano corti, ma relativamente possenti e forniti di due dita artigliate. Benché sia stato superato in dimensioni da Spinosaurus il Tyrannosaurus fu il più grande dei tirannosauridi e uno dei predatori terrestri più grandi e forti conosciuti.");
        map.put(ALLOSAURO, "L'Allosaurus era un predatore bipede di medie dimensioni; il suo cranio era incredibilmente robusto e compatto e armato di una moltitudine di denti. ");
        map.put(VELOCIRAPTOR, "Il Velociraptor era più piccolo degli altri dromaeosauridi come Deinonychus e Achillobator. Ciononostante, condivideva tanti dei loro tratti anatomici, essendo un carnivoro bipede piumato con una lunga coda rigida, e con un artiglio a falce su ogni zampa posteriore, che si ritiene fosse usato nella caccia. Si differenziava dagli altri dromaeosauridi per il suo cranio lungo e snello, col muso rivolto in su.");
        map.put(SPINOSAURO, "Lo Spinosaurus fu uno dei più grandi, se non il più grande, teropodi conosciuti, superando giganti come Tyrannosaurus e Giganotosaurus in lunghezza");
        map.put(MOSASAURO, "Il Mosasauro fu uno degli ultimi mosasauridi, oltre ad essere uno tra i più grandi. Come la maggior parte dei mosasauridi, gli arti si erano evoluti in corte ma efficienti pinne, e le pinne anteriori erano più grandi delle pinne posteriori");
        map.put(PARASAUROLOPHUS, "Parasaurolofo è un genere estinto di dinosauro ornitopode vissuto nel Cretaceo superiore, 76.5-74.5 milioni di anni fa, negli stati di Alberta, Nuovo Messico e Utah, Nord America. Il Parasaurolofo era un erbivoro in grado di camminare sia in postura bipede sia quadrupede anteriori erano più grandi delle pinne posteriori");
        return map;
    }

    public static Map getDinosaursImages() {
        Map<String, String> map = new HashMap<>();
        map.put(T_REX, "https://media.mnn.com/assets/images/2018/10/TRexModelAgainstYellowEggshellBackground.jpg.653x0_q80_crop-smart.jpg");
        map.put(ALLOSAURO, "https://upload.wikimedia.org/wikipedia/commons/7/7d/Allosaurus_in_Ba%C5%82tow_white_background.jpg");
        map.put(VELOCIRAPTOR, "https://images-na.ssl-images-amazon.com/images/I/81Mm7PSz8qL._SX425_.jpg");
        map.put(SPINOSAURO, "https://www.focusjunior.it/content/uploads/site_stored/imgs/0001/038/spinosauro.jpg");
        map.put(MOSASAURO, "http://1.bp.blogspot.com/-AP9oZwuLCHk/UzRK1HbW0RI/AAAAAAAABjo/5DmlHUm0ACg/s1600/Mosa+1.png");
        map.put(PARASAUROLOPHUS, "https://vignette.wikia.nocookie.net/animali-preistorici2395/images/f/f7/Poster-parasaurolophus-686805.jpg/revision/latest?cb=20180401182921&path-prefix=it");
        return map;
    }

    public static List getDinosaursKeys() {
        List<String> keys = new ArrayList<>();
        keys.add(T_REX);
        keys.add(ALLOSAURO);
        keys.add(VELOCIRAPTOR);
        keys.add(SPINOSAURO);
        keys.add(MOSASAURO);
        keys.add(PARASAUROLOPHUS);
        return keys;
    }

}