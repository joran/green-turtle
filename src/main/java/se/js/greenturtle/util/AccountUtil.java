package se.js.greenturtle.util;

import static java.lang.Math.floor;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.String.format;
import static java.time.format.DateTimeFormatter.ofPattern;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;

import se.js.greenturtle.Account;

public class AccountUtil {
	private final static long startTime = new GregorianCalendar(1970, 0, 1).getTime().getTime();
	private final static long endTime = new GregorianCalendar(1999, 11, 31, 23, 59, 59).getTime().getTime();
	private static final long time_delta = endTime-startTime;
	private static final SimpleDateFormat shortFormart = new SimpleDateFormat("yyMMdd");

	private static String[] givennames = new String[]{
		"Alice","Lucas","Maja","Elias","Ella","Oscar","Emma","William","Elsa","Hugo","Alva","Alexander","Julia","Oliver","Linnea","Viktor","Wilma","Erik","Ebba","Axel","Molly","Filip","Nellie","Emil","Klara","Isak","Agnes","Leo","Ida","Liam","Elin","Theo","Olivia","Anton","Emilia","Melvin","Isabelle","Albin","Amanda","Gustav","Saga","Max","Moa","Ludvig","Ellen","Arvid","Alma","Edvin","Matilda","Vincent","Hanna","Viggo","Nova","Alvin","Sara","Wilmer","Alicia","Adam","Felicia","Noah","Stella","Elliot","Tuva","Simon","Astrid","Jonathan","Isabella","Kevin","Meja","Olle","Selma","Benjamin","Thea","Linus","Elvira","Carl","Lilly","Alfred","Lovisa","Rasmus","Tindra","Gabriel","Lova","Charlie","Nora","Jacob","Sofia","Theodor","Ester","Nils","Nathalie","Leon","Vera","Felix","Tilde","Sebastian","Tyra","Noel","Emelie","Casper","Filippa","Malte","Freja","Sixten","Signe","Ville","Tilda","David","Siri","Melker","Lea","Joel","Stina","Hampus","Cornelia","Neo","Inez","Adrian","Edith","Samuel","Linn","Love","Mira","Milo","Jasmine","Josef","Liv","Jack","Leia","Mohammed","Emmy","Wilhelm","Frida","Alex","Lisa","Daniel","Ellie","Tim","Josefin","Valter","Svea","Sigge","Rebecka","Vilgot","Evelina","Robin","Ronja","Marcus","Kajsa","Vidar","Anna","August","Joline","Milton","Elina","Måns","Elise","Hannes","Märta","Maximilian","Lina","Loke","Hilda","Harry","Iris","Elis","Ingrid","John","Melissa","Aron","Livia","Hjalmar","Vilda","Otto","My","Elton","Sofie","Mio","Malva","Fabian","Nicole","Eddie","Victoria","Sam","Fanny","Svante","Greta","Dante","Hedda","Ali","Alexandra","Johannes","Maria","Mattias","Rut","Jesper","Miranda","Dennis","Johanna","Ruben"
	};


