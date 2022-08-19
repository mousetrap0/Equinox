package kr.co.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.vo.BoardVO;
import kr.co.vo.BreakVO;

/**
 * Handles requests for the application home page.
 */
@Controller
@CrossOrigin(origins = "http://localhost:3000")
public class JsonController {
	
	private static final Logger logger = LoggerFactory.getLogger(JsonController.class);
	
	@RequestMapping(value = "/tojson", method = RequestMethod.GET)
	public String toJson( Model model) throws JsonGenerationException, JsonMappingException, IOException {
		
		BreakVO brekVO = new BreakVO();
		
		brekVO.setBreakId(1234);
		brekVO.setBreakTime(new Date("2022/09/05"));
		brekVO.setLineId("123456780");
		
		ObjectMapper objectMapper = new ObjectMapper();

		logger.info("json file {}.", objectMapper.writeValueAsString(brekVO));
		
		model.addAttribute("tojson", objectMapper.writeValueAsString(brekVO) );
		
		return "tojson";
	}
}
