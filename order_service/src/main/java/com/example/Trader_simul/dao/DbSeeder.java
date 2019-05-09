/*package com.example.Trader_simul.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.example.Trader_simul.model.Contract;
import com.example.Trader_simul.model.Price;
import com.example.Trader_simul.dao.ContractRepository;


@Component
public class DbSeeder implements CommandLineRunner {
	private ContractRepository contractRepository;
	public DbSeeder(ContractRepository contractRepository) {
		this.contractRepository =contractRepository;
	}
	
@Override
public void run(String...strings)throws Exception{
	
	Contract AAPL = new Contract(
			"AAPL",
			Arrays.asList(
					new Price(1884.12, 478.23, 147.78),
					new Price(1478.25, 555.2, 147.25)
				)
	);
	
	Contract AMZN = new Contract(
			    "AMZN",
				Arrays.asList(
						new Price(1884,478,147),
						new Price(1478.25,555.2,147.25)
				)
	);
	
	Contract JNJ = new Contract(
			    "JNJ",
				Arrays.asList(
						new Price(200.53,145.25,147.23),
						new Price(147.25,147.2,147.2)
				)
	);
	
Contract BAC = new Contract(
			    "BAC",
				Arrays.asList(
						new Price(147.58,478.2,142.36),
						new Price(11425.2,586.3,142.5)
				)
	);
	

Contract TM = new Contract(
		    "TM",
			Arrays.asList(
					new Price(142.5,142.35,1478.25),
					new Price(145.4,142.5,143.8)
			)
);
Contract KO = new Contract(
		    "KO",
			Arrays.asList(
					new Price(147.25,145.7,789.3),
					new Price(1475.23,458.65,142.5)
			)
);

List<Contract> contracts = Arrays.asList(AAPL,AMZN,JNJ,BAC,TM,KO);
this.contractRepository.saveAll(contracts);
}

}*/