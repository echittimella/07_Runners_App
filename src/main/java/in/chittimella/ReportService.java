package in.chittimella;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Service
public class ReportService {
	public ReportService() {
		System.out.println("ReportService :: constructor called");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("ReportService - init() called");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("ReportService - destroy() called");
	}
}
