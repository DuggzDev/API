package com.API.SpringAPI;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@SpringBootApplication
@RestController
@RequestMapping("api/v1/customers")
public class SpringApiApplication {
	
	private final CustomerRespository customerRespository;


	record NewCustomerRequest(
		String name,
		String email,
		Integer age)	
	{
		
	}

	public SpringApiApplication(CustomerRespository customerRespository){
		this.customerRespository = customerRespository;
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringApiApplication.class, args);
	
	}

	@GetMapping
	public List<Customer> getCustomers(){

		return customerRespository.findAll();
	}

	@GetMapping("{customerId}")
	public Customer getCustomers(@PathVariable("customerId") Integer id){

		return customerRespository.findById(id).orElseThrow();
	}
	
	@PostMapping
	public void addCustomer(@RequestBody NewCustomerRequest request){
		Customer customer = new Customer();
		customer.setName(request.name());
		customer.setEmail(request.email());
		customer.setAge(request.age());
		customerRespository.save(customer);
	}

	@DeleteMapping("/delete/{customerId}")
	public void deleteCustomer(@PathVariable("customerId") Integer id){

		
		
		customerRespository.deleteById(id);
	}

	//Make a way for the API to edit objects passed to the database
	@PutMapping("/change/{customerId}")
	public void updateCustomer(@PathVariable("customerId") Integer id, @RequestBody NewCustomerRequest request){

		Customer customer = customerRespository.findById(id).orElseThrow();
		customer.setName(request.name());
		customer.setEmail(request.email());
		customer.setAge(request.age());
		customerRespository.save(customer);
		
		

	}
}
