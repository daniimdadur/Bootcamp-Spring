package bootcampjavapamarican.spring.core.listener;

import bootcampjavapamarican.spring.core.event.LoginSuccessEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class UserListener {

    @EventListener(classes = LoginSuccessEvent.class)
    public void onLoginSuccessEvent(LoginSuccessEvent event){
        log.info("Success login again for user {}",event.getUser());
    }

    @EventListener(classes = LoginSuccessEvent.class)
    public void onLoginSuccessEvent1(LoginSuccessEvent event){
        log.info("Success login again for user {}",event.getUser());
    }
    @EventListener(classes = LoginSuccessEvent.class)
    public void onLoginSuccessEven2t(LoginSuccessEvent event){
        log.info("Success login again for user {}",event.getUser());
    }
}
