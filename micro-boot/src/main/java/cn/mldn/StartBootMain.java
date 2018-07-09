package cn.mldn;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication 
public class StartBootMain{
	static {
		System.setProperty("java.security.auth.login.config",
				"d:/kafka/kafka_client_jaas.conf"); 
	}
	public static void main(String[] args) {
		SpringApplication.run(StartBootMain.class, args) ;
	}
}
