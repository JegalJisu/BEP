package name.beptest.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import name.beptest.api.dao.TestDao;
import name.beptest.api.dto.TestDTO;

@Controller
@RequestMapping(value = "")
public class TestController {
	@Autowired
	private TestDao testDao;
	
	/*
	@GetMapping(value = "/test")
	@ResponseBody
	public List<TestDTO> test() {
		TestDTO testDto = new TestDTO();
		testDto.setNum((int)(Math.random() * 100));
		testDto.setText("TEST");
		testDao.save(testDto);
		
		return testDao.findAll();
	}
	*/
}
