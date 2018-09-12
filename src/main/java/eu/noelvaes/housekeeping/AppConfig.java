package eu.noelvaes.housekeeping;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.*;

import eu.noelvaes.housekeeping.services.*;

@Configuration
public class AppConfig {
   @Bean
   @Scope("prototype")
   @Primary
   public CleaningTool broom() {
      return new Broom();
   }

   @Bean
   @Scope("prototype")
   public CleaningTool vacuum() {
      return new VacuumCleaner();
   }

   @Bean
   @Scope("prototype")
   public CleaningTool sponge() {
      return new Sponge();
   }

   @Bean
   @Scope(value = "prototype", proxyMode = ScopedProxyMode.INTERFACES)
   public CleaningTool duster() {
      return new DisposableDuster();
   }

   @Bean
   public LawnMower lawnMower() {
      return new LawnMower();
   }

   @Bean(autowire = Autowire.BY_TYPE)
   public CleaningService cleaningService() {
      return new CleaningServiceImpl();
   }

   @Bean(autowire = Autowire.BY_TYPE, initMethod = "init", destroyMethod = "destroy")
   public GardeningService gardeningService() {
      return new GardeningServiceImpl();
   }

   @Bean(autowire = Autowire.BY_TYPE)
   public DomesticService domesticService() {
      return new DomesticServiceImpl();
   }
}
