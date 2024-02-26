package bootcampjavapamarican.spring.core.data;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Server {

    @PostConstruct //dipanggil ketika bean selesai dibuat.
    public void start(){
        log.info("Start Server");
    }

    @PreDestroy //dipanggil ketika bean akan dihancurkan.
    public void stop(){
        log.info("Stop Server");
    }
}
