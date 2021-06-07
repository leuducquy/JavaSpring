package com.example.spring.boot.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
	return String.format("Hello %s!", name);
	}
	@GetMapping("/welcome")
	public String welcome(@RequestParam(value = "name", defaultValue = "Java sclass") String name) {
		return String.format("Welcome %s!",name);
	}

 
 @GetMapping("/")
 public String home (){
  return "Spring REST Dinesh on Java!!!";
 }
 
//  @GetMapping("/accounts")
//  public List<Account> all (){
//   return accountService.list();
//  }
@PostMapping(path = "/members", consumes = "application/json", produces = "application/json")
public void addMember(@RequestBody Member member) {
    //code
}
 
 
//  @PutMapping("/account/{accountId}")
//  public Account update (@RequestBody Account account, @PathVariable Long accountId){
//   return accountService.update(account, accountId);
//  }
 
//  @DeleteMapping("/account/{accountId}")
//  public void delete (@PathVariable Long accountId){
//   accountService.delete(accountId);
//  }
}
