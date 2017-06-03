package com.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CmdRunner implements CommandLineRunner{

	@Autowired
	private QueryInterface queryInterface;
	
	@Override
	public void run(String... arg0) throws Exception {
		queryInterface.save(new Students("A",7));
		queryInterface.save(new Students("B",8));
		queryInterface.save(new Students("C",9));
		queryInterface.save(new Students("D",10));
		queryInterface.findAll().forEach(t->System.out.println(t.getRoll()+" "+t.getName()+" "+t.getCgpa()));
	}

}
