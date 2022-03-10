package co.vendorflow.infrastructure.jasyptencryptutility;

import java.util.Scanner;

import org.jasypt.encryption.StringEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EncryptionRunner implements CommandLineRunner {

    @Autowired
    StringEncryptor encryptor;

    @Override
    public void run(String... args) throws Exception {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Value to encrypt (one line): ");
            System.out.flush();
            var input = sc.nextLine();
            var output = encryptor.encrypt(input);
            System.out.println("Encrypted value:");
            System.out.println(output);
        }
    }
}