	private static String[] surnames = new String[]{
		"Abrahamsson","Adamsson","Adolfsson","Ahlberg","Ahlén","Ahlgren","Ahlin","Ahlqvist","Ahlstrand","Ahlström","Ahl","Albertsson","Albinsson","Alexandersson","Alfredsson","Algotsson","Almén","Almgren","Almqvist","Almström","Alm","Anderberg","Andersen","Andersson","Andreasson","Andrén","André","Antonsson","Appelgren","Appelqvist","Arnesson","Aronsson","Arvidsson","Ask","Asplund","Asp","Assarsson","Augustsson","Axelsson","Axén","Backlund","Backman","Backström","Back","Bark","Beckman","Bengtsson","Benjaminsson","Bergdahl","Bergendahl","Berger","Berggren","Bergh","Bergkvist","Berglind","Berglin","Berglund","Bergman","Bergmark","Bergquist","Bergqvist","Bergstedt","Bergsten","Bergstrand","Bergström","Bergvall","Berg","Berlin","Berndtsson","Bernhardsson","Berntsson","Bertilsson","Birgersson","Bjurström","Björck","Björklund","Björkman","Björkqvist","Björk","Björling","Björnberg","Björnsson","Björn","Bladh","Blad","Blixt","Blomberg","Blomdahl","Blomgren","Blomkvist","Blomquist","Blomqvist","Blom","Boberg","Bodén","Bodin","Bogren","Bohlin","Bohman","Bolin","Boman","Bondesson","Borgström","Borg","Boström","Brandt","Bratt","Brink","Broberg","Brodén","Brodin","Brolin","Broman","Brorsson","Broström","Bruhn","Brundin","Bryngelsson","Brändström","Brännström","Burman","Burström","Bylund","Byström","Bäcklund","Bäckman","Bäckström","Bäck","Börjesson","Carlberg","Carlén","Carlson","Carlsson","Carlström","Cederberg","Cedergren","Cederholm","Cederlund","Ceder","Christensen","Christensson","Christiansson","Claesson","Classon","Collin","Dahlberg","Dahlén","Dahlgren","Dahlin","Dahlman","Dahlqvist","Dahlström","Dahl","Damberg","Danielsson","Davidsson","Degerman","De","Edberg","Edgren","Edholm","Edin","Edlund","Edman","Edström","Edvardsson","Edvinsson","Ehn","Einarsson","Ekberg","Ekblad","Ekblom","Ekdahl","Ekelund","Ekholm","Eklund","Eklöf","Ekman","Ekstedt","Ekstrand","Ekström","Ekvall","Ek","Elfström","Elfving","Elg","Eliasson","Elofsson","Emanuelsson","Emilsson","Enberg","Engberg","Engblom","Engdahl","Englund","Engman","Engqvist","Engstrand","Engström","Engvall","Eng","Enqvist","Enström","Ericson","Ericsson","Eriksson","Erlandsson","Ersson","Esbjörnsson","Eskilsson","Evertsson","Fagerberg","Fagerlund","Fagerström","Fahlén","Fahlgren","Fahlström","Falck","Falk","Fast","Ferm","Fernström","Filipsson","Flink","Flodin","Fogelberg","Folkesson","Forsberg","Forsell","Forsgren","Forslund","Forsman","Forsmark","Forsström","Forss","Fors","Frank","Fransén","Fransson","Franzén","Fredin","Fredlund","Fredriksson","Freij","Friberg","Frick","Fridell","Fridén","Fridh","Fridlund","Frid","Friman","Frisk","Fritz","From","Fröberg","Fröjd","Fält","Gabrielsson","Gerdin","Gidlund","Gillberg","Glad","Glans","Gradin","Grahn","Granath","Granat","Granberg","Grankvist","Granlund","Granqvist","Granström","Gran","Green","Gren","Grip","Grundström","Grönberg","Grönlund","Grönqvist","Grönvall","Gudmundsson","Gullberg","Gummesson","Gunnarsson","Gustafsson","Gustavsson","Göransson","Haag","Hagberg","Hagelin","Haglund","Hagman","Hagström","Hallberg","Halldén","Halldin","Hallén","Hallgren","Hallin","Hallman","Hallqvist","Hallström","Hall","Halvarsson","Hamberg","Hammarberg","Hammarlund","Hammarström","Hammar","Hamrin","Hansen","Hansson","Haraldsson","Harrysson","Hedberg","Hedblom","Hedén","Hedin","Hedlund","Hedman","Hedqvist","Hedström","Hedvall","Hed","Helander","Helgesson","Helin","Hellberg","Hellgren","Hellman","Hellqvist","Hellsten","Hellstrand","Hellström","Helmersson","Hemmingsson","Henningsson","Henning","Henriksson","Hermansson","Hilmersson","Hjalmarsson","Hjelm","Hjerpe","Hjorth","Hjort","Holgersson","Holmberg","Holmén","Holmer","Holmgren","Holmkvist","Holmlund","Holmquist","Holmqvist","Holmstedt","Holmström","Holm","Holst","Hugosson","Hultberg","Hultén","Hultgren","Hultin","Hultman","Hultqvist","Hult","Hurtig","Håkansson","Hård","Hägglund","Häggström","Hägg","Hällgren","Hällström","Häll","Högberg","Höglund","Högman","Högström","Hörberg","Ingemarsson","Ingvarsson","Isaksson","Isberg","Israelsson","Ivarsson","Jacobsson","Jakobsson","Jansson","Jarl","Jensen","Jeppsson","Jernberg","Joelsson","Johannesson","Johannisson","Johansen","Johansson","Johnson","Johnsson","Jonasson","Jonsson","Josefsson","Juhlin","Julin","Jönsson","Jörgensen","Kallin","Karlberg","Karlén","Karlsson","Karlström","Kempe","Kihlberg","Kihlström","Kjellberg","Kjellgren","Kjellin","Kjellman","Kjellström","Kjell","Klaesson","Klang","Klasson","Klingberg","Kling","Klint","Knutsson","Konradsson","Kraft","Krantz","Kristensson","Kristiansson","Kristoffersson","Kron","Krook","Kroon","Kruse","Kullberg","Kvarnström","Kvist","Käck","Källberg","Källgren","Källman","Källström","Käll","Kämpe","Köhler","Lagergren","Lagerqvist","Lagerström","Lager","Landberg","Landén","Landgren","Landin","Landström","Lans","Lantz","Larsen","Larsson","Leandersson","Leander","Ledin","Leijon","Lejon","Lennartsson","Levin","Lidberg","Lidén","Lidman","Lidström","Lif","Lilja","Liljedahl","Liljegren","Liljekvist","Lindahl","Lindberg","Lindblad","Lindblom","Lindbom","Lindborg","Lindbäck","Lindeberg","Lindell","Lindén","Linderoth","Linder","Linde","Lindfors","Lindgren","Lindholm","Lindh","Lindkvist","Lindman","Lindmark","Lindquist","Lindqvist","Lindroth","Lindskog","Lindstedt","Lindstrand","Lindström","Lindvall","Lind","Ling","Ljungberg","Ljungdahl","Ljunggren","Ljungkvist","Ljungqvist","Ljungström","Ljung","Lorentzon","Lovén","Ludvigsson","Lundahl","Lundberg","Lundblad","Lundborg","Lundbäck","Lundell","Lundén","Lundgren","Lundholm","Lundh","Lundin","Lundkvist","Lundmark","Lundquist","Lundqvist","Lundstedt","Lundström","Lundvall","Lund","Långström","Lång","Löfberg","Löfdahl","Löfgren","Löfqvist","Löfstedt","Löfstrand","Löfström","Löf","Lönnberg","Lönnqvist","Lönn","Lövgren","Lööf","Magnusson","Malmberg","Malmborg","Malmgren","Malmkvist","Malmqvist","Malmros","Malmsten","Malmström","Malm","Marklund","Markström","Markusson","Martinsson","Matsson","Mattiasson","Mattisson","Mattsson","Medin","Meijer","Melander","Melin","Mellberg","Mellgren","Mikaelsson","Moberg","Modig","Modin","Molander","Molin","Morén","Morin","Mossberg","Müller","Månsson","Mårtensson","Möller","Mörk","Nelson","Nielsen","Niemi","Niklasson","Nilsson","Norberg","Nordahl","Nordberg","Nordell","Nordén","Nordgren","Nordh","Nordin","Nordkvist","Nordlander","Nordling","Nordlund","Nordmark","Nordquist","Nordqvist","Nordstrand","Nordström","Nordvall","Nord","Norell","Norén","Norgren","Norin","Norlander","Norling","Norlin","Norman","Norrby","Norrman","Norström","Nyberg","Nygren","Nyholm","Nykvist","Nylander","Nylén","Nylund","Nyman","Nyqvist","Nyrén","Nystedt","Nyström","Näslund","Näsman","Näsström","Ohlsson","Olander","Olausson","Olin","Olofsson","Olovsson","Olsen","Olsén","Olsson","Oscarsson","Oskarsson","Ottosson","Palmér","Palmgren","Palmqvist","Palm","Paulsson","Pedersen","Pehrsson","Persson","Petersen","Peterson","Petersson","Pettersson","Pihl","Pålsson","Qvarnström","Qvist","Ragnarsson","Rahm","Ramberg","Ramström","Rapp","Rask","Rasmussen","Rasmusson","Rehn","Reinholdsson","Renberg","Renström","Rickardsson","Ringdahl","Ringström","Ring","Risberg","Robertsson","Rodin","Roos","Rosander","Rosberg","Rosell","Rosenberg","Rosendahl","Rosengren","Rosenkvist","Rosenqvist","Rosén","Roslund","Rosvall","Ros","Roth","Rundberg","Rundgren","Rundqvist","Rutgersson","Ryberg","Rydberg","Rydell","Rydén","Rydström","Ryd","Rylander","Rönnberg","Rönnbäck","Rönnqvist","Rönn","Sahlberg","Sahlén","Sahlin","Sahlström","Salomonsson","Samuelsson","Sandahl","Sandberg","Sandell","Sandén","Sander","Sandgren","Sandin","Sandqvist","Sandström","Sand","Schmidt","Schröder","Schultz","Schön","Seger","Selander","Selberg","Selin","Sigfridsson","Simonsson","Sjunnesson","Sjöberg","Sjöblom","Sjödahl","Sjödin","Sjögren","Sjöholm","Sjökvist","Sjölander","Sjölin","Sjölund","Sjöqvist","Sjöstedt","Sjösten","Sjöstrand","Sjöström","Sjöö","Skoglund","Skog","Skoog","Sköld","Smedberg","Smith","Sonesson","Spångberg","Staaf","Stark","Steen","Stefansson","Stenberg","Stenlund","Stenman","Stenmark","Stenqvist","Stensson","Stenström","Stenvall","Sten","Sterner","Stolpe","Stoltz","Stolt","Storm","Strandberg","Strand","Stridh","Strid","Strömberg","Strömbäck","Strömgren","Strömqvist","Ström","Sturesson","Ståhl","Stålberg","Stålnacke","Stål","Sundberg","Sundelin","Sundell","Sundén","Sundgren","Sundin","Sundkvist","Sundman","Sundquist","Sundqvist","Sundström","Sundvall","Sund","Sunesson","Svahn","Svanberg","Svanström","Svantesson","Svan","Svedberg","Svedin","Svedlund","Svenningsson","Svensk","Svensson","Svärd","Säfström","Säll","Söderberg","Söderblom","Södergren","Söderholm","Söderkvist","Söderlind","Söderlund","Söderman","Söderqvist","Söderström","Söder","Sörensen","Sörensson","Sörman","Tapper","Tell","Thelander","Thelin","Thomasson","Thorell","Thorén","Thorsell","Thorsson","Thor","Thulin","Thunberg","Thuresson","Thörn","Tillberg","Tillman","Tjernström","Tornberg","Torstensson","Trulsson","Trygg","Tufvesson","Turesson","Tuvesson","Törnberg","Törnblom","Törngren","Törnkvist","Törnqvist","Ulander","Vahlberg","Valfridsson","Vallgren","Vallin","Vall","Van","Vedin","Velander","Vennberg","Vernersson","Vestberg","Vesterberg","Vestergren","Vesterlund","Vestin","Vestling","Vestlund","Vestman","Viberg","Vidén","Vigren","Vikberg","Viklund","Vikman","Vikström","Viktorsson","Vik","Vilhelmsson","Vinberg","Von","Wahlberg","Wahlgren","Wahlqvist","Wahlström","Wallberg","Wallén","Wallgren","Wallin","Wallman","Wallström","Wall","Wedin","Welander","Welin","Wendel","Wennberg","Wennerberg","Wennerström","Wennström","Werner","Wessman","Westberg","Westerberg","Westergren","Westerlund","Wester","Westin","Westling","Westlund","Westman","Wiberg","Wickman","Wickström","Widell","Widén","Widlund","Wihlborg","Wiklund","Wikman","Wikström","Wik","Wilhelmsson","Wiman","Winberg","Wirén","Zachrisson","Zackrisson","Zakrisson","Zander","Zetterberg","Zetterlund","Zetterström","Åberg","Ågren","Åhlander","Åhlén","Åhlin","Åhman","Åhs","Åkerberg","Åkerblom","Åkerlind","Åkerlund","Åkerman","Åkerström","Åkesson","Ålander","Ålund","Åman","Åsberg","Åslund","Åstrand","Åström","Öberg","Ödman","Ögren","Öhlin","Öhlund","Öhman","Öhrn","Ölund","Öman","Öqvist","Örn","Östberg","Österberg","Östergren","Österlund","Österman","Öster","Östling","Östlund","Östman","Öström","Öst"
	};

