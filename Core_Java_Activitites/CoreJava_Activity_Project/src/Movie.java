import java.sql.Date;
import java.time.LocalDate;

public class Movie {
   
	private int movieid;
	private String moviename;
	private String hero;
	private String heroine;
	private LocalDate date;
	private String lang;
	private int length;
	private String type;
	private int prodid;
	
	
	


	public Movie(int movieid, String moviename, String hero, String heroine, LocalDate date, String lang, int length,
			String type, int prodid) {
		super();
		this.movieid = movieid;
		this.moviename = moviename;
		this.hero = hero;
		this.heroine = heroine;
		this.date = date;
		this.lang = lang;
		this.length = length;
		this.type = type;
		this.prodid = prodid;
	}


	public int getMovieid() {
		return movieid;
	}


	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}


	public String getMoviename() {
		return moviename;
	}


	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}


	public String getHero() {
		return hero;
	}


	public void setHero(String hero) {
		this.hero = hero;
	}


	public String getHeroine() {
		return heroine;
	}


	public void setHeroine(String heroine) {
		this.heroine = heroine;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}
	public java.sql.Date get_date(){
		Date d=java.sql.Date.valueOf(getDate());
		java.sql.Date sdate=convertUtilToSql(d);
		return sdate;
	}
	


	private java.sql.Date convertUtilToSql(Date d) {
		// TODO Auto-generated method stub
		java.sql.Date sd=new  java.sql.Date(d.getTime());
		return sd;
	}


	public String getLang() {
		return lang;
	}


	public void setLang(String lang) {
		this.lang = lang;
	}


	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getProdid() {
		return prodid;
	}


	public void setProdid(int prodid) {
		this.prodid = prodid;
	}


	@Override
	public String toString() {
		return "movieid=" + movieid + ", moviename=" + moviename + ", hero=" + hero + ", heroine=" + heroine
				+ ", date=" + date + ", lang=" + lang + ", length=" + length + ", type=" + type + ", prodid=" + prodid
				;
	}
	
	
	


	
	
	
}
