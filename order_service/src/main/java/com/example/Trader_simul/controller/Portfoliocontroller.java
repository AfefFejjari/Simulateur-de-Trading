/*package com.example.Trader_simul.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Trader_simul.model.Contract;
import com.example.Trader_simul.model.Price;
import com.example.Trader_simul.service.Portfolioservice;


@RestController
@RequestMapping("/contrat")
public class Portfoliocontroller {
	@Autowired
	private Portfolioservice contractservice;
	
	public Portfoliocontroller(Portfolioservice contractservice) {
		this.contractservice=contractservice;
	}
 
	
   @RequestMapping("/update")
	public String update(@RequestParam String symbol,@RequestParam ArrayList<Price> pricelist) {
		Contract c = contractservice.update(symbol,pricelist);
		return c.toString();
	}

   @RequestMapping("/all")
		public List<Contract>getAll(){
		return (List<Contract>) contractservice.getAll();
		
		}
	 
	 @RequestMapping("/insert")
		public String insert(@RequestParam String symbol,@RequestParam ArrayList<Price> pricelist) {
			Contract p = contractservice.insert(symbol,pricelist);
			return p.toString();
		}
	
}
*/
package com.example.Trader_simul.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.Trader_simul.message.request.OrderRequest;
import com.example.Trader_simul.model.Contract;
//import com.example.Trader_simul.model.Order;
import com.example.Trader_simul.service.Portfolioservice;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/portfolio")
public class Portfoliocontroller {
	
	@Autowired
	Portfolioservice portfolioService;
	@RequestMapping(value = "/contract")
    public List<Contract> getContracts() {
        return (portfolioService.getContracts());
    }

    @RequestMapping(value = "/orders")
    public ResponseEntity<Object> getOrders() {
        return new ResponseEntity<>(portfolioService.getOrders(), HttpStatus.OK);
    }
    @PostMapping(value = "/create-order")
    public ResponseEntity<Object> createOrder(@RequestBody OrderRequest orderRequest)
    {
        return new ResponseEntity<>(portfolioService.createOrder(orderRequest), HttpStatus.OK);
    }
	
	/*private ContractRepository contractRepository;
	@Autowired
	private OrderRepository orderRepository;
	
	
	
	@GetMapping("/contract/all")
	public List<Contract> getAll(){
	List<Contract> orders = this.contractRepository.findAll();
	return orders;
	}
	
	@PutMapping("/contract/insert")
	public void insert(@RequestBody Contract contract) {
		this.contractRepository.insert(contract);
	}
	
	@PostMapping
	public void update(@RequestBody Contract contract) {
		this.contractRepository.save(contract);
	}
	@DeleteMapping("/contract/{id}")
	public void delete(@PathVariable("id") String id) {
		this.contractRepository.deleteById(id);
	}
	
	@GetMapping("/contract/{id}")
	public Optional<Contract> getById(@PathVariable("id") String id){
		//Optional<Contract> order =this.contractRepository.findById(id);
		//return order;
		return this.contractRepository.findById(id);
	}
	
	@GetMapping("/{symbol}")
	public Contract getBysymbol(@PathVariable("symbol") String symbol){
		 return this.contractRepository.findBySymbol(symbol);
		
	}
	
	
	@GetMapping("/order/all")
	public List<Order> getAllorders(){
	List<Order> orders = this.orderRepository.findAll();
	return orders;
	}
	
	@PutMapping("/order/insert")
	public void insert(@RequestBody Order order) {
		this.orderRepository.insert(order);
	}
	
	@PostMapping("/order/update")
	public void update(@RequestBody Order order) {
		this.orderRepository.save(order);
	}
	@DeleteMapping("/order/{id}")
	public void deleteorder(@PathVariable("id") String id) {
		this.orderRepository.deleteById(id);
	}
	
	@GetMapping("/order/{id}")
	public Optional<Order> getOrderById(@PathVariable("id") String id){
		return this.orderRepository.findById(id);
		
	}
*/
}