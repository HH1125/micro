package cn.mldn;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
@EnableScheduling
@SpringBootApplication 
public class StartBootMain{
	public static void main(String[] args) {
		SpringApplication.run(StartBootMain.class, args) ;
	}
}
