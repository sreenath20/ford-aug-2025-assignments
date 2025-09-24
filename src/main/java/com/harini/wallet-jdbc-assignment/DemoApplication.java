package com.jdbc.demo;

import com.jdbc.demo.wallet.Wallet;
import com.jdbc.demo.wallet.WalletException;
import com.jdbc.demo.wallet.WalletService;
import com.jdbc.demo.wallet.WalletServiceImp;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Wallet wallet = new Wallet(2,"USA","USA123@gmail.com","USA123",4000.0);
		WalletService walletService = new WalletServiceImp();
		try {
			//walletService.registerNewUserWallet(wallet);
			System.out.println(walletService.withdrawFromWalletByEmailId("USA123@gmail.com",200.0));
		} catch (WalletException e) {
			System.out.println(e.getMessage());
		}
	}

}
