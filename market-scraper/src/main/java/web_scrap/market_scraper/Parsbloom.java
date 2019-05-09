package web_scrap.market_scraper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;


public class Parsbloom {
	public static void main(String args[])throws Exception{
		
		final Document document=Jsoup.connect("https://www.bloomberg.com/markets/stocks").get();
		
		for(Element row : document.select("table.data-table tr")) {
			final String label=row.select(".data-table-row-cell.value").text();
			//final String price=row.select(".data-table-row-cell.data-table-row-cell__next-value-up").text();
			System.out.println(label);
		}
		
	/*	print("running...");
		Document document;
		try {
			//Get Document object after parsing the html from given url.
			document = Jsoup.connect("https://www.bloomberg.com/markets/stocks").get();

			String title = document.title(); //Get title
			print("  Title: " + title); //Print title.

			Elements price = document.select(".data-table-row-cell__value"); //Get price
			//Elements address = document.select("span[itemprop]:contains(DenverCO)"); //Get address
			
			for (int i=1; i < price.size(); i++) {
				print( price.get(i).text());
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
    		print("done");

	}


	public static void print(String string) {
		System.out.println(string);*/
	}
}

