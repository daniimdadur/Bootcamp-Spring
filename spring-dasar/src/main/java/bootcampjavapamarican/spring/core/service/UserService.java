package bootcampjavapamarican.spring.core.service;

import bootcampjavapamarican.spring.core.data.User;
import bootcampjavapamarican.spring.core.event.LoginSuccessEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class UserService implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
    public boolean login(String userName, String password){
        if (isLoginSuccess(userName,password)){
            applicationEventPublisher.publishEvent(new LoginSuccessEvent(new User(userName)));
            return true;
        } else {
            return false;
        }
    }

    private boolean isLoginSuccess(String userName, String password) {
        return "dani".equals(userName) && "dani".equals(password);
    }
}