	private static String[] domains = new String[]{
		"mic.vv.se","math.vv.se", "hist.vv.se", "uadm.vv.se", "ull.vv.se"
	};
	
	public static Account generateAccount(){
		int givenNameIdx = getRndGivenNameIndex();
		String givenName = givennames[givenNameIdx];
		String surname = surnames[getRndSurnameIndex()];
		String pnr = generatePnr(givenNameIdx);
		String email = generateEmail(givenName, surname);
		String uid = generateUid(givenName, surname);
		return new Account(uid, givenName, surname, pnr, email);
	}
	
	private static String generatePnr(int num){
		String date = shortFormart.format(getRndDate());
		String birthNum = getBirthNumber(num);
		int ctlrNum = calculateCtrlNumber(date + birthNum);
		String pnr = date + birthNum + ctlrNum;
		if(!isValidPnr(pnr)){
			System.out.println(String.format("%s not valid (%s %s/%s %s)", pnr, date, birthNum, num, ctlrNum));
		}
		return pnr; 
	}

	private static String generateEmail(String givenName, String surname){
		return replaceLowerASCII(format("%s.%s@%s", givenName, surname, domains[getRndDomainIndex()]));
	}
	
	private static String generateUid(String givenName, String surname){
		int l1 = min(givenName.length(), 3);
		int l2 = min(surname.length()+l1, 5);
		String paddedNum = right(format("0000%s",getRnd(9999)), 4);
		return replaceLowerASCII((givenName.substring(0, l1)+surname).substring(0, l2)) + paddedNum;
	}
	
