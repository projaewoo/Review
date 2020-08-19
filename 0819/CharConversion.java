import java.io.UnsupportedEncodingException;

public class CharConversion {
	private CharConversion() {}		//private -> new 못함 -> 주소 못만듬
	
	public static String entoko(String en) {
		String ko = null;
		try {										//ISO8859_1 -> KSC5601로 변환.		//KSC5601 : 완성형 한글 셋
			ko = new String(en.getBytes("ISO8859_1"), "KSC5601");		//Exception발생 (캐릭터셋 이외의 다른 문자 넣을 가능성 있으므로 예외 처리해줘야함)
		} catch (UnsupportedEncodingException e) {};	
		return ko;
	}
	
	public static String kotoen(String ko) {
		String en = null;
		try {											//KSC5601 -> ISO8859_1로 변환.	(한글 -> 영어 변환)
			en = new String(ko.getBytes("KSC5601"), "ISO8859_1");
		} catch (UnsupportedEncodingException e) {};
		return en;
	}
	
	public static String kotoutf8(String ko) {
		String utf8 = null;
		try {												//한글 -> UTF-8로 변환.										
			utf8 = new String(ko.getBytes("KSC5601"), "UTF-8");
		} catch (UnsupportedEncodingException e) {};
		return utf8;
	}
	
	public static String utf8toko(String utf8) {
		String ko = null;
		try {																						
			utf8 = new String(ko.getBytes("UTF-8"), "KSC5601");
		} catch (UnsupportedEncodingException e) {};
		return ko;
	}
}
