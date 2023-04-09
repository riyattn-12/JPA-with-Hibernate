package com.example.Inheritance_Joined_Table;

import com.example.Inheritance_Joined_Table.Entity.Maruti;
import com.example.Inheritance_Joined_Table.Entity.Swift;
import com.example.Inheritance_Joined_Table.Repository.CarRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InheritanceJoinedTableApplicationTests {
	@Autowired
	CarRepository carRepository;
	@Test
	void createCar()
	{
		Maruti m = new Maruti();
		m.setId(12);
		m.setModel("Grand-i10");
		m.setPrice("345670000");
		carRepository.save(m);

	}
	@Test
	void createSwiftCar()
	{
		Swift sw = new Swift();
		sw.setId(2);
		sw.setModel("Sportss");
		sw.setPrice("9870000");
		carRepository.save(sw);

	}

}
