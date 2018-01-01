package guru.springframework;

import guru.springframework.controllers.ConstructorInjectedController;
import guru.springframework.controllers.GetterInjectedController;
import guru.springframework.controllers.MyController;
import guru.springframework.controllers.PropertyInjectedController;
import guru.springframework.datasource.FakeDataSource;
import guru.springframework.jms.FakeJmsSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

  public static void main(String[] args) {
    ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
    MyController controller = (MyController) ctx.getBean("myController");

      FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);
      FakeJmsSource fakeJmsSource = (FakeJmsSource) ctx.getBean(FakeJmsSource.class);
      System.out.println(fakeDataSource.getUsername());
      System.out.println(fakeDataSource.getPassword());
      System.out.println(fakeDataSource.getDburl());
      System.out.println(fakeJmsSource.getUsername());
      System.out.println(fakeJmsSource.getPassword());
      System.out.println(fakeJmsSource.getUrl());
    System.out.println(controller.getHello());
    System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
    System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
    System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
  }
}
