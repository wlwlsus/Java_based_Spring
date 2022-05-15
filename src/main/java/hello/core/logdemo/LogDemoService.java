package hello.core.logdemo;

import hello.core.common.MyLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Created by cadqe13@gmail.com on 2022-05-16
 * Blog : https://velog.io/@donsco
 * GitHub : https://github.com/wlwlsus
 */
@Service
@RequiredArgsConstructor
public class LogDemoService {

	private final MyLogger myLogger;

	public void logic(String id) {
		myLogger.log("service id = " + id);
	}

}