	private static String replaceLowerASCII(String s){
		return s.toLowerCase()
				.replace("å", "a")
				.replace("ä", "a")
				.replace("ö", "o")
				.replace("é", "e");
	}
	
	private static int getRndGivenNameIndex(){
		return getRnd(givennames.length);
	}
	
	private static int getRndSurnameIndex(){
		return getRnd(surnames.length);
	}
	
	private static int getRndDomainIndex(){
		return getRnd(domains.length);
	}
	
	private static Date getRndDate(){
		return new Date(getRnd(startTime, time_delta));
	}

	private static int getRnd(int max){
		return (int)floor(Math.random() * max);
	}

	private static long getRnd(long offset, long max){
		return (long) (offset + floor(Math.random() * max));
	}

	private static boolean isValidPnr(String pnr){
		if(pnr == null || !pnr.matches("\\d{10}")){
			System.out.println("Pnr has an invalid format: " + pnr );
			return false;
		}
		
		LocalDate date = null;
		try {
			date = LocalDate.parse("19"+pnr.substring(0, 6), ofPattern("yyyyMMdd"));
		} catch (Exception e) {
			System.out.println("Pnr does not contain a parseable date: " + pnr + " - " + date);
			return false;
		}
		
		if(!pnr.startsWith(date.format(ofPattern("yyMMdd")))){
			System.out.println("Pnr does not represent a correct date: " + pnr + " - " + date);
			return false;
		}
		
		int ctrlNum = calculateCtrlNumber(pnr);
		if(!pnr.endsWith(""+ctrlNum)){
			System.out.println("Pnr contains an incorrect control number: " + pnr + " - " + ctrlNum);			
			return false;
		}
		
		return true;
	}

	private static int calculateCtrlNumber(String pnr) {
		int sum = 0;
		for(int i=0;i <= 8; i++){
			int num = toInt(pnr, i);
			int factor = (2-i%2); // 2 or 1
			num = num * factor; // Multiply with factor
			sum += num/10; // Sumerize all numbers, 12 -> 1+2
			sum += num%10;
		}
		int ctrlNum = 10-sum%10; // subtract the last number of the sum from 10, sum=39 -> 10-9 -> 1
		
		return ctrlNum == 10 ? 0 : ctrlNum;
	}
	
	private static int toInt(String str, int i) {
		if (Character.isDigit(str.charAt(i)))
			return Integer.parseInt(str.substring(i, i+1));
		else
			throw new IllegalArgumentException();
	}

	private static String getBirthNumber(int num){
		int n = num % 10;
		return right(format("000%s%s", getRnd(99), n), 3);
	}
	
	
	private static String right(String str, int length) {
		return str.substring(max(str.length()-length, 0));
	}

