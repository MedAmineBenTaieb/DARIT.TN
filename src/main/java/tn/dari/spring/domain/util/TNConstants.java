package tn.dari.spring.domain.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TNConstants {
	
	public final static String TN = "TN";
	
	public final static Map<String, String> mapOfTNGov = new HashMap<String, String>() {
		{
			put("AR", "Ariana");
			put("BJ", "Béja");
			put("BA", "Ben Arous");
            put("BZ", "Bizerte");
            put("GB", "Gabès");
            put("GF", "Gafsa");
            put("JN", "Jendouba");
            put("KR", "Kairouan");
            put("KS", "Kasserine");
            put("KB", "Kébili");
            put("KF", "Le Kef");
            put("MH", "Mahdia");
            put("MN", "La Manouba");
            put("MD", "Médenine");
            put("MN", "Monastir");
            put("NB", "Nabeul");
            put("SF", "Sfax");
            put("SB", "Sidi Bouzid");
            put("SL", "Siliana");
            put("SS", "Sousse");
            put("TT", "Tataouine");
            put("TZ", "Tozeur");
            put("TN", "Tunis");
            put("ZG", "Zaghouan");
		}
	};
	
	public final static List<String> listOfTNGovCode = new ArrayList<>(mapOfTNGov.keySet());
	public final static List<String> listOfTNGovName = new ArrayList<>(mapOfTNGov.values());

}

