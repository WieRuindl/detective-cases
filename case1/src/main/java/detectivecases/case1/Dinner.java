package detectivecases.case1;

import detectivecases.case1.guests.James;
import detectivecases.case1.guests.Robert;
import detectivecases.case1.wines.Glass;
import detectivecases.case1.wines.Muscat;
import detectivecases.case1.wines.MuscatGlass;
import detectivecases.case1.wines.WhiteWine;
import detectivecases.case1.wines.WhiteWineGlass;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Dinner {
    // wines list
    @Bean
    @Qualifier("muscatGlass")
    public Glass<Muscat> muscatGlass() {
        return new MuscatGlass();
    }

    @Bean
    @Primary
    public Glass<WhiteWine> whiteWineGlass() {
        return new WhiteWineGlass();
    }

    // guests
    @Bean
    public James<WhiteWine> james() {
        return new James<>();
    }

    @Bean
    @Qualifier("muscatGlass")
    public Robert<Muscat> robert(Glass<Muscat> glass) {
        return new Robert<>(glass);
    }
}