	public static void main(String[] args) {
		
		ArrayList<Account> ds = new ArrayList<>();
		for (int i = 0; i < 20000; i++) {
			ds.add(generateAccount());
		}
		ds.sort(new Comparator<Account>() {
			@Override
			public int compare(Account o1, Account o2) {
				if(o1.getUid().compareTo(o2.getUid()) == 0){
					System.out.println(o1 + " <-> " + o2);
				}
				return o1.getUid().compareTo(o2.getUid());
			}
		});

		//		
//		System.out.println(format.format(new Date(startTime)));
//		System.out.println(format.format(new Date(endTime)));
		System.out.println(ds.get(0));
		System.out.println(ds.get(ds.size()-1));
//		System.out.println(givennames.length);
//		String[] pnrs = new String[]{
//	   		    "6203311458",
//	   		    "6202311458",
//			    "6203311459",
//			    "6609161002",
//			    "0704269364"
//			};
//		for (String pnr : pnrs) {
//			System.out.println(pnr + " valid? " + validatePnr(pnr));
//		}
	}

/*if(
 UsersGenerator = function(){
     var givennames= ["Alice","Lucas","Maja","Elias","Ella","Oscar","Emma","William","Elsa","Hugo","Alva","Alexander","Julia","Oliver","Linnea","Viktor","Wilma","Erik","Ebba","Axel","Molly","Filip","Nellie","Emil","Klara","Isak","Agnes","Leo","Ida","Liam","Elin","Theo","Olivia","Anton","Emilia","Melvin","Isabelle","Albin","Amanda","Gustav","Saga","Max","Moa","Ludvig","Ellen","Arvid","Alma","Edvin","Matilda","Vincent","Hanna","Viggo","Nova","Alvin","Sara","Wilmer","Alicia","Adam","Felicia","Noah","Stella","Elliot","Tuva","Simon","Astrid","Jonathan","Isabella","Kevin","Meja","Olle","Selma","Benjamin","Thea","Linus","Elvira","Carl","Lilly","Alfred","Lovisa","Rasmus","Tindra","Gabriel","Lova","Charlie","Nora","Jacob","Sofia","Theodor","Ester","Nils","Nathalie","Leon","Vera","Felix","Tilde","Sebastian","Tyra","Noel","Emelie","Casper","Filippa","Malte","Freja","Sixten","Signe","Ville","Tilda","David","Siri","Melker","Lea","Joel","Stina","Hampus","Cornelia","Neo","Inez","Adrian","Edith","Samuel","Linn","Love","Mira","Milo","Jasmine","Josef","Liv","Jack","Leia","Mohammed","Emmy","Wilhelm","Frida","Alex","Lisa","Daniel","Ellie","Tim","Josefin","Valter","Svea","Sigge","Rebecka","Vilgot","Evelina","Robin","Ronja","Marcus","Kajsa","Vidar","Anna","August","Joline","Milton","Elina","Måns","Elise","Hannes","Märta","Maximilian","Lina","Loke","Hilda","Harry","Iris","Elis","Ingrid","John","Melissa","Aron","Livia","Hjalmar","Vilda","Otto","My","Elton","Sofie","Mio","Malva","Fabian","Nicole","Eddie","Victoria","Sam","Fanny","Svante","Greta","Dante","Hedda","Ali","Alexandra","Johannes","Maria","Mattias","Rut","Jesper","Miranda","Dennis","Johanna","Ruben"];


	var surnames = ["Abrahamsson","Adamsson","Adolfsson","Ahlberg","Ahlén","Ahlgren","Ahlin","Ahlqvist","Ahlstrand","Ahlström","Ahl","Albertsson","Albinsson","Alexandersson","Alfredsson","Algotsson","Almén","Almgren","Almqvist","Almström","Alm","Anderberg","Andersen","Andersson","Andreasson","Andrén","André","Antonsson","Appelgren","Appelqvist","Arnesson","Aronsson","Arvidsson","Ask","Asplund","Asp","Assarsson","Augustsson","Axelsson","Axén","Backlund","Backman","Backström","Back","Bark","Beckman","Bengtsson","Benjaminsson","Bergdahl","Bergendahl","Berger","Berggren","Bergh","Bergkvist","Berglind","Berglin","Berglund","Bergman","Bergmark","Bergquist","Bergqvist","Bergstedt","Bergsten","Bergstrand","Bergström","Bergvall","Berg","Berlin","Berndtsson","Bernhardsson","Berntsson","Bertilsson","Birgersson","Bjurström","Björck","Björklund","Björkman","Björkqvist","Björk","Björling","Björnberg","Björnsson","Björn","Bladh","Blad","Blixt","Blomberg","Blomdahl","Blomgren","Blomkvist","Blomquist","Blomqvist","Blom","Boberg","Bodén","Bodin","Bogren","Bohlin","Bohman","Bolin","Boman","Bondesson","Borgström","Borg","Boström","Brandt","Bratt","Brink","Broberg","Brodén","Brodin","Brolin","Broman","Brorsson","Broström","Bruhn","Brundin","Bryngelsson","Brändström","Brännström","Burman","Burström","Bylund","Byström","Bäcklund","Bäckman","Bäckström","Bäck","Börjesson","Carlberg","Carlén","Carlson","Carlsson","Carlström","Cederberg","Cedergren","Cederholm","Cederlund","Ceder","Christensen","Christensson","Christiansson","Claesson","Classon","Collin","Dahlberg","Dahlén","Dahlgren","Dahlin","Dahlman","Dahlqvist","Dahlström","Dahl","Damberg","Danielsson","Davidsson","Degerman","De","Edberg","Edgren","Edholm","Edin","Edlund","Edman","Edström","Edvardsson","Edvinsson","Ehn","Einarsson","Ekberg","Ekblad","Ekblom","Ekdahl","Ekelund","Ekholm","Eklund","Eklöf","Ekman","Ekstedt","Ekstrand","Ekström","Ekvall","Ek","Elfström","Elfving","Elg","Eliasson","Elofsson","Emanuelsson","Emilsson","Enberg","Engberg","Engblom","Engdahl","Englund","Engman","Engqvist","Engstrand","Engström","Engvall","Eng","Enqvist","Enström","Ericson","Ericsson","Eriksson","Erlandsson","Ersson","Esbjörnsson","Eskilsson","Evertsson","Fagerberg","Fagerlund","Fagerström","Fahlén","Fahlgren","Fahlström","Falck","Falk","Fast","Ferm","Fernström","Filipsson","Flink","Flodin","Fogelberg","Folkesson","Forsberg","Forsell","Forsgren","Forslund","Forsman","Forsmark","Forsström","Forss","Fors","Frank","Fransén","Fransson","Franzén","Fredin","Fredlund","Fredriksson","Freij","Friberg","Frick","Fridell","Fridén","Fridh","Fridlund","Frid","Friman","Frisk","Fritz","From","Fröberg","Fröjd","Fält","Gabrielsson","Gerdin","Gidlund","Gillberg","Glad","Glans","Gradin","Grahn","Granath","Granat","Granberg","Grankvist","Granlund","Granqvist","Granström","Gran","Green","Gren","Grip","Grundström","Grönberg","Grönlund","Grönqvist","Grönvall","Gudmundsson","Gullberg","Gummesson","Gunnarsson","Gustafsson","Gustavsson","Göransson","Haag","Hagberg","Hagelin","Haglund","Hagman","Hagström","Hallberg","Halldén","Halldin","Hallén","Hallgren","Hallin","Hallman","Hallqvist","Hallström","Hall","Halvarsson","Hamberg","Hammarberg","Hammarlund","Hammarström","Hammar","Hamrin","Hansen","Hansson","Haraldsson","Harrysson","Hedberg","Hedblom","Hedén","Hedin","Hedlund","Hedman","Hedqvist","Hedström","Hedvall","Hed","Helander","Helgesson","Helin","Hellberg","Hellgren","Hellman","Hellqvist","Hellsten","Hellstrand","Hellström","Helmersson","Hemmingsson","Henningsson","Henning","Henriksson","Hermansson","Hilmersson","Hjalmarsson","Hjelm","Hjerpe","Hjorth","Hjort","Holgersson","Holmberg","Holmén","Holmer","Holmgren","Holmkvist","Holmlund","Holmquist","Holmqvist","Holmstedt","Holmström","Holm","Holst","Hugosson","Hultberg","Hultén","Hultgren","Hultin","Hultman","Hultqvist","Hult","Hurtig","Håkansson","Hård","Hägglund","Häggström","Hägg","Hällgren","Hällström","Häll","Högberg","Höglund","Högman","Högström","Hörberg","Ingemarsson","Ingvarsson","Isaksson","Isberg","Israelsson","Ivarsson","Jacobsson","Jakobsson","Jansson","Jarl","Jensen","Jeppsson","Jernberg","Joelsson","Johannesson","Johannisson","Johansen","Johansson","Johnson","Johnsson","Jonasson","Jonsson","Josefsson","Juhlin","Julin","Jönsson","Jörgensen","Kallin","Karlberg","Karlén","Karlsson","Karlström","Kempe","Kihlberg","Kihlström","Kjellberg","Kjellgren","Kjellin","Kjellman","Kjellström","Kjell","Klaesson","Klang","Klasson","Klingberg","Kling","Klint","Knutsson","Konradsson","Kraft","Krantz","Kristensson","Kristiansson","Kristoffersson","Kron","Krook","Kroon","Kruse","Kullberg","Kvarnström","Kvist","Käck","Källberg","Källgren","Källman","Källström","Käll","Kämpe","Köhler","Lagergren","Lagerqvist","Lagerström","Lager","Landberg","Landén","Landgren","Landin","Landström","Lans","Lantz","Larsen","Larsson","Leandersson","Leander","Ledin","Leijon","Lejon","Lennartsson","Levin","Lidberg","Lidén","Lidman","Lidström","Lif","Lilja","Liljedahl","Liljegren","Liljekvist","Lindahl","Lindberg","Lindblad","Lindblom","Lindbom","Lindborg","Lindbäck","Lindeberg","Lindell","Lindén","Linderoth","Linder","Linde","Lindfors","Lindgren","Lindholm","Lindh","Lindkvist","Lindman","Lindmark","Lindquist","Lindqvist","Lindroth","Lindskog","Lindstedt","Lindstrand","Lindström","Lindvall","Lind","Ling","Ljungberg","Ljungdahl","Ljunggren","Ljungkvist","Ljungqvist","Ljungström","Ljung","Lorentzon","Lovén","Ludvigsson","Lundahl","Lundberg","Lundblad","Lundborg","Lundbäck","Lundell","Lundén","Lundgren","Lundholm","Lundh","Lundin","Lundkvist","Lundmark","Lundquist","Lundqvist","Lundstedt","Lundström","Lundvall","Lund","Långström","Lång","Löfberg","Löfdahl","Löfgren","Löfqvist","Löfstedt","Löfstrand","Löfström","Löf","Lönnberg","Lönnqvist","Lönn","Lövgren","Lööf","Magnusson","Malmberg","Malmborg","Malmgren","Malmkvist","Malmqvist","Malmros","Malmsten","Malmström","Malm","Marklund","Markström","Markusson","Martinsson","Matsson","Mattiasson","Mattisson","Mattsson","Medin","Meijer","Melander","Melin","Mellberg","Mellgren","Mikaelsson","Moberg","Modig","Modin","Molander","Molin","Morén","Morin","Mossberg","Müller","Månsson","Mårtensson","Möller","Mörk","Nelson","Nielsen","Niemi","Niklasson","Nilsson","Norberg","Nordahl","Nordberg","Nordell","Nordén","Nordgren","Nordh","Nordin","Nordkvist","Nordlander","Nordling","Nordlund","Nordmark","Nordquist","Nordqvist","Nordstrand","Nordström","Nordvall","Nord","Norell","Norén","Norgren","Norin","Norlander","Norling","Norlin","Norman","Norrby","Norrman","Norström","Nyberg","Nygren","Nyholm","Nykvist","Nylander","Nylén","Nylund","Nyman","Nyqvist","Nyrén","Nystedt","Nyström","Näslund","Näsman","Näsström","Ohlsson","Olander","Olausson","Olin","Olofsson","Olovsson","Olsen","Olsén","Olsson","Oscarsson","Oskarsson","Ottosson","Palmér","Palmgren","Palmqvist","Palm","Paulsson","Pedersen","Pehrsson","Persson","Petersen","Peterson","Petersson","Pettersson","Pihl","Pålsson","Qvarnström","Qvist","Ragnarsson","Rahm","Ramberg","Ramström","Rapp","Rask","Rasmussen","Rasmusson","Rehn","Reinholdsson","Renberg","Renström","Rickardsson","Ringdahl","Ringström","Ring","Risberg","Robertsson","Rodin","Roos","Rosander","Rosberg","Rosell","Rosenberg","Rosendahl","Rosengren","Rosenkvist","Rosenqvist","Rosén","Roslund","Rosvall","Ros","Roth","Rundberg","Rundgren","Rundqvist","Rutgersson","Ryberg","Rydberg","Rydell","Rydén","Rydström","Ryd","Rylander","Rönnberg","Rönnbäck","Rönnqvist","Rönn","Sahlberg","Sahlén","Sahlin","Sahlström","Salomonsson","Samuelsson","Sandahl","Sandberg","Sandell","Sandén","Sander","Sandgren","Sandin","Sandqvist","Sandström","Sand","Schmidt","Schröder","Schultz","Schön","Seger","Selander","Selberg","Selin","Sigfridsson","Simonsson","Sjunnesson","Sjöberg","Sjöblom","Sjödahl","Sjödin","Sjögren","Sjöholm","Sjökvist","Sjölander","Sjölin","Sjölund","Sjöqvist","Sjöstedt","Sjösten","Sjöstrand","Sjöström","Sjöö","Skoglund","Skog","Skoog","Sköld","Smedberg","Smith","Sonesson","Spångberg","Staaf","Stark","Steen","Stefansson","Stenberg","Stenlund","Stenman","Stenmark","Stenqvist","Stensson","Stenström","Stenvall","Sten","Sterner","Stolpe","Stoltz","Stolt","Storm","Strandberg","Strand","Stridh","Strid","Strömberg","Strömbäck","Strömgren","Strömqvist","Ström","Sturesson","Ståhl","Stålberg","Stålnacke","Stål","Sundberg","Sundelin","Sundell","Sundén","Sundgren","Sundin","Sundkvist","Sundman","Sundquist","Sundqvist","Sundström","Sundvall","Sund","Sunesson","Svahn","Svanberg","Svanström","Svantesson","Svan","Svedberg","Svedin","Svedlund","Svenningsson","Svensk","Svensson","Svärd","Säfström","Säll","Söderberg","Söderblom","Södergren","Söderholm","Söderkvist","Söderlind","Söderlund","Söderman","Söderqvist","Söderström","Söder","Sörensen","Sörensson","Sörman","Tapper","Tell","Thelander","Thelin","Thomasson","Thorell","Thorén","Thorsell","Thorsson","Thor","Thulin","Thunberg","Thuresson","Thörn","Tillberg","Tillman","Tjernström","Tornberg","Torstensson","Trulsson","Trygg","Tufvesson","Turesson","Tuvesson","Törnberg","Törnblom","Törngren","Törnkvist","Törnqvist","Ulander","Vahlberg","Valfridsson","Vallgren","Vallin","Vall","Van","Vedin","Velander","Vennberg","Vernersson","Vestberg","Vesterberg","Vestergren","Vesterlund","Vestin","Vestling","Vestlund","Vestman","Viberg","Vidén","Vigren","Vikberg","Viklund","Vikman","Vikström","Viktorsson","Vik","Vilhelmsson","Vinberg","Von","Wahlberg","Wahlgren","Wahlqvist","Wahlström","Wallberg","Wallén","Wallgren","Wallin","Wallman","Wallström","Wall","Wedin","Welander","Welin","Wendel","Wennberg","Wennerberg","Wennerström","Wennström","Werner","Wessman","Westberg","Westerberg","Westergren","Westerlund","Wester","Westin","Westling","Westlund","Westman","Wiberg","Wickman","Wickström","Widell","Widén","Widlund","Wihlborg","Wiklund","Wikman","Wikström","Wik","Wilhelmsson","Wiman","Winberg","Wirén","Zachrisson","Zackrisson","Zakrisson","Zander","Zetterberg","Zetterlund","Zetterström","Åberg","Ågren","Åhlander","Åhlén","Åhlin","Åhman","Åhs","Åkerberg","Åkerblom","Åkerlind","Åkerlund","Åkerman","Åkerström","Åkesson","Ålander","Ålund","Åman","Åsberg","Åslund","Åstrand","Åström","Öberg","Ödman","Ögren","Öhlin","Öhlund","Öhman","Öhrn","Ölund","Öman","Öqvist","Örn","Östberg","Österberg","Östergren","Österlund","Österman","Öster","Östling","Östlund","Östman","Öström","Öst"];

  var domains = ["mic.vv.se","math.vv.se", "hist.vv.se", "uadm.vv.se", "ull.vv.se"];
//--
 function validatePNum(sPNum)
{
  sPNum = "19" + sPNum.replace("-", "");
  var numbers = sPNum.match(/^(\d)(\d)(\d)(\d)(\d)(\d)(\d)(\d)(\d)(\d)(\d)(\d)$/);
  var checkSum = 0;

  var d = new Date();
  if (!isDate(sPNum.substring(0,4),sPNum.substring(4,6),sPNum.substring(6,8))) {
    alert("Datumet " + sPNum.substring(0,8) + " är inte korrekt.");
    return false;
  }

  if (numbers == null) { return false; }

  var n;
  for (var i = 3; i <= 12; i++)
  {
    n=parseInt(numbers[i]);
    if (i % 2 == 0) {
      checkSum+=n;
    } else {
      checkSum+=(n*2)%9+Math.floor(n/9)*9
    }
  }

  if (checkSum%10==0) { return true;}
  return false;
}

function getYear(y) { return (y < 1000) ? y + 1900 : y; }

function isDate(year, month, day)
{
  month = month - 1; // 0-11 in JavaScript
  var tmpDate = new Date(year,month,day);
  if ( (getYear(tmpDate.getYear()) == year) &&
  (month == tmpDate.getMonth()) &&
  (day == tmpDate.getDate()) )
    return true;
  else
    return false;
}

//--

 var startDate = new Date(1970, 0, 1);
 var endDate = new Date(1999, 12, 31);

 var replaceWithLowerASCII = function(s){
     return s.toLowerCase()
		   .replace("å", "a")
		   .replace("ä", "a")
		   .replace("ö", "o")
		   .replace("é", "e");
 };

 var padLeft0 = function(v,n){
     var zeros = "";
     for(var i = 0; i < n; i++){
         zeros += "0"; 
     }
     return (zeros + v).slice(-1*n);
 };

 var getRndIndex = function(n){
 	 return Math.floor((Math.random() * n));  
 };

 var getRndBirthNumber = function(idx){
     return padLeft0(Math.floor((Math.random() * 99)), 2) + padLeft0(idx, 1);
 };

 var getRndDate = function(){
     return new Date(startDate.getTime() + Math.random() * (endDate.getTime() - startDate.getTime()));
 };

 var getControlNum = function(tn){
     var sum = 0;
     for(var i = 0; i < tn.length; i++){
         var n = parseInt(tn[i]);
	     if(i%2 == 0){
            sum += (n*2)%9 + Math.floor(n/9)*9;
         } else {
            sum += n;
         }
     }
	 return ((10-(sum%10))%10).toString();
 };

 var generatePNR = function(idx, retries){
     retries = retries || 0;
     var d = getRndDate();
	 var t = padLeft0(d.getFullYear().toString(), 2) + padLeft0(d.getMonth()+1, 2) + padLeft0(d.getDate(), 2);
     var n = getRndBirthNumber(idx);
     var c = getControlNum(t+""+n);
     var p = t + "-" + n + "" + c;
     // Verifying generated PNR
     // and retry if not valid
	 if (!validatePNum(p)) {
        if (retries > 0) {
           	console.info("not valid pnr, retrying", p, t , n ,c, retries);
            return generatePNR(idx, retries-1);
        }
       	console.info("not valid pnr, no more retries", p, t , n ,c);
	 }
	 return p;
 };

 var generateUID = function(g,s,p){
    return replaceWithLowerASCII((g.slice(0,3)+s).slice(0,5)+p.slice(7, 10));
 }

 var generateEMAIL = function(g,s){
    return replaceWithLowerASCII(g + "." + s + "@" + domains[getRndIndex(domains.length)]);
 }

//--

 var get = function(n){
     var users = [];
 	 for(var i = 0; i < n; i++){
   	     var idx = getRndIndex(givennames.length);
   	     var g = givennames[idx];
         var s = surnames[getRndIndex(surnames.length)];
         var p = generatePNR(idx, 1);
         var u = generateUID(g, s, p);
         var e = generateEMAIL(g,s);
         users.push({givenname: g,
                     surname: s,
                     pnr: p,
                     uid: u,
                     email: e});
	 }
 	 return users;
 };


 return {
     get:get,
 };
}();
 * 
 * 
 * */
}
