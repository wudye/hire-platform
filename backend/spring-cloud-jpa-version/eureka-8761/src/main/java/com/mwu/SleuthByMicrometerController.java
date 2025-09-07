package com.mwu;




import io.micrometer.tracing.Tracer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.actuate.autoconfigure.health.HealthEndpointProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/s")
@RestController
public class SleuthByMicrometerController {

    private final Tracer tracer;
    public SleuthByMicrometerController(Tracer tracer) {
        this.tracer = tracer;
    }

    private static final Logger logger = LoggerFactory.getLogger(SleuthByMicrometerController.class);
    @GetMapping("/hello")
    public String hello() {
        logger.info("This is an info log with Trace ID and Span ID");
        String traceId = tracer.currentSpan().context().traceId();
        return "Trace ID: " + traceId;
    }
}

