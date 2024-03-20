package application;

public class ConverterUnicode {
	
	
	public static String converter(String texto) {
		String[] teste = texto.split("");
		for(int i = 0; i < teste.length; i++) {
			char letra = teste[i].charAt(0);
			switch (letra) {
			case 'á': teste[i] = "\\u00e1"; break;
			case 'à': teste[i] = "\\u00e0"; break;
			case 'â': teste[i] = "\\u00e2"; break;
			case 'ã': teste[i] = "\\u00e3"; break;
			case 'ä': teste[i] = "\\u00e4"; break;
			case 'Á': teste[i] = "\\u00c1"; break;
			case 'À': teste[i] = "\\u00c0"; break;
			case 'Â': teste[i] = "\\u00c2"; break;
			case 'Ã': teste[i] = "\\u00c3"; break;
			case 'Ä': teste[i] = "\\u00c4"; break;
		    case 'é': teste[i] = "\\u00e9"; break;
		    case 'è': teste[i] = "\\u00e8"; break;
		    case 'ê': teste[i] = "\\u00ea"; break;
		    case 'É': teste[i] = "\\u00c9"; break;
		    case 'È': teste[i] = "\\u00c8"; break;
		    case 'Ê': teste[i] = "\\u00ca"; break;
		    case 'Ë': teste[i] = "\\u00cb"; break;
		    case 'í': teste[i] = "\\u00ed"; break;
		    case 'ì': teste[i] = "\\u00ec"; break;
		    case 'î': teste[i] = "\\u00ee"; break;
		    case 'ï': teste[i] = "\\u00ef"; break;
		    case 'Í': teste[i] = "\\u00cd"; break;
		    case 'Ì': teste[i] = "\\u00cc"; break;
		    case 'Î': teste[i] = "\\u00ce"; break;
		    case 'Ï': teste[i] = "\\u00cf"; break;
		    case 'ó': teste[i] = "\\u00f3"; break;
		    case 'ò': teste[i] = "\\u00f2"; break;
		    case 'ô': teste[i] = "\\u00f4"; break;
		    case 'õ': teste[i] = "\\u00f5"; break;
		    case 'ö': teste[i] = "\\u00f6"; break;
		    case 'Ó': teste[i] = "\\u00d3"; break;
		    case 'Ò': teste[i] = "\\u00d2"; break;
		    case 'Ô': teste[i] = "\\u00d4"; break;
		    case 'Õ': teste[i] = "\\u00d5"; break;
		    case 'Ö': teste[i] = "\\u00d6"; break;
		    case 'ú': teste[i] = "\\u00fa"; break;
		    case 'ù': teste[i] = "\\u00f9"; break;
		    case 'û': teste[i] = "\\u00fb"; break;
		    case 'ü': teste[i] = "\\u00fc"; break;
		    case 'Ú': teste[i] = "\\u00da"; break;
		    case 'Ù': teste[i] = "\\u00d9"; break;
		    case 'Û': teste[i] = "\\u00db"; break;
		    case 'ç': teste[i] = "\\u00e7"; break;
		    case 'Ç': teste[i] = "\\u00c7"; break;
		    case 'ñ': teste[i] = "\\u00f1"; break;
		    case 'Ñ': teste[i] = "\\u00d1"; break;
		    case '&': teste[i] = "\\u0026"; break;
		    case '°': teste[i] = "\\u00b0"; break;
		    case 'ª': teste[i] = "\\u00aa"; break;
			default:
				break;
			}
			if(teste[i].contains("'")) {
				teste[i] = "\\u0027";
			}
		}
		String aux = "";
		
		for(String i: teste) {
			aux += i;
		}
		
		System.out.println(aux);
		return texto;
	}
}
