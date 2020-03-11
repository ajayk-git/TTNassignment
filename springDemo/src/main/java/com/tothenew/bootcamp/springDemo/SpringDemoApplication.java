
//Please remove comment tag from each application context to execute the questions is getting check.
package com.tothenew.bootcamp.springDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDemoApplication.class, args);
		Ques1 ques1 = context.getBean(Ques1.class);
		ques1.showTightCoupling();

//		ApplicationContext context = SpringApplication.run(SpringDemoApplication.class, args);
//		Ques2 ques2 = context.getBean(Ques2.class);
//		ques2.showLooseCoupling();

//		ApplicationContext context= SpringApplication.run(SpringDemoApplication.class, args);
//		Ques3 ques3=context.getBean(Ques3.class);
//		ques3.ques3show();

//		ApplicationContext context = SpringApplication.run(SpringDemoApplication.class, args);
//		Ques4 ques4 = context.getBean(Ques4.class);
//		ques4.ques4Show();


//		ApplicationContext context= SpringApplication.run(SpringDemoApplication.class, args);
//		Ques5 ques5=context.getBean(Ques5.class);
//		ques5.ques5Show();

//		ApplicationContext context= SpringApplication.run(SpringDemoApplication.class, args);
//		Ques6 ques6=context.getBean(Ques6.class);
//		ques6.ques6Show();
	}
}
