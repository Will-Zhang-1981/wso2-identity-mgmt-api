package org.vasttrafik.wso2.carbon.identity.api.utils;

import org.vasttrafik.wso2.carbon.common.api.utils.AbstractErrorListResourceBundle;

/**
 * @author Lars Andersson
 *
 */
public final class IdentityErrorListResourceBundle_sv_SE extends AbstractErrorListResourceBundle {

	private static Object[][] content = {
		// Identity server defined error codes
		{"17001","Felaktigt anv�ndarnamn","Anv�ndaren {0} existerar inte. Ange korrekt anv�ndarnamn och f�rs�k igen."},
		{"17002","Felaktigt l�senord","Det angivna l�senordet �r felaktigt. Ange korrekt l�senord och f�rs�k igen."},
		{"17003","Kontot �r l�st","Anv�ndarkontot �r l�st och m�ste l�sas upp."},
		{"18001","Felaktig kod","Den angivna koden �r felaktig. Ange korrekt kod och f�rs�k igen."},
		{"18002","Ogiltig nyckel/kod","Den angivna nyckeln/koden �r inte l�ngre giltig."},
		{"18003","Felaktigt anv�ndarnamn","Anv�ndaren {0} existerar inte. Ange korrekt anv�ndarnamn och f�rs�k igen"},
		{"18004","Felaktigt svar","Det angivna svaret {0} �r felaktigt. F�rs�k igen."},
		{"18013","Felaktig kod","Den angivna koden �r felaktig. Ange korrekt kod och f�rs�k igen."},
		// Custom error codes
		{"1000","Ogiltigt parameterv�rde","Det angivna v�rdet {0} f�r parametern {1} �r ogiltigt."},
		{"1001","Resursen hittades inte","Den angivna resursen {0} hittades inte."},
		{"1002","Upptaget anv�ndarnamn","Anv�ndanamnet {0} �r upptaget. Var v�nlig v�lj ett annat."},
		{"1003","Ogiltig token","Angiven token �r inte l�ngre giltig. Var v�nlig logga in p� nytt."},
		{"1004","Felaktig token","Angiven token �r felaktig. Var v�nlig ange en korrekt token."},
		{"1005","Felaktig token","Angiven token tillh�r en annan anv�ndare. Var v�nlig ange en korrekt token."},
		{"1006","Felaktigt anv�ndarnamn/l�senord","Angivet anv�ndarnamn/l�senord felaktigt. Var v�nlig f�rs�k igen."}
	};
	
	@Override
	protected Object[][] getContents() {
		return content;
	}
}
