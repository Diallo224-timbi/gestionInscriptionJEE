package sn.unipro.gestioninscription.modeles;

public enum Sexe {
	MASCULIN('M'),
	FEMININ('F');

	private final char code;

	Sexe(char code) {
		this.code= code;
	}
	public static Sexe fromCode(char code) {
		if(code == 'M' || code == 'm') {
			return MASCULIN;
		}
		if(code =='F' || code =='f') {
			return FEMININ;
		}
		throw new UnsupportedOperationException(
				"Le code "+ code +" n'est pris en charge"
		);
	}
	public char getCode() {
		return code;
	}
}
