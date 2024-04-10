package hello.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // hello.hellospring 패키지 하위에 있는 component(controller, servcie, repositoy)를 찾아 빈으로 자동 등록 한다.
public class HelloSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
	}

}
