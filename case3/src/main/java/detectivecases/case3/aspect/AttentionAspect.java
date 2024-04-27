package detectivecases.case3.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AttentionAspect {

    @After("@annotation(detectivecases.case3.aspect.Attention)")
    public void sawSomethingSuspicious() {
        System.out.println("Now I understand how it works!");
    }

}
