package com.example.Inheritance_TablePerClass;

import com.example.Inheritance_TablePerClass.Entity.Cheque;
import com.example.Inheritance_TablePerClass.Entity.CreditCard;
import com.example.Inheritance_TablePerClass.Repository.PaymentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InheritanceTablePerClassApplicationTests
{
	@Autowired
PaymentRepository paymentRepository;
	@Test
	public void createPayment()
	{
		CreditCard cc = new CreditCard();
		cc.setId(1);
		cc.setAmount(200000);
		cc.setCardNumber("345578");
		paymentRepository.save(cc);
	}
	@Test
	public void createChequePayment()
	{
		Cheque ch = new Cheque();
		ch.setId(1);
		ch.setAmount(200000);
		ch.setChequeNumber("12345678");
		paymentRepository.save(ch);
	}

}
