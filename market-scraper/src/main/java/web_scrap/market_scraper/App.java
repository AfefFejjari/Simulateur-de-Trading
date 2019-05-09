/*package web_scrap.market_scraper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class App 
{
    public static void main( String[] args )throws Exception
    {
       final Document  document=Jsoup.connect("https://www.bloomberg.com/middleeast").get();
     
 for(Element row : document.select("div.navi-markets-bar")) {
    	   
    	   final String label=row.select("navi-data-strip__ticker-label").text();
    	   final String price=row.select("navi-data-strip__ticker-market-price").text();
    	   System.out.println(label+"->Price:"+price);
       }
       
    }
}
*/